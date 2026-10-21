package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/vehiculo")
public class VehiculoServlet extends HttpServlet {

    // Método POST: recibe los datos enviados desde el formulario HTML
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String placa = request.getParameter("placa");
        String tipo = request.getParameter("tipo");

        request.setAttribute("placa", placa);
        request.setAttribute("tipo", tipo);

        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }

    // Método GET: permite comprobar que el Servlet responde mediante GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>ParkQR</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>ParkQR</h1>");
        out.println("<h2>Consulta de vehículos</h2>");
        out.println("<p>El método GET funciona correctamente.</p>");
        out.println("<br>");
        out.println("<a href='index.html'>Volver al registro</a>");

        out.println("</body>");
        out.println("</html>");
    }
}