//Baseball
//TeamMember
//abstract class for team member subclasses

//@author: Sarah Houston
//@prof: James Bilitski

public abstract class TeamMember {
	String name;
	ThrowingBehavior throwBehavior;
	CatchingBehavior catchBehavior;
	BattingBehavior batBehavior;
	
	public TeamMember() {} 
	
	public abstract void display();
	
	//
	public void setThrowingBehavior(ThrowingBehavior throwIn) {
		throwBehavior = throwIn;
	}
	public ThrowingBehavior getThrowingBehavior() {
		return throwBehavior;
	}
	
	//
	public void setCatchingBehavior(CatchingBehavior catchIn) {
		catchBehavior = catchIn;
	}
	public CatchingBehavior getCatchingingBehavior() {
		return catchBehavior;
	}
	
	//
	public void setBattingBehavior(BattingBehavior batIn) {
		batBehavior = batIn;
	}
	public BattingBehavior getBattingingBehavior() {
		return batBehavior;
	}
	
	//
	public void setName(String nameIn) {
		name = nameIn;
	}
	public String getName() {
		return name;
	}
	
	//
	public void performThrow() {
		throwBehavior.iThrow();
	}
	public void performCatch() {
		catchBehavior.iCatch();
	}
	public void performBat() {
		batBehavior.iBat();
	}

}

	
