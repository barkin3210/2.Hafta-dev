package classesWithAttributes;

public class Product {
	
	public Product() {
	     System.out.println("Yapıcı blok çalıştı");	
		
	}
	
	// attribute | field
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
	String renk;
	String kod;
	// get= yazılanı okuyabilirsin ama değiştiremezsin
	// set= yazılanı sen yazarsın

	// getter
	public int getId() {
		return id;
	}

	// setter
	public void setId(int id) {
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id;
	}


}
