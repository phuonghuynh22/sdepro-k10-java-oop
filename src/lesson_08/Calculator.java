package lesson_08;


public class Calculator {

    //functional programming

    //Overloading: same class, same method name but different params
    //method signature
    //Compiling time
    /*

    //method overloading
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    */


    //Varargs | Rest parameters -> put as the last param

    public int sum(int initNum, int... nums) {
        int total = 0;
        for (int num : nums) {
            total = total + num;
        }
        return total;

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3, 5));
    }
}
