package decorator;

public class BasicReport implements Report{

	
	@Override
	public void stitchContents() {
		System.out.println("Basic Report.");		
	}

}
