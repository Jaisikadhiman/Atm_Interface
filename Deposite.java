/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.develop.atm_interface;

import Dao.Db_operations;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author india
 */
@WebServlet("/deposite")
public class Deposite extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int total = 0;
        
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String acc = req.getParameter("acc");
        String date = req.getParameter("date1");
        String amount = req.getParameter("amount");
        int amt = Integer.valueOf(amount);
         out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        //out.println("<h1>this page content forward to next page</h1>");

        out.println("</body>");
        out.println("</html>");
//        out.println(name);
//        out.println(acc);
//        out.println(date);
//        out.println(amount);
        ResultSet rs = Db_operations.get_info(acc);
       
        try {
            if (rs != null) {
                while (rs.next()) {
                    int bal = rs.getInt("balance");
                    total = bal + amt;

                }
            }
            out.println("total:" + total);
            int i = Db_operations.update_amt(acc, name, total);

            if (i > 0) {
                out.println("<html>");
                out.println("<head>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1 style='color:green'>Amount deposite successfully</h1>");
                out.println("<a href='http://localhost:9595/Atm_Interface/index.jsp'>Go to Main Page</a>");
                out.println("</body>");
                out.println("</html>");

            }else{
                 out.println("<html>");
                out.println("<head>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1 style='color:green'>Not deposite</h1>");
                out.println("<a href='http://localhost:9595/Atm_Interface/deposite.jsp'>Go to Main Page</a>");
                out.println("</body>");
                out.println("</html>");
            }
        } catch (Exception e) {
        }

    }

}
