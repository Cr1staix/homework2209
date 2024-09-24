import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() {
        int[] numbers = new int[]{1, 2, 3};
        int summElementArrays = 0;
        for (int elements : numbers) {
            summElementArrays += elements;
        }
        int avarageNums = summElementArrays / numbers.length;
        System.out.println(avarageNums);
        System.out.println();
    }

    static void task2() {
        double[] numbers = new double[]{1.2, 7.5, -2.5, -4.9};
        double min = 100000.9812;
        double max = -100000.981;
        for (double elements : numbers) {
            if (min > elements) {
                min = elements;
            }
            if (max < elements) {
                max = elements;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println();
    }

    static void task3() {
        char[] symbols = new char[]{'U', 'g', 'i', 'f', 'p'};
        char[] volwels = new char[]{'e', 'y', 'u', 'i', 'o', 'a'};
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = Character.toLowerCase(symbols[i]);
            for (int j = 0; j < volwels.length; j++) {
                if (symbols[i] == volwels[j]) {
                    System.out.println(volwels[j] + " - гласная");
                }
            }
        }
        System.out.println();
    }

    static void task4() {
        String text = "Hello wolrd we love java";
        StringBuilder sb = new StringBuilder();
        char[] symbols = new char[text.length()];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = text.charAt(i);
            if (text.charAt(i) == ' ') {
                symbols[i] = '_';
            }
            sb.append(symbols[i]);
        }
        String newText = sb.toString();
        System.out.println(newText);
        System.out.println();
    }

    static void task5() {
        String str = "we,love,learn,lava";
        String[] splitStr = str.split(",");
        System.out.println(Arrays.toString(splitStr));
    }
}