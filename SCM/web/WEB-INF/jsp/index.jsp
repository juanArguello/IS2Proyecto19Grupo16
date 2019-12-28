<%-- 
    Document   : index
    Created on : 10-nov-2019, 20:41:39
    Author     : Juan Carlos Arguello
--%>

<%-- Pagina principal de la aplicacion. El archivo index.jsp sera mapeado
    a un documento index.htm --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${datos}" var="dato">
                    <tr>
                        <td>
                            <c:out value="${dato.id}" />
                        </td>
                        <td>
                            <c:out value="${dato.nombre_permiso}" />
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
