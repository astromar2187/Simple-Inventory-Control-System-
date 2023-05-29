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

O preço de venda deve ser um percentual acima do preço de compra. Esse percentual será definido na criação do produto e será um atributo 
da classe, denominado lucro. Toda vez que o preço de compra atualizar, devemos atualizar também o preço de venda, com o lucro aplicado ao 
preço de compra. Exemplo: se o preço de compra de um produto é R$4 e o lucro é 50% (0.5), então o seu preço de venda deveria ser R$6.

A operação de venda deve ser feita pelo preço de venda atual, retornando o valor (quantidade vendida x preço de venda) e decrementando a 
quantidade de itens do produto. A venda só pode ser realizada se houver itens no estoque. Se for tentando uma venda acima da quantidade, 
a venda não deve ser realizada. Como sinalização do problema, o método deve retornar o valor -1.


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
	
	void compra(int quant, double val) {
		if(quant>0 && val>0) {
			preco_compra = (qtd*preco_compra + val*quant)/(qtd+quant);
			qtd = qtd + quant;
			
			preco_venda = preco_compra*(1+lucro/100);
		} else {
			System.out.println("Pelo menos um dos valores inseridos não é válido");
		}
		
	}
	
	double venda(int quant) {
		if(qtd>=quant && quant>0) {
			qtd = qtd - quant;
			return quant*preco_venda;
		} else {
			System.out.println("O valor inserido não é válido");
			return -1;	
		}
	}
	
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtd_min() {
		return qtd_min;
	}

	public void setQtd_min(int qtd_min) {
		this.qtd_min = qtd_min;
	}

	public double getPreco_compra() {
		return preco_compra;
	}

	public void setPreco_compra(double preco_compra) {
		this.preco_compra = preco_compra;
	}

	public double getPreco_venda() {
		return preco_venda;
	}

	public void setPreco_venda(double preco_venda) {
		this.preco_venda = preco_venda;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	
	
	
	
	
}
