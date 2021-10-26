package practise.task_2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class It<T> implements Iterator<T> {
    T[] arr;
    private int i = 0;
    public It(T[] arr){
        this.arr = arr;
    }
    @Override
    public boolean hasNext() {
        try {
            return arr.length > i;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    @Override
    public T next() {
        try {
            if (i < arr.length) {
                return arr[i++];
            }else throw new NoSuchElementException();

        }catch (NoSuchElementException e){
            System.out.println("Такого элемента нет!");
            return null;
        }
    }
}
class Main{
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        It<Integer> it = new It<>(arr);
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(it.next());
        }
    }
}