package ChainOfResponsibility;

public class PaymentService implements ValidationHandler<CreditCard>{

	@Override
	public boolean validate(CreditCard creditCard) {
		System.out.println("PaymentService Validation processing");
		return creditCard.getCardNumber().length()==10?true:false;
	}

}
