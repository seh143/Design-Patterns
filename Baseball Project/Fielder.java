//Baseball
//Fielder
//Team Member subclass

//@author: Sarah Houston
//@prof: James Bilitski

public class Fielder extends TeamMember{
	
	public Fielder() {
		throwBehavior = new ThrowFielder();
		catchBehavior = new CatchWGlove();
		batBehavior = new BatNot();
		
	} 
	
	public void display() {
		System.out.println("The Fielder's name is " + this.getName() + ".");
	}
}
