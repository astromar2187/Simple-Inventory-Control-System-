package mariaDoRosarioMartins.estoque;

import java.util.Scanner;

/*
 Devemos implementar a classe Estoque. Ela será responsável por conter uma estrutura de dados de Produtos (use a que vc quiser!). 
 Uma descrição dos seus métodos é listada abaixo.

Métodos Classe Estoque

public class Estoque {

  public void incluir(Produto p);

  public void comprar(int cod, int quant, double preco);

  public double vender(int cod, int quant);

  public int quantidade(int cod);

  public Fornecedor fornecedor(int cod);

  public Produto[] estoqueAbaixoDoMinimo()

}

O método listarProdutosAbaixoDoMinimo() deve devolver um vetor de produtos cuja quantidade está abaixo do estoque mínimo para o produto.
 */

public class Estoque {
	
	public class No{
		private Produto prod;
		private No prox;
			
		public No(Produto prod) {
			this.prod = prod;
			this.prox = null;
		}
	
	
	private No inicio;
	
	
	public static void main(String[] args) {
		Estoque listaEstoque = new Estoque();
		Scanner sc = new Scanner(System.in);
		int op = -1;
		
		while(op!=0) {
			String menu = "Menu\n1.Incluir novo produto\n2.Realizar compra\n3.Realizar venda\n4.Verificar quantidade\n5.Verificar Fornecedor\n6.Produtos abaixo do minimo\n0.Sair\n";
			System.out.print(menu);
			op = Integer.parseInt(sc.nextLine());
			
			switch(op) {
			case 1: //Incluir produto
				System.out.println("***Incluindo novo produto***");
				System.out.println("Insira o código do produto: ");
				int cod = Integer.parseInt(sc.nextLine());
				System.out.println("Insira uma breve descrição do produto: ");
				String desc = sc.nextLine();
				System.out.println("Insira a quantidade mínima do produto: ");
				int min = Integer.parseInt(sc.nextLine());
				System.out.println("Insira o lucro esperado do produto: ");
				int lucro = Integer.parseInt(sc.nextLine());
				
				break;
			case 2://compra
				
				break;
			case 3://venda
				
				break;
				
			case 4://quantidade
				
				break;
			case 5://fornecedor
				
				break;
			case 6://produtos abaixo do minimo
				
				break;
			default:
				System.out.print("Opção inválida");
			}
				
		}
		
		sc.close();
		
	}
	
	
	public void incluir(Produto p) {
		No novoNo = new No(p);
	
		if(inicio==null) {
			inicio = novoNo;
		} else {
			No atual = inicio;
			while(atual.getProx()!=null) {
				atual = atual.getProx();
			}
			atual.setProx(novoNo);
		}
		
		
	}
	
	public void comprar(int cod, int quant, double preco) {
		
	}
	
	public double vender(int cod, int quant) {
		return 0.0;
	}
	
	public int quantidade(int cod) {
		
		return 0;
	}
	
	public Fornecedor fornecedor(int cod) {
		return null;
	}
	
	public Produto[] estoqueAbaixoDoMinimo() {
		return null;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}
	
	
}
}
