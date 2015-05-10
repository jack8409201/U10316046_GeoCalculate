public class Circle {
	double radius;
	
	/** Construct a circle with a specified radius */
	Circle(double radius) {
		this.radius = radius;
	}

	/** Return the area of this circle */
	double getArea() {
	    return radius * radius * Math.PI;
	}

	/** Return the perimeter of this circle */
	double getPerimeter() {
	    return 2 * radius * Math.PI;
	}

	/** Set a new radius for this circle */
	void setRadius(double radius) {
	    this.radius = radius;
	}
	
}
