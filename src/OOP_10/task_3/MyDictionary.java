package OOP_10.task_3;

public class MyDictionary<TKey,TValue> {
    Object[] arrTKey = new Object[0];
    Object[] arrTValue = new Object[0];
    void add(TKey key, TValue value){
        Object[] arrTKeyNew = new Object[arrTKey.length + 1];
        Object[] arrTValueNew = new Object[arrTValue.length + 1];
        for (int i = 0; i < arrTKey.length; i++) {
            arrTKeyNew[i] = arrTKey[i];
            arrTValueNew[i] = arrTValue[i];
        }
        arrTKeyNew[arrTKeyNew.length - 1] = key;
        arrTValueNew[arrTValueNew.length - 1] = value;
        setArrTKey((TKey[]) arrTKeyNew);
        setArrTValue((TValue[]) arrTValueNew);
    }
    String elemIndex(int index){
        while (true){
            try {
                return arrTKey[index].toString() + " - " + arrTValue[index];
            }catch (Exception e){
                System.out.println("Вы ввели неверный индекс.");
            }
        }
    }
    int size(){
        return arrTKey.length;
    }
    public Object[] getArrTKey() {
        return arrTKey;
    }
    public void setArrTKey(TKey[] arrTKey) {
        this.arrTKey = arrTKey;
    }
    public Object[] getArrTValue() {
        return arrTValue;
    }
    public void setArrTValue(TValue[] arrTValue) {
        this.arrTValue = arrTValue;
    }
}

class Main {
    public static void main(String[] args) {
        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.add("dog", "собака");
        myDictionary.add("cat", "кошка");
        System.out.println("Количество слов в словаре: " + myDictionary.size());
        System.out.println("Элемент под индексом 1: " + myDictionary.elemIndex(1));
    }
}