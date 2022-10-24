package lesson_11_abstraction;

public class FTE extends Employee {
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public int getSupportMoney() {
        return 5000;
    }
}
