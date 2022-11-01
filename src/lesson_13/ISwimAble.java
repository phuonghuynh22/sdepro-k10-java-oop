package lesson_13;

public interface ISwimAble {

    void doSth();

    /* interface does not accept non-abstract method
    void doAnother(){

    }

     */

    // from java 8, introducing "default" method
    default void doAnother(){

    }
}
