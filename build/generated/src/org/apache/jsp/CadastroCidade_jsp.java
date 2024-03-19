package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.Cidade;
import modelo.DAOCidade;

public final class CadastroCidade_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/ListarCidade.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
 //Todo código java
String nomeCidade = request.getParameter("nomeCidade"); // Vem do ListarCidade.jsp
String ufCidade = request.getParameter("ufCidade");
String codigoCidade = request.getParameter("codigoCidade");
String opcao = request.getParameter("opcao");
String mensagem = request.getParameter("mensagem");// vem do CAECidade
if(opcao==null)opcao="cadastrar";

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro de Cidade</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastro de Cidade</h1>\n");
      out.write("       ");
      out.write("\n");
      out.write("       <form name=\"cadastro\"  method=\"get\"  action=\"CAECidade.jsp\">\n");
      out.write("            \n");
      out.write("            <p> <label>Cidade:<label/>\n");
      out.write("                    <input type=\"text\" name=\"nomeCidade\" value=\"");
      out.print( (nomeCidade==null)?"":nomeCidade);
      out.write("\" size=\"40\" /><!--Operador ternário-->\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <p> <label>UF:<label/>\n");
      out.write("                <input type=\"text\" name=\"ufCidade\" value=\"");
      out.print( (ufCidade==null)?"":ufCidade);
      out.write("\" size=\"5\" />\n");
      out.write("            </p>\n");
      out.write("            ");
if(opcao.equals("cadastrar")){
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Cadastrar\" name=\"Cadastrar\" />\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            \n");
      out.write("            ");
if(opcao.equals("alterar")){
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Alterar\" name=\"Alterar\" />\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            \n");
      out.write("            ");
if(opcao.equals("excluir")){
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Excluir\" name=\"Excluir\" />\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"codigoCidade\" value=\"");
      out.print( codigoCidade);
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"opcao\" value=\"");
      out.print( opcao);
      out.write("\">\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("            ");
      out.print( (mensagem==null)?"":mensagem);
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");

DAOCidade objDAOCidade = new DAOCidade();
List<Cidade> listaCidade = objDAOCidade.listarCidade();


      out.write("\n");
      out.write("\n");
      out.write("<table border=\"1\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>CODIGO</th>\n");
      out.write("            <th>NOME</th>\n");
      out.write("            <th>UL</th>\n");
      out.write("            <th>ALTERAR</th>\n");
      out.write("            <th>EXCLUIR</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
 for(Cidade cidade :listaCidade){ 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( cidade.getCodigoCidade() );
      out.write(" </td>\n");
      out.write("            <td>");
      out.print( cidade.getNomeCidade() );
      out.write(" </td>\n");
      out.write("            <td>");
      out.print( cidade.getUfCidade() );
      out.write(" </td>\n");
      out.write("            <td><a href=\"CadastroCidade.jsp?opcao=alterar&codigoCidade=");
      out.print( cidade.getCodigoCidade() );
      out.write(" &nomeCidade=");
      out.print( cidade.getNomeCidade() );
      out.write(" &ufCidade=");
      out.print( cidade.getUfCidade() );
      out.write("\">alterar</a></td>\n");
      out.write("            <td><a href=\"CadastroCidade.jsp?opcao=excluir&codigoCidade=");
      out.print( cidade.getCodigoCidade() );
      out.write(" &nomeCidade=");
      out.print( cidade.getNomeCidade() );
      out.write(" &ufCidade=");
      out.print( cidade.getUfCidade() );
      out.write("\">excluir </a></td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>");
      out.write(" <!--Concatena o Cdastro com o Listar-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
