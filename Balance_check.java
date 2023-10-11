/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.develop.atm_interface;

import Dao.Db_operations;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author india
 */
@WebServlet("/balance")
public class Balance_check extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        String name = req.getParameter("name");
        String acc = req.getParameter("acc");
        String pin = req.getParameter("pin");

        int pin1 = Integer.valueOf(pin);
        pw.println("<html>");
        pw.println("<head>");
        pw.println("</head>");
        pw.println("<body>");
        //  pw.println("<h1 style='color:green'>Total Balance is :"+bal+"</h1>");
        // pw.println("<a href='http://localhost:9595/Atm_Interface/index.jsp'>Try Again</a>");
        pw.println("</body>");
        pw.println("</html>");

        try {
            ResultSet rs = Db_operations.bal(pin1);
            if (rs != null) {
                while (rs.next()) {
                    int pinn = rs.getInt("pin");
                    String name1 = rs.getString("name");
                    String acc1 = rs.getString("acc_no");

                    if (name.equals(name1) && acc.equals(acc1) && pin1 == pinn) {
                        int bal = rs.getInt("balance");
                        pw.println("<html>");
                        pw.println("<head>");
                        pw.println("</head>");
                        pw.println("<body>");
                        pw.println("<h1 style='color:green'>Total Balance is :" + bal + "</h1>");
                        pw.println("<a href='http://localhost:9595/Atm_Interface/index.jsp'style='color:blue;font-size:30px'>Go To Main Page</a>");
                        pw.println("</body>");
                        pw.println("</html>");

                    } else {
                        pw.println("<html>");
                        pw.println("<head>");
                        pw.println("</head>");
                        pw.println("<body>");
                        pw.println("<h1 style='color:red'>Details not Matched</h1>");
                        pw.println("<a href='http://localhost:9595/Atm_Interface/balance.jsp'style='color:blue;font-size:30px'>Try Again</a>");
                        pw.println("</body>");
                        pw.println("</html>");
                    }

                }

            } else {

            }
        } catch (Exception e) {
        }
    }

}
