package composite;

public class Circle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing the circle with color "+color);		
	}

}
