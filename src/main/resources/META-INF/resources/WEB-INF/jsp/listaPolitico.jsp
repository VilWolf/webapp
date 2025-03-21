<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title> Lista Politicos </title>
    </head>
    <body>
        <div>Welcome to my page: ${name}</div> 
        <hr>
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>nombre</th>
                    <th>apellido</th>
                    <th>apodo</th>
                    <th>edad</th>
                </tr>
            </thead>
            <tbody>
                
                <c:forEach items="${politicos}" var="politico">
                    <tr>
                        <td>${politico.id}</td>
                        <td>${politico.nombre}</td>
                        <td>${politico.apellido}</td>
                        <td>${politico.apodo}</td>
                        <td>${politico.edad}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>