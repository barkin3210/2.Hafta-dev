package oop1;

//PascalCase
//İngilizce yaz herşeyi
//Domein=İş demek
// classın içine veri aktarıyoruz
//
public class Product {
	private String name;
	// camelCase
	private double uniPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUniPrice() {
		return uniPrice;
	}

	public void setUniPrice(double uniPrice) {
		this.uniPrice = uniPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	// private =sadece o classın içinde kullanılabilir

}
