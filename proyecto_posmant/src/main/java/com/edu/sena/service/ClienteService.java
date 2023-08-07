package com.edu.sena.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.sena.entity.Cliente;

@Service
public class ClienteService {
	
	//Listado clientes
	
	private List<Cliente> clientes;
	
	public ClienteService() {
	
		clientes = new ArrayList<>(); 
	    clientes.add(new Cliente(1,"pedro","perez","cale 11 # 12-4","pedroperez@correo.com",312457845));
	    clientes.add(new Cliente(2,"pablo","peña","cale 45 # 1-4","pablopeña@correo.com",45124578));
	    clientes.add(new Cliente(3,"maria","suarez","carrera 25 # 45-58","mariasuarez@correo.com",314542124));
	    clientes.add(new Cliente(4,"clara","rojas","cale 86 # 45-45","clararojas@correo.com",604745125));
	}
	
	public List<Cliente> list(){
		return clientes;
		
	}
	
	//Buscar clientes
	
	
	public Cliente find(int id) {
		for (Cliente cliente : clientes) {
			if (cliente.getId()== id) {
				return cliente;
			}
		}
		return null;
	}
	
	//Crear clientes
	
	public Cliente save(Cliente cli) {
		clientes.add(cli);
		return cli;
		
	}
	
	//Actualizar clientes
	
	public Cliente update(int id, Cliente cli) {
		int index = 0;
		for (Cliente l: clientes) {
			if (l.getId()== id) {
				cli.setId(id);
				clientes.set(index, cli);
			}
		}
	
	return cli;
	
	}
	
	
	//Eliminar clientes
	
	public boolean delete(int id) {
		for (Cliente c : clientes) {
			if(c.getId()== id) {
				return clientes.remove(c);
				
			}
		}
		return false;
	}
}













