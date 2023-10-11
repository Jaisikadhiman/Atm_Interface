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
@WebServlet("/pin")
public class Pin_change extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String old = req.getParameter("old");
        String neww = req.getParameter("new");
        String confirm = req.getParameter("confirm");
        int old1 = Integer.valueOf(old);
        int neww1 = Integer.valueOf(neww);
        int confirm1 = Integer.valueOf(confirm);

        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("</body>");
        out.println("</html>");

        ResultSet rs = Db_operations.get_details(old1);
        if (neww1 == confirm1) {
            int i = Db_operations.update_pin(old1, confirm1);
            if (i > 0) {
                out.println("<html>");
                out.println("<head>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1 style='color:green'>Pin Changed</h1>");
                out.println("<a href='http://localhost:9595/Atm_Interface/index.jsp'>Go to Main Page</a>");
                out.println("</body>");
                out.println("</html>");
            }else{
                 out.println("</html>");
            }
        } else {
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='color:red'>New And Confirm Pass Not Match</h1>");
            out.println("<a href='http://localhost:9595/Atm_Interface/pin_change.jsp'>Try Again</a>");
            out.println("</body>");
            out.println("</html>");
        }

    }
}
