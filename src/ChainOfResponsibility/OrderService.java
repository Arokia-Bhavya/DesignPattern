package ChainOfResponsibility;

public class OrderService implements ValidationHandler<Order>{

	@Override
	public boolean validate(Order order) {
		System.out.println("OrderService Validation processing");
		return order.getOrderState().equals("accepted")? true:false;
	}

}
