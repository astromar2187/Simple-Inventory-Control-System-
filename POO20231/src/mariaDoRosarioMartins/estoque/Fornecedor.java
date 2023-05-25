package mariaDoRosarioMartins.estoque;


/*Produtos são fornecidos por um Fornecedor, que tem CNPJ e nome. Seu construtor deve ter a seguinte assinatura:
public Fornecedor(int cnpj, String nome);
*/

public class Fornecedor {
	private int cnpj;
	private String nome;
	
	public Fornecedor(int cnpj, String nome) {
		this.cnpj = cnpj;
		this.nome = nome;
	};
	
	public int getCnpj() {
		return cnpj;
	}
	public String getNome() {
		return nome;
	}
	

}
