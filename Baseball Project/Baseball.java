//Main method to test Strategy Design Pattern
//Sarah Houston

public class Baseball 
{
    public static void main(String[] args)
    {
        //create and test Pitcher Team Member
        Pitcher kent = new Pitcher();
        kent.setName("Kent T");
        kent.display();
        kent.performThrow();
        kent.performCatch();
        kent.performBat();

        //create and test Batter Team Member
        Batter pedro = new Batter();
        pedro.setName("Pedro A");
        pedro.display();
        pedro.performThrow();
        pedro.performCatch();
        pedro.performBat();

        //create and test Fielder Team Member
        Fielder max = new Fielder();
        max.setName("Max M");
        max.display();
        max.performThrow();
        max.performCatch();
        max.performBat();

        //create and test Catcher Team Member
        Catcher chris = new Catcher();
        chris.setName("Chris S");
        chris.display();
        chris.performThrow();
        chris.performCatch();
        chris.performBat();

        //Test setting behaviours to something else
        System.out.println("Kent the pitcher will not bat any more because we have a pinch hitter.");
        kent.setBattingBehavior(new BatNot());
        kent.display();
        kent.performBat();

        //create and test Pinch Hitter Team Member
        PinchHitter bobcat = new PinchHitter();
        bobcat.setName("Bobcat");
        bobcat.display();
        bobcat.performThrow(); 
        bobcat.performCatch();
        bobcat.performBat();
    }
}
