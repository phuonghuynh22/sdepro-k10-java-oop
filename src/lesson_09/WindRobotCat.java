package lesson_09;

public class WindRobotCat extends RobotCat{
    @Override
    public String charge(){
        return super.charge() + " with wind!";
    }
}
