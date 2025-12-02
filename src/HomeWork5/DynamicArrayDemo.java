package HomeWork5;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();

        // ավելացնում ենք 15 էլեմենտ՝ տեսնելու extend-ը
        for (int i = 1; i <= 15; i++) {
            arr.add(i * 2); // 2, 4, 6, ...
        }

        arr.print(); // պետք է տպի 15 էլեմենտները

        // ստուգում ենք getByIndex
        System.out.println("Element at index 5: " + arr.getByIndex(5)); // պետք է 12
        System.out.println("Element at index 20: " + arr.getByIndex(20)); // պետք է -1
    }
}
