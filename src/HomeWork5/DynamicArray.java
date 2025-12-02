package HomeWork5;

public class DynamicArray {
    // սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    // սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    // ավելացնում ենք նոր էլեմենտ
    public void add(int value) {
        // եթե մասիվը լրիվ է, ընդարձակել
        if (size >= array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    // մասիվի ընդլայնում՝ 10 էլեմենտով ավել
    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // ստանում ենք էլեմենտը ըստ ինդեքսի
    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return -1;
        }
    }

    // տպում ենք ավելացված էլեմենտները
    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
