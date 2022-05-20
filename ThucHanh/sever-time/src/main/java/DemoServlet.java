import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DemoServlet", value = "/home")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usn = request.getParameter("usn");
        String pass = request.getParameter("pass");
        RequestDispatcher requestDispatcher = null;
        if (usn.equals("admin")&& pass.equals("123")){
            requestDispatcher = request.getRequestDispatcher("hello.jsp");
            request.setAttribute("ten" , usn);
        } else {
            requestDispatcher = request.getRequestDispatcher("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
