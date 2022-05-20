import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/login")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        if ("admin".equals(username) && "admin".equals(password)){
            printWriter.println("<h1>Welcome " + username + " to website</h1>");
        } else {
            printWriter.println("<h1>Login Error</h1>");
        }
        printWriter.println("</html>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        if ("admin".equals(username) && "admin".equals(password)){
            printWriter.println("<h1>Welcome " + username + " to website</h1>");
        } else {
            printWriter.println("<h1>Login Error</h1>");
        }
        printWriter.println("</html>");
    }
}
