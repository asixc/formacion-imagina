package methods.extractvariable.good;

public class Order {

	public static final int FIX_VALUE = 2;
	private Double price;
	private Integer quantity;
	private Double offer;
	private Double shipping;

	public Order(Double price, Integer quantity,  Double offer, Double shipping) {
		this.price = price;
		this.quantity = quantity;
		this.offer = offer;
		this.shipping = shipping;
	}

	public Double getPrice() {
		return price;
	}
	public Integer getQuantity() { return quantity; }
	public Double getOffer() {
		return offer;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setQuantity(Integer quantity) {
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


	public Double getTotalPrice() {
		return getBasicPrice() - getDiscount();
	}

	private double getBasicPrice() {
		return this.getPrice() * this.getQuantity();
	}

	private double getDiscount(){
		return this.getOffer() + this.getShipping() * FIX_VALUE;
	}
}
