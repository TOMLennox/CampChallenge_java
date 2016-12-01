/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class kadai extends HttpServlet {

    Answer ans = new Answer();
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        ans.setOut(out);
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadai</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //課題1
            out.println("<h1>課題1</h1>");
            out.println("<p>");
            for(int i=0; i<10; i++){
                ans.introduce_1();
            }
            out.println("</p>");
            
            //課題2
            out.println("<h1>課題2</h1>");
            out.println("<p>");
            ans.evenOrOdd_2(2);
            out.println("</p>");
            
            out.println("<h1>Servlet kadai at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            //課題3
            out.println("課題3");
            out.println("<p>");
            ans.calc_3(2,5,true);
            out.println("</p>");
            
            //課題4
            out.println("課題4");
            out.println("<p>");
            if(ans.introduce_4()){
                out.println("この処理は正しく実行できました");
            }else{
                out.println("正しく実行できませんでした");
            }
            out.println("</p>");    
            
            //課題5
            out.println("課題5");
            out.println("<p>");
            String[] profile_5 = ans.getPrifile_5();
            for(int i=1; i<profile_5.length;i++){
                out.println(profile_5[i] + "<br>");
            }
            out.println("</p>");
            
            //課題6
            out.println("<h1>課題6</h1>");
            out.println("<p>");
            String[] profile_6 = ans.getProfile_6(1);
            for(int i = 0; i < profile_6.length; i++){
                out.println(profile_6[i]+"<br>");
            }
            out.println("</p>");
                        

            //課題7
            out.println("<h1>課題7</h1>");
            out.println("<p>");
            String[] profile_7;
            
            for(int i = 1;i < 4; i++){
                profile_7 = ans.getProfile_7(i);
                for(int j = 0; j < profile_7.length; j++){
                    if(profile_7[j] == null){
                        continue;
                    }
                    out.println(profile_7[j] + "<br>");
                }
            }
            out.println("</p>");
            
            //課題8
            out.println("<h1>課題8</h1>");
            out.println("<p>");
            int limit = 2;
            String[] profile_8;
            
            for(int j = 1; j <= limit; j++){
                profile_8 = ans.getProfile_8(j);
                for(int i = 0; i < profile_8.length; i++){
                    if(profile_8[i] == null){
                        continue;
                    }
                    out.println(profile_8[i] + "<br>");
                }
            }
                
            out.println("</p>");
            
            out.println("</body>");
            out.println("</html>");
             
        } finally {
            out.close();
        }
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
