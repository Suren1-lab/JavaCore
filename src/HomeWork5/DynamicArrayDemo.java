package HomeWork5;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        // Սովորական add
        da.add(10);
        da.add(20);
        da.add(30);
        da.add(40);
        da.add(50);

        System.out.println("Սկզբնական մասիվը:");
        da.print();

        // add(index, value)
        System.out.println("Ավելացնում ենք 999-ը index 2-ում:");
        da.add(2, 999);
        da.print();

        // deleteByIndex
        System.out.println("Ջնջում ենք index 3-ը:");
        da.deleteByIndex(3);
        da.print();

        // set
        System.out.println("set(1, 777):");
        da.set(1, 777);
        da.print();

        // exists
        System.out.println("Արդյոք 999-ը կա՝ " + da.exists(999));
        System.out.println("Արդյոք 123-ը կա՝ " + da.exists(123));

        // getIndexByValue
        System.out.println("999-ի ինդեքսը: " + da.getIndexByValue(999));
        System.out.println("123-ի ինդեքսը: " + da.getIndexByValue(123));

        // getByIndex
        System.out.println("getByIndex(0): " + da.getByIndex(0));
        System.out.println("getByIndex(10): " + da.getByIndex(10)); // -1

        // Քիչ ավելի մեծ թվով ավելացում, որ extend աշխատի
        System.out.println("\nextend-ի ստուգում:");
        for (int i = 0; i < 20; i++) {
            da.add(1000 + i);
        }
        da.print();
    }
}

