package methods.inlinetemp.good;

public class Order {

	public static final int MIN_TO_APPLY_DISCOUNT = 200;
	private Double price;
	private Double quantity;
	private Double offer;
	private Double shipping;

	public Order(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}
	public Double getQuantity() {
		return quantity;
	}
	public Double getOffer() {
		return offer;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public void setOffer(Double offer) {
		this.offer = offer;
	}
	public Double getShipping() {
		return shipping;
	}
	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}
	public Boolean hasDiscount() {
		return this.price > MIN_TO_APPLY_DISCOUNT;
	}
	
	
}
