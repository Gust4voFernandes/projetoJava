<%@page import="modelo.Cidade"%>
<%@page import="modelo.DAOCidade"%>
<% //Cadastro Altera��o Exclus�o
String nome = request.getParameter("nomeCidade");
String uf = request.getParameter("ufCidade");
String mensagem = "";

Cidade objCidade = new Cidade();
objCidade.setNomeCidade(nome);
objCidade.setUfCidade(uf);

DAOCidade objDAOCidade = new DAOCidade();
mensagem = objDAOCidade.inserirCidade(objCidade);
%>

<%= mensagem%>
