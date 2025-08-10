package cylinder;

import shape.Shape;

public class Cylinder extends Shape {
	double radius;
	double height;
	
	 // Parameterized constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    
    }
	
	@Override
	public double surface_area() {
		double lateralarea = 2 * Math.PI * radius * height;
		double twocircularbases = 2 * Math.PI * (radius * radius);
		return lateralarea + twocircularbases;
	}
	
	@Override
	public double volume() {
		
		return Math.PI * (radius * radius) * height;
	}
	
    public String toString() {
   	 // prints out surface area and volume.
   	 double volume = volume();
   	 double surface_area = surface_area();
		return ("Cylinder is: " + "Volume is: "+ volume + " Surface Area: " + surface_area );
   	 
    }
	
	
}
