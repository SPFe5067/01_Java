package edu.kh.poly.ex1.model.dto;

public class spark extends car{

	private double discountoff;

	public double getDiscountoff() {
		return discountoff;
	}

	public void setDiscountoff(double discountoff) {
		this.discountoff = discountoff;
	}

	@Override
	public String toString() {
		return "spark [discountoff=" + discountoff + "]";
	}

	public spark(String engine, String fuel, int wheel, double discountoff) {
		super(engine, fuel, wheel);
		this.discountoff = discountoff;
	}

	public spark() {
		// TODO Auto-generated constructor stub
	}

	
	
	

}
