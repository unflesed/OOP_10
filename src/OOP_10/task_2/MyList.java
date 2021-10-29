package OOP_10.task_2;

import java.util.Arrays;

public class MyList<T> {
    T[] array;
    public MyList(T[] array){
        this.array = array;
    }
    void add(T element){
        Object[] arrayNew = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        arrayNew[arrayNew.length - 1] = element;
        setArray((T[]) arrayNew);
    }
    T elemIndex(int index){
        while (true){
            try {
                return array[index];
            }catch (Exception e){
                System.out.println("Вы ввели неверный индекс.");
            }
        }
    }
    int size(T[] array){
        return array.length;
    }
    public T[] getArray() {
        return array;
    }
    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        MyList<Integer> myList = new MyList<>(arr);
        System.out.println("Элемент 1 = " + myList.elemIndex(1));
        System.out.println("Размер массива: " + myList.size(arr));
        myList.add(4);
        System.out.println(myList);
        }
}
