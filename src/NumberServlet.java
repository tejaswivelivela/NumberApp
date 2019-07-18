

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NumberServlet
 */
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
response.setContentType("text/html");
int n1 = Integer.parseInt(request.getParameter("t1"));
int n2 = Integer.parseInt(request.getParameter("t2"));
String button = request.getParameter("click");
if(button.equals("ADD")){
	out.println("result:"+(n1+n2));
}
else
	{
	out.println("result:"+(n1-n2));
	}
	}

}
