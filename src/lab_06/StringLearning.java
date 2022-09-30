package lab_06;

public class StringLearning {
    public static void main(String[] args) {
        //Literal declaration
        String s1 = "Cat";
        String s2 = "Cat";
        //s2 = "dog";


        //via String Object
        String s3 = new String("Cat");

        System.out.println(s1);
        System.out.println(s2);

        //false as comparing different object
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        //should use this
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


        String myPass = "123";



    }
}
