<%@page import="modelo.Cidade"%>
<%@page import="modelo.DAOCidade"%>
<% //Cadastro Alteração Exclusão
String nomeCidade = request.getParameter("nomeCidade");
String ufCidade = request.getParameter("ufCidade");
String codigoCidade = request.getParameter("codigoCidade");
String opcao = request.getParameter("opcao");
String mensagem = "";

Cidade objCidade = new Cidade();
objCidade.setCodigoCidade(Integer.parseInt(codigoCidade));
objCidade.setNomeCidade(nomeCidade);
objCidade.setUfCidade(ufCidade);

DAOCidade objDAOCidade = new DAOCidade();
if(opcao.equals("cadastrar")){
    mensagem = objDAOCidade.inserirCidade(objCidade);
}   

if(opcao.equals("alterar")){
    //mensagem = objDAOCidade.inserirCidade(objCidade);
} 

if(opcao.equals("excluir")){
    //mensagem = objDAOCidade.inserirCidade(objCidade);
} 

mensagem = objDAOCidade.inserirCidade(objCidade);
response.sendRedirect("CadastroCidade.jsp?mensagem="+mensagem);

%>

<%= mensagem%>
