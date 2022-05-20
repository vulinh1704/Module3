import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns =  "/c0222h1")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int x = Integer.parseInt(request.getParameter("a"));
        int y = Integer.parseInt(request.getParameter("b"));
        int sum = x+ y;
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<html>"+sum+"</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usn = request.getParameter("usn");
        String password = request.getParameter("pass");
        PrintWriter printWriter = response.getWriter();
        if (usn.equals("admin") && password.equals("123")){
            printWriter.print("<html>"+"Hello Boss"+"</html>");
        } else {
            printWriter.print("<html>"+"Press again"+"</html>");
        }
    }
}
