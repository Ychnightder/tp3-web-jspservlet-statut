package tp.tp3webjspservletstatut;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/statut")
public class StatutServlet extends HttpServlet {

    private String calculerStatut(int age){
        return age < 18 ? "mineur" : age <= 65 ? "majeur" : "Agé";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        try {
        String nom = request.getParameter("pNom");
        int age = Integer.valueOf(request.getParameter("pAge"));
        String Statut = calculerStatut(age);

//        System.out.println("DEBUG - Nom : " + nom);
//        System.out.println("DEBUG - Âge : " + age);
//        System.out.println("DEBUG - Statut : " + Statut);

        request.setAttribute("pNom", nom);
        request.setAttribute("pAge", age+" ");
        request.setAttribute("pStatut", Statut);

        RequestDispatcher rd = request.getRequestDispatcher("statutReponse.jsp");

            rd.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }
}
