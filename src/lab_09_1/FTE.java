package lab_09_1;

public class FTE extends Employee {
    @Override
    public int getSalary() {
        return super.getSalary() + 50000;
    }
}
