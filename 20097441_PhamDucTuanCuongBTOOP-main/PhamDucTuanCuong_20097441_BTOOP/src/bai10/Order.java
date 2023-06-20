package bai10;

import java.time.LocalDate;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail	LineItem ;
	private int count;
	
	public void addLineItem(Product p, int x) {
		LineItem.add(new OrderDetail(x,p) );
		
	}
	public double calcTotalCharge() {
        double totalCharge = 0;
        for (LineItem lt : LineItem()) {
            totalCharge += lt.calcTotalPrice();
        }
        return totalCharge;
    }

	private bai10.LineItem[] LineItem() {
		// TODO Auto-generated method stub
		return null;
	}
	public Order(int orderID, LocalDate orderDate, int count) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.count = count;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public OrderDetail getLineItems() {
		return LineItem;
	}
	public void setLineItems(OrderDetail lineItems) {
		this.LineItem = LineItem;
	}
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + LineItem + ", count="
				+ count + "]";
	}
	
	
}


