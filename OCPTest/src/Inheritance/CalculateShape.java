package Inheritance;

public class CalculateShape extends Calculate implements Shape{
int a =3;
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		int x =a*a;
		System.out.println("square is "+x);
	}
public static void main(String[] args) {
	Shape s = new CalculateShape();
	s.calculate();
	CalculateShape c1 = new CalculateShape();
	c1.calculate();
	c1.play();
	c1.run();
}
@Override
public void play() {
	// TODO Auto-generated method stub
System.out.println("play");
}
}
