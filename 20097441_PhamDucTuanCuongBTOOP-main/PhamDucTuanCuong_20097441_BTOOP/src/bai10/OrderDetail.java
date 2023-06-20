package bai10;

public class OrderDetail {
	private int quatity;
	private Product product;
	
	public double calcToalPrice() {
		return product.getPrice()*quatity;
	}

	public OrderDetail(int quatity, Product product) {
		super();
		this.quatity = quatity;
		this.product = product;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	@Override
	public String toString() {
		return "OrderDetail [quatity=" + quatity + ", product=" + product + "]";
	}

	public void add(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		
	}



}
