package ChainOfResponsibility;

public interface ValidationHandler<T> {

	public boolean validate(T t);
	
}
