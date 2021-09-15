package ChainOfResponsibility;

public class AuthenticationService implements ValidationHandler<User>{

	@Override
	public boolean validate(User user) {
		System.out.println("AuthenticationService Validation processing");
		return user.getUserType()!=null && user.getUserName()!=null?true:false;
	}
	
}
