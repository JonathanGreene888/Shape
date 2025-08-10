package shapearray;

import cone.Cone;
import cylinder.Cylinder;
import shape.Shape;
import sphere.Sphere;

public class ShapeArray {
	static Shape[] shapeArray = new Shape[3];

	 public static void main(String[] args) {
		 shapeArray[0] = new Sphere(2);
		 shapeArray[1] = new Cylinder(2, 1);
		 shapeArray[2] = new Cone(2,1);
		 
		 for(Shape shape: shapeArray) {
			 System.out.println(shape.toString()); 
		 }
	 }
}
