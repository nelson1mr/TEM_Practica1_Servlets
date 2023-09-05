package com.emergentes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespCSV", urlPatterns = {"/RespCSV"})
public class RespCSV extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("application/csv");
       response.setHeader("Content-Disposition", "attachment; filename=NelsonMamaniRamos.csv");
       PrintWriter out = response.getWriter();
       try{
           out.println("id;nombre;apellidos;edad");
           out.println("1;NELSON;MAMANI RAMOS;24");
       } finally {
           out.close();
       }
    }
}

