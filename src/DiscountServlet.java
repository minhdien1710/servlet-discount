import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/calculate")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int amount = Integer.parseInt(request.getParameter("amount"));
        int price = Integer.parseInt(request.getParameter("price"));
        int discount = Integer.parseInt(request.getParameter("discount"));

        int total = amount*price;
        int amountDiscount = total*discount/100;
        int result = total - amountDiscount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>so luong: " + amount + "</h1>");
        writer.println("<h1>Gia san pham: " + price + "</h1>");
        writer.println("<h1>Chiet khau(%): " + discount + "</h1>");
        writer.println("<h1>So tien da giam: " + amountDiscount + "</h1>");
        writer.println("<h1>So tien phai thanh toan: " + result + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
