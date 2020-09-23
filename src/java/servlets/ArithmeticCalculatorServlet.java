package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 822408
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");
        
        int firstNumInt;
        int secondNumInt;
        
        request.setAttribute("firstNum", firstNum);
        request.setAttribute("secondNum", secondNum);
        
        try {
            if (firstNum == null || firstNum.equals("") || secondNum == null || secondNum.equals("")) {
                request.setAttribute("result", "invalid");
            }
            else {
                firstNumInt = Integer.parseInt(firstNum);
                secondNumInt = Integer.parseInt(secondNum);
                
                if (request.getParameter("add") != null) {
                    request.setAttribute("result", (firstNumInt + secondNumInt));
                }
                if (request.getParameter("subtract") != null) {
                    request.setAttribute("result", (firstNumInt - secondNumInt));
                }
                if (request.getParameter("multiply") != null) {
                    request.setAttribute("result", (firstNumInt * secondNumInt));
                }
                if (request.getParameter("modulus") != null) {
                    request.setAttribute("result", (firstNumInt % secondNumInt));
                }
            }
        } catch (NumberFormatException nfe) {
            request.setAttribute("result", "invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

}
