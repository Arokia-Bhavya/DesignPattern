package composite;

public class Demo {
	public static void main(String[] args)
	{
		Drawing drawing=new Drawing();
		drawing.add(new Triangle());
		drawing.add(new Circle());
		drawing.draw("red");
		drawing.draw("blue");
	}

}
