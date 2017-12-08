package webapp;

import appLayer.User;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login")
public class login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("login", request.getParameter("login"));
        request.setAttribute("password", request.getParameter("password"));

        User user = new User(request.getParameter("login"), request.getParameter("password"));
        if (user.isValid())
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        else {
            request.setAttribute("errorMessage", "Invalid credentials!");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("Login: " + request.getParameter("login") + "\nPassword: " + request.getParameter("password"));
    }
}
