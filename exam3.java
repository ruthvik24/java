import java.io.*;
import java.util.*;

abstract class Shape{  
  abstract Double calculatePerimeter();  
}  
class Circle extends Shape{
	float radius;
	Double calculatePerimeter(){
		Double peri = 2*3.14*(double)radius;
		return peri;
	}
}
class Rectangle extends Shape{
	float length,breadth;
	Double calculatePerimeter(){
		Double peri = 2*((double)length+(double)breadth);
		return peri;
	}
}
class Square extends Shape{
	float side;
	Double calculatePerimeter(){
		Double peri = 4*(double)side;
		return peri;
	}
}
class exam3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Double res;
		if(a == 1){
			Circle c = new Circle();
			c.radius = sc.nextFloat();
			res = c.calculatePerimeter();
			System.out.format("%.2f",res);
		}
		else if(a == 2){
			Rectangle r = new Rectangle();
			r.length= sc.nextFloat();
			r.breadth= sc.nextFloat();
			res = r.calculatePerimeter();
			System.out.format("%.2f",res);
		}
		else{
			Square s = new Square();
			s.side = sc.nextFloat();
			res = s.calculatePerimeter();
			System.out.format("%.2f",res);
		}
		
	}
}