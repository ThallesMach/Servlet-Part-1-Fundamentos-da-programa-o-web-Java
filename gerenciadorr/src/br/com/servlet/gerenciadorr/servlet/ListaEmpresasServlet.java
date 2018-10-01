package br.com.servlet.gerenciadorr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		// Criando uma Lista das Empresa cadastradas com Loop Foreach
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<url>");
		for (Empresa empresa : lista) {
			out.print("<li>" + empresa.getNome() + "</li>");
		}
		out.println("</url>");
		out.println("</body></html");
	}

}
