<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- 
    Gestión de Configuración del Software ( SCM )
    Autor: Juan Carlos Arguello Ortiz
    Version: 1.0
--%>
<html>   
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>SCM</title>
        <%-- En la etiqueta link realiza una referencia a una peticion de
            recursos (imagenes y texto css) mediane el contenedor de variable
            de referencia ${}
        --%>
        <link rel="icon" href="${pageContext.request.contextPath}/images/fpuna.ico" 
              type="image/x-icon" />
        <link rel="stylesheet"  type="text/css" 
              href="${pageContext.request.contextPath}/css/scm.css" />
    </head>
    <body class="landing">
        <div class="login_form medium" id="login_div">
            <div class="login_title">
                <p style="margin-left: 25px ">
                    <img alt="FPUNA" 
                       title="logo" src="<c:out value="${pageContext.request.contextPath}/images/fpuna.png"/>" 
                       width="90" height="85"  />
                    <br>SCM
                    <br>Release 1.0
                </p>
            </div>
            <!-- Formulario de login con los sgte campos nombre, contraseña
                y el boton de envio-->
            <form name="login" method="POST" action="index.htm">
                <div class="messages_rounded" style="width:100%;text-align:center;border-radius: 5px;">
                    Por favor registrarse ...</div>
                <div class="messages_rounded" style="width:100%;border-radius: 5px;">
                    <p class="label">Usuario<br>
                        <input type="text" name="usuario" value="" id="login" size="47" 
                               style="height: 18px;" maxlength="30" autofocus="true"  required />
                    </p>
                    <p class="label">Contrase&ntilde;a<br>
                        <input type="password" name="password" value="" style="height: 18px;"
                            size="47" maxlength="8" required/>
                    </p>
                    <input type="submit" name="login_submit" class="big_button" value="Iniciar Sesión" />
                </div>
            </form>
            <p>
                <a href="nuevoUsuario.htm">Nuevo Usuario</a><br>
                <a href="recuperarPassword.htm">¿Has olvidado su contraseña?</a><br>
            </p>
             <p>
                 <br>
                 <!-- Enlace al repositorio del proyecto-->
                 Proyecto de Gesti&oacute;n de configuraci&oacute;n del Software.
                 <a href="http://www.github.com">Acerca de</a><br>
            </p>   
        </div>
    </body>
</html>
