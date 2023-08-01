package model;

import java.util.ArrayList;

import Model.Cliente;
import Model.Produto;

public class Carrinho {

	private Cliente cliente;
	private float valorTotal;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private ArrayList<String> quantidades = new ArrayList<String>();

	
	public Carrinho(Cliente cliente) {
		setCliente(cliente);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto produtos) {
		this.produtos.add(produtos);
	}

	public ArrayList<String> getQuantidades() {
		return quantidades;
	}
	public void setQuantidades(ArrayList<String> quantidades) {
		this.quantidades = quantidades;
	}

	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
