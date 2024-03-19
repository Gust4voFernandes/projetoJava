<%-- 
    Document   : CadastroCidade
    Created on : 05/03/2024, 14:32:49
    Author     : 15937447654
--%>
<% //Todo código java
String nome = "Gustavo";
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Cidade</title>
    </head>
    <body>
        <h1>Cadastro de Cidade</h1>
       <%-- <form name="cadastro" method="get" action="CAECidade.jsp">// Get ezibe os dados/parametros na barra de endereço 
       <form name="cadastro"  method="post"  action="CAECidade.jsp"> // Post Não passa os parametros/dados na barra de endereço--%>
       <form name="cadastro"  method="get"  action="CAECidade.jsp">
            
            <p> <label>Cidade:<label/>
                <input type="text" name="nomeCidade" value="" size="40" />
            </p>
            
            <p> <label>UF:<label/>
                <input type="text" name="ufCidade" value="" size="5" />
            </p>
            
            <input type="submit" value="Cadastrar" name="Cadastrar" />
            
        </form>
    </body>
</html>
