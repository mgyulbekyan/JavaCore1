package lesson6;

public class ArrayExample {
    public static void main(String[] args) {
        //հայտարարել մասիվ 10 էլեմենտանի
        //Տարբերակ 1
        int[] array = {1, 5, 8, 90};
        //Տարբերակ 2
        char[] name = new char[5];
        name[0] = 'P';
        name[1] = 'o';
        name[2] = 'x';
        name[3] = 'o';
        name[4] = 's';
        //Տպել մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println();
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);

        }
        System.out.println();
        //Տպել, թե քանի հատ օ կա name մասիվի մեջ
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] == 'o') {
                count++;
            }

        }
        System.out.println("name մասիվի մեջ կա "+count+" o էլեմենտ");

    }


}


