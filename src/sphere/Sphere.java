package sphere;

import shape.Shape;

public class Sphere extends Shape {
	double radius; 
	
	 // Parameterized constructor
    public Sphere(double radius) {
        this.radius = radius;
    
    }

	@Override
	public double surface_area() {
		
		return 4.0 * Math.PI * (radius * radius);
	}

	@Override
	public double volume() {

		return (4.0/3.0) * Math.PI * (radius * radius * radius);
	}
	
	
     public String toString() {
    	 // prints out surface area and volume.
    	 double volume = volume();
    	 double surface_area = surface_area();
		return ("Sphere is: " + "Volume is: "+ volume + " Surface Area: " + surface_area );
    	 
     }
}
