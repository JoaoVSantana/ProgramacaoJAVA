package model;

import java.util.ArrayList;

public class Carrinho {
	
//	private Cliente cliente;
	private ArrayList <Produto> produto = new ArrayList<>();
	private ArrayList <Integer> quantidade = new ArrayList<Integer>();
	private double valorTotal;
	
//	public Carrinho (Cliente cliente) {
//		setCliente(cliente);
//	}
	
	public Carrinho() {
		
	}
	
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}
	
	public void addCarrinho (Integer cquantidade, Produto cproduto) {
		produto.add(cproduto);
		quantidade.add(cquantidade);
	}
	
	public void removeCarrinho (Integer cquantidade, Produto cproduto) {
		
	}

}
