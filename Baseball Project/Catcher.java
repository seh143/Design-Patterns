//Baseball
//Catcher
//Team Member subclass

//@author: Sarah Houston
//@prof: James Bilitski

public class Catcher extends TeamMember{
	
	public Catcher() {
		throwBehavior = new ThrowPitcher();
		catchBehavior = new CatchPitcher();
		batBehavior = new BatNot();
		
	} 
	
	public void display() {
		System.out.println("The Catcher's name is " + this.getName() + ".");
	}
}
