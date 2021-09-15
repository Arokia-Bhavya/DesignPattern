package ChainOfResponsibility;

public class Order {
	String orderNumber;
	String orderState;
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public Order(String orderNumber, String orderState) {
		super();
		this.orderNumber = orderNumber;
		this.orderState = orderState;
	}
}
