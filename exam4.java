import java.io.*;
import java.util.*;

interface Engine{
	
	void changeGear();
	void speedUp();
}  

class Vehicle implements Engine{
	int speed;
	int gear;
	void changeGear(int a){
		gear = a;
		System.out.println("gear"+gear);
	}
	void speedUp(int a){
		speed = a;
		System.out.println("speed"+speed);
	}
}
class exam4 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Vehicle v = new Vehicle();
		int g = sc.nextInt();
		int s= sc.nextInt();
		v.changeGear(g);
		v.speedUp(s);
	}
}