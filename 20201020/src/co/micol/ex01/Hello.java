package co.micol.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Hello") //web.xml 에 추가해서 가능
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      request.setCharacterEncoding("utf-8");
	      response.setContentType("text/html; charset=UTF-8"); //한글깨짐 방지를 위해
	      
	      
	      String id = request.getParameter("id");
	      String pw = request.getParameter("pw");
	      String msq;
	      
	      if(id.equals("hong")) {
	    	  msq = "홍길동 님 환영합니다.";
	      }
	      else {
	    	  msq = "등록된 회원이 아닙니다.";
	      }
	    	 
	      
	      
	      
	      PrintWriter out = response.getWriter();
	      out.print("<html>");
	      out.print("<head>");
	      out.print("</head>");
	      out.print("<body>");
	      out.print("<p> First Servlet Program </p>");
	      out.print("<p> 아이디: "+ msq +"</p>");
	      
	      out.print("</body>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
