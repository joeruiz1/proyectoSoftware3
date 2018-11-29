<%-- 
    Document   : listarVentas
    Created on : 28/11/2018, 05:54:46 PM
    Author     : Labing
--%>

<%@page import="Modelo.ventas"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="wrapper">
            <section>
                <div class="container">
                    <div class="dynamicContent">
                        <!--content-->
                        <h1>Registro de ventas</h1>
                        <table>
                            <tr>
                                <td>MARCA</td>
                                <td>COLOR</td>
                                <td>PRECIO</td>
                                <td>IDCONCESIONARIO</td>
                                <td>TIPO DE AUTO</td>


                            </tr>
                            <%
                                if (request.getAttribute("lis") != null) {
                                    ArrayList<ventas> em = (ArrayList<ventas>) request.getAttribute("lis");

                                    if (em != null) {
                                        for (ventas es : em) {

                            %>
                            <h1></h1>
                            <tr>  
                                <td><%=es.getIdVentas()%></td>
                                <td><%=es.getIdConsecionario()%></td>
                                <td><%=es.getIdCarro()%></td>
                                
                            </tr>

                            <%

                                        }
                                    }
                                }
                            %>

                        </table>
                    </div>
                </div>
            </section>
        </div>
        <script type="text/javascript" src="js/bootstrap.js"></script>
        <script>
            $(".fancybox").fancybox({});
        </script>
        <h2><a href="index.jsp"> volver al menu</a></h2>

    </body>
</html>
