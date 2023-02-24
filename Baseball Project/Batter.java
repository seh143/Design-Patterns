//Baseball
//Batter
//Team Member subclass

//@author: Sarah Houston
//@prof: James Bilitski

public class Batter extends TeamMember{
	
	public Batter() {
		throwBehavior = new ThrowNot();
		catchBehavior = new CatchWHands();
		batBehavior = new BatFocus();
		
	} 
	
	public void display() {
		System.out.println("The Batter's name is " + this.getName() + ".");
	}
}
