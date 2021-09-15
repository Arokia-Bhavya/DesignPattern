package composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
	List<Shape> shapeList;

	public Drawing() {
		super();
		shapeList=new ArrayList<Shape>();		
	}

	@Override
	public void draw(String color) {
		shapeList.forEach(s -> s.draw(color));		
	}
	
	public void add(Shape shape)
	{
		shapeList.add(shape);
	}
	
	public void remove(Shape shape)
	{
		shapeList.remove(shape);
	}
	
	public void clear()
	{
		shapeList=new ArrayList<Shape>();
	}

}
