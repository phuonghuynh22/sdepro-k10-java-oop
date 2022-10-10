package lab_09_1;

public class Contractor extends Employee{
    @Override
    public int getSalary() {
        return super.getSalary() + 40000;
    }
}
