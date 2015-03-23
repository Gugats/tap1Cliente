package br.ucdb;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
	private static List<Cliente> clientes =  new ArrayList<Cliente>(); 
	public void salvar(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void excluir (int posicao){
		clientes.remove(posicao);
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

}