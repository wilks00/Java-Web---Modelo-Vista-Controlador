/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.controladores;

import com.emergentes.modelo.RegistroLibro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@WebServlet(name = "ServletControlador4", urlPatterns = {"/ServletControlador4"})
public class ServletControlador4 extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String titulo = request.getParameter("titulo");
       String autor = request.getParameter("autor");
       String resumen = request.getParameter("resumen");
       String[] medio = request.getParameterValues("medio");
       
       RegistroLibro obj4 = new RegistroLibro();
       
       obj4.setTitulo(titulo);
       obj4.setAutor(autor);
       obj4.setResumen(resumen);
       obj4.setMedio(medio);
       
       request.setAttribute("miLib", obj4);
       
       request.getRequestDispatcher("Salida4.jsp").forward(request, response);
    }


}
