package lesson_11_abstraction;

public class Contractor extends Employee{

    @Override
    public int getSalary() {
        return 40000;
    }

    @Override
    public int getSupportMoney() {
        return 0;
    }
}
