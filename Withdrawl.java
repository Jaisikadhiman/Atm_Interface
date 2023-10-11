/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.develop.atm_interface;

import Dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

/**
 *
 * @author india
 */
@WebServlet("/withdrawl")
public class Withdrawl extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String amount = req.getParameter("amount");

        String pin = req.getParameter("pin");
        int pinn = Integer.valueOf(pin);
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        //out.println("<h1>this page content forward to next page</h1>");

        out.println("</body>");
        out.println("</html>");
        try {
            ResultSet rs = Db_operations.get_details(pinn);
            //out.print(rs);
            if (rs != null) {
                while (rs.next()) {

                    int pin1 = rs.getInt("pin");
                    int amt1 = rs.getInt("balance");

                    int amt = Integer.valueOf(amount);

                    if (pinn == pin1) {
                        if (amt < amt1) {
                            int left = amt1 - amt;
                            // String left1 = String.valueOf(left);
                            int i = Db_operations.update_withdrawl(pinn, left);
                            if (i > 0) {
                                out.println("<html>");
                                out.println("<head>");
                                out.println("</head>");
                                out.println("<body>");
                                out.println("<h1 style='color:green'>withdrawl successfully</h1>");
                                out.println("<a href='http://localhost:9595/Atm_Interface/index.jsp'>Go to Main Page</a>");
                                out.println("</body>");
                                out.println("</html>");
                            } else {
                                out.println("<html>");
                                out.println("<head>");
                                out.println("</head>");
                                out.println("<body>");
                                out.println("<h1 style='color:red'>withdrawl Failed</h1>");
                                out.println("<a href='http://localhost:9595/Atm_Interface/withdrawl.jsp'>Try Again</a>");
                                out.println("</body>");
                                out.println("</html>");
                            }
                        } else {
                            out.println("<html>");
                            out.println("<head>");
                            out.println("</head>");
                            out.println("<body>");
                            out.println("<h1 style='color:red'>Not Sufficient Balance</h1>");
                            out.println("<a href='http://localhost:9595/Atm_Interface/withdrawl.jsp'>Try Again</a>");
                            out.println("</body>");
                            out.println("</html>");
                        }
                    }

                }

            } else {
                out.print("wrong pin");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
