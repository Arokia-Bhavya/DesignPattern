package ChainOfResponsibility;

public class Client {
	public static void main(String[] args)
	{
		validateOrder("Anitha","customer","1234567890","Order01","accepted");
	}

	private static void validateOrder(String name, String customerType, String cardNumber, String orderNumber, String orderType) {
		if(new AuthenticationService().validate(new User(name,customerType)))
			if(new OrderService().validate(new Order(orderNumber,orderType)))
				if(new PaymentService().validate(new CreditCard(cardNumber)))
					System.out.println("processing the order");
				else
					System.out.println("PaymentService Validation failed");
			else
				System.out.println("OrderService Validation failed");
		else
			System.out.println("AuthenticationService Validation failed");
	}

}
