/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.controladores;

import com.emergentes.modelo.InscripcionCurso;

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
@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {
    
    
    //@Override
   // protected void doGet(HttpServletRequest request, HttpServletResponse response)
          //  throws ServletException, IOException {
      
  //  }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String[] cursos = request.getParameterValues("cursos");
        String correo = request.getParameter("correo");
        String clave = request.getParameter("clave");
        
        InscripcionCurso obj1 = new InscripcionCurso();
       
        
        obj1.setNombre(nombre);
        obj1.setApellido(apellido);
        obj1.setCursos(cursos);
        
        request.setAttribute("miInsc", obj1);
        
        request.getRequestDispatcher("Salida1.jsp").forward(request, response);
        
       
      
    }

}
