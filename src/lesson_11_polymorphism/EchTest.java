package lesson_11_polymorphism;

public class EchTest {
    public static void main(String[] args) {

        //polymorphism: tinh da hinh tu 2 compressed class tro len
        Ech trungEch = new TrungEch();
        trungEch = new NongNoc();
        trungEch = new EchCon();
    }
}
