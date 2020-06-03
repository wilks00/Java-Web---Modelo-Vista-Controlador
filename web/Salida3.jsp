<%-- 
    Document   : Salida3
    Created on : 31-05-2020, 01:09:04 PM
    Author     : usuario
--%>

<%@page import="com.emergentes.modelo.RegistroProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    RegistroProducto pro = (RegistroProducto) request.getAttribute("miPro");
%>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>☠☠ SWQC-P3 ☠☠</title>
    </head>
    <body>
        <h1>Registro De Productos</h1>
        	<br>
	<table border>
		<tr>
			<td>Producto</td>  
                        <td>Categoria</td>
                        <td>Existencia</td> 
                        <td>Precio</td> 
		</tr>
                <tr>
			<td><%= pro.getProducto() %></td>
                        
                                      <%
                            String[] rec = pro.getCategoria();
                            if(rec != null){
                                for(int i=0 ; i < rec.length ; i++)
                                {
                        %>
                            <td><%= rec[i] %></td>
                        <%
                                }
                            }
                        %>
                        
                        <td><%= pro.getExistencia() %> Unidades</td>
                        
                        <td><%= pro.getPrecio() %> bs</td>
		<tr>
	       
	</table>
    </body>
</html>
