package dynamicArray;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    // ստուգել, եթե մասիվի մեջ տեղ չկա, կանչել extend(),
    //և ավելացնել
    public void add(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                extend(size);
            }
            array[size] = value;

        }

    }


    //1.Ստեղծել մեր մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2.քցել հին մասիվի էլեմենտները նորի մեջ
    //3.հին մասիվի հղումը կապել նոր մասիվի հղման հետ
    private void extend(int size) {
        int[] array1 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array[i] = array1[i];
        }
        array1 = array;

    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել մասիվի
    //ինդեքսերորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1:
    public int getByIndex(int index) {
        if (index < array.length) {
            return array[index];

        } else return -1;


    }

    //Տպել մասիվի ավելացված էլեմենտները։
    public void print() {
        System.out.println(array[size]);

    }


}
