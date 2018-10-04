package br.com.mach.gerenciadorr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//olaa
@WebServlet(urlPatterns="/olaa")  //	http://localhost:8080/gerenciadorr/olaa
public class OlaMunadoServlets extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("--->>> Ola Mundo Servlets... ");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("_Foi chama do Servlet OlaMundoVServlet !!!");
		
	}
	

}