package lesson_11;

public class FTE extends Employee {
    @Override
    public int getSalary() {
        return super.getSalary() + 50000;
    }

    // this is breaking the IS-A relationship
    public int getSupportMoney(){
        return 5000;
    }
}
