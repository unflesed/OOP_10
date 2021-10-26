package practise.task_1;

public class MyClass <T>{
    T value;
    public MyClass(T value){
        this.value = value;
    }
   void show(){
        System.out.println(value.getClass());
    }
}
class Main{
    private static Object Integer;

    public static void main(String[] args) {
        MyClass<Integer> st = new MyClass<Integer>(1);
        st.show();
    }
}
