/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Classes.Animal;
import Classes.Chat;
import Classes.Chien;
import Classes.Oiseau;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rivière Eloi
 */
@WebServlet(name = "creation", urlPatterns = {"/creation"})
public class Creation extends HttpServlet {
    
    private static List<Animal> animaux;

    
    @Override
    public void init()
            throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        animaux = new ArrayList(); 
    }
    
    public static List<Animal> getAnimaux()
    {
        return animaux;
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /* response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet creation</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet creation at " + request.getContextPath() + "</h1>");
            out.println("<a href=\"index.html\"><button>Nique toi</button></a>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nom = request.getParameter("Nom");
        String race = request.getParameter("Animal");
        Animal animal = null;
        
        switch(race) { 
            case "Chat": 
                 animal = new Chat(nom,race);
                break; 
            case "Chien": 
                animal = new Chien(nom,race);
                break;
            case "Oiseau":
                animal = new Oiseau(nom,race);
                break;
            default:
                try (PrintWriter out = response.getWriter()) {
                    out.println("<p>La race n'est pas reconnue.</p>");
                }
                
        }
            
        animaux.add(animal);
        
        response.setContentType("text/html;charset=UTF-8");   
        try (PrintWriter out = response.getWriter()) {
            out.println("<p>Vous venez de créer " + nom + " le " + race + "</p>");
            out.println("<a href=\"index.html\"><button>Ajouter un nouvel animal</button></a>");
            out.println("<form name=\"Affichage\" method=\"POST\" action=\"affichage\"><input type=\"submit\" value=\"Afficher la liste\" name=\"operateur\"/></form>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
