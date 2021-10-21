package arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 50, 85, 10, 35, 20, 15, 60, 45, 95};
        //Տպել մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //Տպել մասիվի բոլոր զույգ էլեմենտները
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        //Տպել մասիվի բոլոր կենտ էլեմենտները
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }


        }
        //Տպել մասիվի ամենափոքր էլեմենտը
        int min = 0;
        for (int i = 0; i < array.length; i++) {
                if (array[i] < min)
                    System.out.println(min);
        }

//Տպել մասիվի էլեմենտների միջի թվաբանականը
            int num = array[0];
            for (int i = 0; i < array.length; i++) {
                num += array[i];

                System.out.println(num / array.length);
            }
        }


    }
































