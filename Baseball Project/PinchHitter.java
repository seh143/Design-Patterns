//Baseball
//PinchHitter
//Team Member subclass

//@author: Sarah Houston
//@prof: James Bilitski

public class PinchHitter extends TeamMember{
	
	public PinchHitter() {
		throwBehavior = new ThrowNot();
		catchBehavior = new CatchNot();
		batBehavior = new BatPower();
		
	} 
	
	public void display() {
		System.out.println("The Pinch Hitter's name is " + this.getName() + ".");
	}
}
