package mariaDoRosarioMartins.estoque;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void testeCompraEAttPrecoCompra() {
		Fornecedor forn1 = new Fornecedor(123, "fornecedor margaridas");
		Produto macarrao = new Produto(1, "Pacote de macarrão espaguete", 10, 30, forn1);
		
		int quantidade_inic = macarrao.getQtd();
		double preco_inicial = macarrao.getPreco_compra();
		assertEquals(0, quantidade_inic);
		assertEquals(0.0, preco_inicial, 0.00001);
		
		macarrao.compra(10, 2.5);
		assertEquals(10, macarrao.getQtd());
		assertEquals(2.5, macarrao.getPreco_compra(), 0.00001);
	
		macarrao.compra(10, 7.5);
		assertEquals(20, macarrao.getQtd());
		assertEquals(5.0, macarrao.getPreco_compra(), 0.00001);
		
	}
	
	@Test
	public void testeCompraEAttPrecoVenda() {
		Fornecedor forn1 = new Fornecedor(123, "fornecedor margaridas");
		Produto macarrao = new Produto(1, "Pacote de macarrão espaguete", 10, 50, forn1);
		
		int quantidade_inic = macarrao.getQtd();
		double preco_inicial = macarrao.getPreco_compra();
		assertEquals(0, quantidade_inic);
		assertEquals(0.0, preco_inicial, 0.00001);
		
		macarrao.compra(10, 4.0);
		assertEquals(10, macarrao.getQtd());
		assertEquals(4.0, macarrao.getPreco_compra(), 0.00001);
		assertEquals(6.0, macarrao.getPreco_venda(), 0.00001);
		
		
	}
	
	@Test
	public void testeVenda() {
		Fornecedor forn1 = new Fornecedor(123, "fornecedor margaridas");
		Produto macarrao = new Produto(1, "Pacote de macarrão espaguete", 5, 50, forn1);
		
		int quantidade_inic = macarrao.getQtd();
		double preco_inicial = macarrao.getPreco_compra();
		assertEquals(0, quantidade_inic);
		assertEquals(0.0, preco_inicial, 0.00001);
		
		macarrao.compra(10, 4.0);
		assertEquals(10, macarrao.getQtd());
		assertEquals(4.0, macarrao.getPreco_compra(), 0.00001);
		assertEquals(6.0, macarrao.getPreco_venda(), 0.00001);
		
		double valorVenda = macarrao.venda(5);
		assertEquals(5, macarrao.getQtd());
		assertEquals(4.0, macarrao.getPreco_compra(), 0.00001);
		assertEquals(6.0, macarrao.getPreco_venda(), 0.00001);
		assertEquals(30.0, valorVenda, 0.00001);
	}
	
	@Test
	public void testeVendaQuantComProblem() {
		Fornecedor forn1 = new Fornecedor(123, "fornecedor margaridas");
		Produto macarrao = new Produto(1, "Pacote de macarrão espaguete", 5, 50, forn1);
		
		int quantidade_inic = macarrao.getQtd();
		double preco_inicial = macarrao.getPreco_compra();
		assertEquals(0, quantidade_inic);
		assertEquals(0.0, preco_inicial, 0.00001);
		
		macarrao.compra(10, 4.0);
		assertEquals(10, macarrao.getQtd());
		assertEquals(4.0, macarrao.getPreco_compra(), 0.00001);
		assertEquals(6.0, macarrao.getPreco_venda(), 0.00001);
		
		double venda1 = macarrao.venda(5);
		assertEquals(5, macarrao.getQtd());
		assertEquals(30.0, venda1, 0.00001);
		
		double venda2 = macarrao.venda(2);
		assertEquals(3, macarrao.getQtd());
		assertEquals(12, venda2, 0.00001);
		
		double venda3 = macarrao.venda(5);
		assertEquals(3, macarrao.getQtd());
		assertEquals(-1, venda3, 0.00001);
		
		double venda4 = macarrao.venda(-5);
		assertEquals(3, macarrao.getQtd());
		assertEquals(-1, venda4, 0.00001);
	}
}
