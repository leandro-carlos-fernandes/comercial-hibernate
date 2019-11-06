package modelo;

import java.util.HashSet;
import java.util.Set;

public class Venda {

	private int nf;
	private Cliente cliente;
	private Set<Item> itens;

	public Venda() {
		this.itens = new HashSet<Item>();
	}

	public int getNf() {
		return nf;
	}

	public void setNf(int nf) {
		this.nf = nf;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Item> getItens() {
		return itens;
	}

	public void setItens(Set<Item> itens) {
		this.itens = itens;
	}

	public void addItem(Item item) {
		this.itens.add(item);
	}
	
	@Override
	public String toString() {
		String msg =  "+--------------------------------------------------------------+\n"
					+ " Cliente: " + cliente + "\n"
					+ "+--------------------------------------------------------------+\n"
					+ " Produto\t\tQtde\tPreço Un.\tPreço Total\n";
		for (Item item : itens)
			msg += " " + item + "\n";
		msg += "+--------------------------------------------------------------+";
		
		return msg;
	}
}
