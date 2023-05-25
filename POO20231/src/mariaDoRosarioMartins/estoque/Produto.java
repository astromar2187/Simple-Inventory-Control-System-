package mariaDoRosarioMartins.estoque;

/*
Esse sistema deve possuir uma classe Produto, representando itens que podem estar a venda, por exemplo, em supermercados. 
Produtos devem ter código, descrição, preço de compra, preço de venda, lucro, quantidade, estoque mínimo. 

Seu construtor deve ter a seguinte assinatura:
public Produto(int cod, String desc, int min, double lucro, Fornecedor forn);

Produtos são fornecidos por um Fornecedor, que tem CNPJ e nome. Seu construtor deve ter a seguinte assinatura:
public Fornecedor(int cnpj, String nome);

Produtos devem ter o método “void compra(int quant, double val)”, que incrementa a quantidade e atualiza o 
atributo preço de compra. A atualização do preço de compra deve ser uma ponderação entre a quantidade existente e o preço de compra atual 
e a quantidade comprada e o novo preço. Exemplo: se havia 10 produtos com preço de compra R$2,5 e compramos mais 10 unidades do produto 
a R$7,50, então o novo preço deve ser (10 * 2.5 + 10 *. 7.5) / 20 = R$5.0.
*/

public class Produto {
	private Fornecedor fornecedor;
	private int codigo;
	private String descricao;
	private int qtd_min;
	private double preco_compra;	
	private double preco_venda;
	private double lucro;
	private int qtd;
	
	public Produto(int cod, String desc, int min, double lucro, Fornecedor forn) {
		this.codigo = cod;
		this.descricao = desc;
		this.qtd_min = min;
		this.lucro = lucro;
		this.fornecedor = forn; //Já que um fornecedor pode fornecer mais de um produto, não é necessário criar nenhuma regra (além de que o objeto seja do tipo Fornecedor) para 'setar' o fornecedor
	};
	
	
}
