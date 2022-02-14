package data.replacearray.good;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		final Purchase purchase = new Purchase("Chari", 49.99,"Black");
		final int nArticles = 5;

		final double finalPrice = purchase.cost * nArticles;
	}


	public static class Purchase {
		private String concept;
		private double cost;
		private String color;

		public Purchase(String concept, double cost, String color) {
			this.concept = concept;
			this.cost = cost;
			this.color = color;
		}
	}
}
