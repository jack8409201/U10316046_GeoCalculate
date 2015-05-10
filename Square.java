
public class Square {
	double side;
	
	/** Construct a square with a specified side */
	Square(double side){
		this.side = side;
	}
	
	/** Return the area of this square */
	double getArea(){
		return side * side;
	}
	
	/** Return the perimeter of this square */
	double getPerimeter() {
		return side * 4;
	}
	
	/** Set a new side for this square */
	void setSide(double side){
		this.side = side;
	}
	
}
