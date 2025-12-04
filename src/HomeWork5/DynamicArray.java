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

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Չկա նման ինդեքսով էլեմենտ։");
            return;
        }

        // մեկ քայլ ձախ տանել մնացած էլեմենտները
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }


    // Սահմանել value-ն տվյալ index-ում
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Չկա նման ինդեքսով էլեմենտ։");
            return;
        }
        array[index] = value;
    }


    // Ավելացնել value-ն տվյալ ինդեքսում (insert)
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Չկա նման ինդեքս։");
            return;
        }

        if (size == array.length) {
            extend();
        }

        // աջ տանել
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
        size++;
    }


    // Վերադարձնել true, եթե value-ն կա
    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }


    // Վերադարձնել value-ի առաջին ինդեքսը
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
