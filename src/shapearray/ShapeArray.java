package shapearray;

import cylinder.Cylinder;
import sphere.Sphere;

public class ShapeArray {

	 public static void main(String[] args) {
		 Sphere sphere = new Sphere(2);
		 
		 Cylinder cylinder = new Cylinder(2, 1);
		 
		 String spheretostring = sphere.toString();
		 String cylindertostring = cylinder.toString();
		 
		 System.out.println(spheretostring);
		 System.out.println(cylindertostring);
		 
	 }
}
