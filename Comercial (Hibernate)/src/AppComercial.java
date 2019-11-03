import modelo.Cliente;
import modelo.Produto;

public class AppComercial {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Willy E. Coitote");
		
		Produto peso = new Produto();
		peso.setDescricao("Peso de dez toneladas - 10t");
		peso.setQuantidadeEmEstoque(10);
		
		System.out.println(cliente);
		System.out.println(peso);
		
		System.exit(0);
	}

}
