package sphere;

import shape.Shape;

public class Sphere extends Shape {
	int radius; 
	
	 // Parameterized constructor
    public Sphere(int radius) {
        this.radius = radius;
    
    }

	@Override
	public double surface_area() {
		
		return 4 * Math.PI * (radius * radius);
	}

	@Override
	public double volume() {

		return (4/3) * Math.PI * (radius * radius * radius);
	}
	
	
     public String toString() {
    	 // prints out surface area and volume.
    	 double volume = volume();
    	 double surface_area = surface_area();
		return ("Volume is: "+ volume + " Surface Area: " + surface_area );
    	 
     }
}
