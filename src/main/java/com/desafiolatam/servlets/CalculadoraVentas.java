package com.desafiolatam.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.models.Producto;


@WebServlet("/")
public class CalculadoraVentas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Se genera lista de productos
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();

		Producto producto01 = new Producto("Valvulas Titanio", "Valvulas de carrera", 120000, "valvula");
		Producto producto02 = new Producto("Turbo Full Carrera", "Turbo de competici�n multimarca", 1700000, "turbo");
		Producto producto03 = new Producto("Kit de Freno Competici�n", "Juego de discos, balatas, caliper de competici�n", 760000, "kit");
		Producto producto04 = new Producto("Sistema de Refrigeraci�n", "Sistema de enfriamiento de motor Carrera", 2300000, "sistema");
		Producto producto05 = new Producto("Plumillas limpiaparabrisas standar", "Plumillas para la lluvia", 10000, "plumilla");
		
		listaProductos.add(producto01);
		listaProductos.add(producto02);
		listaProductos.add(producto03);
		listaProductos.add(producto04);
		listaProductos.add(producto05);
		
		//TB listaProductos.add(new Producto("Valvulas Titanio", "Valvulas de carrera", 120000));
		
		request.setAttribute("listaProductos", listaProductos);
		request.getRequestDispatcher("formularioIngreso.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
