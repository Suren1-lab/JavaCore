package HomeWork3;

import java.util.Arrays;

public class ArrayHomework {

    public static void main(String[] args) {

        // ----------------------------------------------
        // 1. Հաշվել, թե քանի հատ n (n = 6) կա 10 թվերից բաղկացած մասիվում
        // ----------------------------------------------
        int[] numbers1 = {3, 6, 7, 6, 1, 9, 6, 2, 8, 5};
        int n = 6;
        int count = 0;

        for (int num : numbers1) {
            if (num == n) {
                count++;
            }
        }

        System.out.println("Մասիվում " + n + " թիվը հանդիպում է " + count + " անգամ։");

        // ----------------------------------------------
        // 2. Թարս դասավորել 10 թվերից բաղկացած մասիվը
        // ----------------------------------------------
        int[] numbers2 = {1, 4, 7, 2, 9, 5, 8, 0, 3, 6};
        int[] reversed = new int[numbers2.length];

        for (int i = 0; i < numbers2.length; i++) {
            reversed[i] = numbers2[numbers2.length - 1 - i];
        }

        System.out.println("Թվերը թարս դասավորված են՝ " + Arrays.toString(reversed));

        // ----------------------------------------------
        // 3. Հաշվել, թե քանի կրկնվող թիվ կա 10 թվերից բաղկացած մասիվում
        // ----------------------------------------------
        int[] numbers3 = {1, 2, 3, 2, 4, 5, 6, 5, 7, 8};
        int duplicateCount = 0;

        // Օգտագործում ենք սովորական մոտեցում՝ զույգերով ստուգելով
        for (int i = 0; i < numbers3.length; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if (numbers3[i] == numbers3[j]) {
                    duplicateCount++;
                    break; // միևնույն թիվը չհաշվենք կրկին
                }
            }
        }

        System.out.println("Մասիվում կրկնվող թվերի քանակը՝ " + duplicateCount);

        // ----------------------------------------------
        // 4. Հաշվել, թե քանի ձայնավոր կա հայերեն սինվոլներից բաղկացած մասիվում
        // ----------------------------------------------
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'ե', 'ը', 'ի', 'օ', 'ո', 'ե', 'ո', 'յ', 'է', 'ը'}; // հիմնական ձայնավորները
        int vowelCount = 0;

        for (char c : chars) {
            for (char v : vowels) {
                if (c == v) {
                    vowelCount++;
                    break;
                }
            }
        }

        System.out.println("Մասիվում ձայնավորների քանակը՝ " + vowelCount);
    }
}

