<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
    <head>
        <title> Agrega Politico </title>
    </head>
    <body>
        <div>Entra los detalles del politico </div> 
            <form:form method="post" modelAttribute="politico">
                Nombre: <form:input type="text" name="nombre" path="nombre" 
                     required="required"/>
                     <form:input type="hidden" name="id" path="id" value="5"/>
                <input type="submit" class="btn" />
            </form:form>
    </body>
</html>