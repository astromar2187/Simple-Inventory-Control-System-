# Simple-Inventory-Control-System-
This repo is supposed to track the evolution within a project of a system for a Object-oriented programming (OOP) class at Federal University of Piauí

Here is the translated assignment (by google translator):

Create a simple system for Inventory Control.

This system must have a Product class, representing items that may be on sale, for example, in supermarkets. Products must have code, description, purchase price, sale price, profit, quantity, minimum stock. Your constructor must have the following signature:

public Product(int cod, String desc, int min, double profit, Provider provided);

Products are provided by a Supplier, which has CNPJ and name. Your constructor must have the following signature:

public Vendor(int cnpj, String name);

Products must have the “void purchase(int quant, double val)” method, which increments the quantity and updates the purchase price attribute. The purchase price update must be a balance between the existing quantity and the current purchase price and the purchased quantity and the new price. Example: if there were 10 products with a purchase price of R$2.5 and we bought another 10 units of the product at R$7.50, then the new price would be (10 * 2.5 + 10 *. 7.5) / 20 = R$5.0.

  The sale price must be a percentage above the purchase price. This percentage will be defined when creating the product and will be an attribute of the class, called profit. Every time the buy price updates, we must update the sell price as well, with the profit applied to the buy price. Example: if the purchase price of a product is R$4 and the profit is 50% (0.5), then its selling price should be R$6.

The sales operation must be carried out using the current sales price, returning the value (quantity sold x sales price) and decreasing the quantity of product items. The sale can only be carried out if there are items in stock. If you are trying to sell above the quantity, the sale should not be made. As a sign of the problem, the method must return the value -1.

The method listProductsBelowTheMinimum() must return a vector of products whose quantity is below the minimum stock for the product.

It must not be possible to buy items with a negative quantity (every purchase has to be of a quantity greater than zero), as well as a negative price, nor to sell items with a negative quantity (it has to be greater than zero). It must not be possible to include products already included (same code).

The method quantity(int cod) must return the current quantity of existing products. The supplier(int cod) method must return the product's supplier or null if it does not exist.

We must implement the Inventory class. It will be responsible for containing a Product data structure (use whatever you want!). A description of their methods is listed below.

Inventory Class Methods

public class Stock {

   public void include(Product p);

   public void buy(int code, int amount, double price);

   public double sell(int cod, int amount);

   public int quantity(int code);

   public Supplier supplier(int cod);

   public Product[] stockBelowMinimum()

}

All rigths reserved to Professor PEDRO DE ALCANTARA DOS SANTOS NETO, computer science deparment at UFPI. Link to his CV: http://lattes.cnpq.br/3452982259415951
