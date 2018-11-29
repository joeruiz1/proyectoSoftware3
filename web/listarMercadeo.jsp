<%-- 
    Document   : listarMercadeo
    Created on : 29/11/2018, 02:09:57 PM
    Author     : Labing
--%>

<%@page import="Modelo.genericoMercadeo"%>
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
                                <td>TIPO</td>
                                


                            </tr>
                            <%
                                if (request.getAttribute("lis") != null) {
                                    ArrayList<genericoMercadeo> em = (ArrayList<genericoMercadeo>) request.getAttribute("lis");

                                    if (em != null) {
                                        for (genericoMercadeo es : em) {

                            %>
                            <h1></h1>
                            <tr>  
                                <td><%=es.getMarca()%></td>
                                <td><%=es.getColor()%></td>
                                <td><%=es.getTipo()%></td>
                                
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
