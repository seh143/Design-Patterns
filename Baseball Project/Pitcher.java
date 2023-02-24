//Baseball
//Pitcher
//Team Member subclass

//@author: Sarah Houston
//@prof: James Bilitski

public class Pitcher extends TeamMember{
	
	public Pitcher() {
		throwBehavior = new ThrowCatcher();
		catchBehavior = new CatchWGlove();
		batBehavior = new BatNot();
		
	} 
	
	public void display() {
		System.out.println("The Pitcher's name is " + this.getName() + ".");
	}
	
}
