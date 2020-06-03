/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.controladores;

import com.emergentes.modelo.RegistroUsuario;
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
@WebServlet(name = "ServletControlador2", urlPatterns = {"/ServletControlador2"})
public class ServletControlador2 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String[] cursos = request.getParameterValues("cursos");
        String correo = request.getParameter("correo");
        String clave = request.getParameter("clave");
       
        
         RegistroUsuario obj2 = new RegistroUsuario();
        
        obj2.setNombre(nombre);
        obj2.setApellido(apellido);
        obj2.setCorreo(correo);
        obj2.setClave(clave);
        
        request.setAttribute("miReg", obj2);
        
        request.getRequestDispatcher("Salida2.jsp").forward(request, response);
    }

}
