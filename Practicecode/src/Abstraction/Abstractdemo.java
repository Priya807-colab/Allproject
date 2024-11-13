package Abstraction;

public class Abstractdemo {

	public static void main(String[] args) {
		
				Square sq=new Square();
				Rectangle rl=new Rectangle();
				sq.calArea();
				sq.show();
				rl.calArea();
				rl.show();
				
				System.out.println("------------------------------------------------");
				//Runtime Polymorphism /Dynamic binding /late binding
				
				Shape shape;
				shape=new Square(12.5f);
				shape.calArea();
				shape.show();
				
				shape=new Rectangle(10,20);
				shape.calArea();
				shape.show();
			}

		}
	
