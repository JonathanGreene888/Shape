package cone;

import shape.Shape;

public class Cone extends Shape {
	double radius; 
	double height;
	
	public Cone(double radius, double height) {
		this.radius = radius; 
		this.height = height;
	}

	@Override
	public double surface_area() {
		
		return Math.PI * radius * (radius + Math.sqrt((height * height) + (radius * radius))) ;
	}

	@Override
	public double volume() {
		
		return Math.PI * (radius * radius)* (height / 3.0);
	}
	
	public String toString() {
	   	 // prints out surface area and volume.
	   	 double volume = volume();
	   	 double surface_area = surface_area();
			return ("Cone is: " + "Volume is: "+ volume + " Surface Area: " + surface_area );
	   	 
	    }
}
