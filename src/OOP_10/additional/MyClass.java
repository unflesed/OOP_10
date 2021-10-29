package OOP_10.additional;

public class MyClass<T>  {
    public static <T> void factoryMethod(T t){
        System.out.println(t.toString());
    }
}
class Main{
    public static void main(String[] args) {
        MyClass.factoryMethod(new Integer(2));
    }
}
