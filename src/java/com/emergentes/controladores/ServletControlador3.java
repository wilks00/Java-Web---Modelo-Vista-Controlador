/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.controladores;

import com.emergentes.modelo.RegistroProducto;
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
@WebServlet(name = "ServletControlador3", urlPatterns = {"/ServletControlador3"})
public class ServletControlador3 extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String producto = request.getParameter("producto");
       String[] categoria = request.getParameterValues("categoria");
       int existencia = Integer.parseInt(request.getParameter("existencia"));
       int precio = Integer.parseInt(request.getParameter("precio"));
       
       RegistroProducto obj3 = new RegistroProducto();
       
       obj3.setProducto(producto);
       obj3.setCategoria(categoria);
       obj3.setExistencia(existencia);
       obj3.setPrecio(precio);
       
       request.setAttribute("miPro", obj3);
       
       request.getRequestDispatcher("Salida3.jsp").forward(request, response);
    }

}
