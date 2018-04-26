import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String product_name = request.getParameter("product_des");
        double list_price = Double.parseDouble(request.getParameter("price"));
        double discount_percent = Double.parseDouble(request.getParameter("discount_percent"));

        double discount_amont = list_price * discount_percent *0.1;
        double discount_price =  list_price - discount_amont;

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Product Description:"+product_name+"</h1>");
        printWriter.println("<h1>Price:"+list_price+" </h1>");
        printWriter.println("<h1>Discount Percent: "+discount_percent+"</h1>");
        printWriter.println("<h1>Discount Amount:"+discount_amont+" </h1>");
        printWriter.println("<h1>Discount Price:"+discount_price+" </h1>");
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
