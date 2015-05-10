
public class Rectangle {
	double length;
	double width;
	
	/** Construct a rectangle with a specified length and width */
	Rectangle(double length , double width){
		this.length = length;
		this.width = width;
	}
	
	/** Return the area of this rectangle */
	double getArea(){
		return length * width;
	}
	
	/** Return the perimeter of this rectangle */
	double getPerimeter() {
		return (length + width) * 2;
	}
	
	/** Set a new length for this rectangle */
	void setLength(double length){
		this.length = length;
	}
	
	/** Set a new width for this rectangle */
	void setWidth(double width){
		this.width = width;
	}
	
}
