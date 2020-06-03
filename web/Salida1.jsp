<%-- 
    Document   : Salida1
    Created on : 30-05-2020, 10:15:39 PM
    Author     : usuario
--%>

<%@page import="com.emergentes.modelo.InscripcionCurso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   InscripcionCurso Insc = (InscripcionCurso) request.getAttribute("miInsc");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>☠☠ SWQC-P3 ☠☠</title>
    </head>
    <body>
        <h1>Datos Registrados</h1>
        <br>
        <p>su Nombre es: <%= Insc.getNombre() %></p>
	<p>su Apellido es: <%= Insc.getApellido() %></p>

	 <%
            String[] Cur = Insc.getCursos(); 
                  if(Cur != null){
                      for(int i=0; i< Cur.length; i++)
                      {
                  %>
                  <p>Curso Inscrito:<%= Cur[i] %></p>
       <%
          }
        }
        %>
    </body>
</html>
