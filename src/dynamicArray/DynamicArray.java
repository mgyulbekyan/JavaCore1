package dynamicArray;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    // ստուգել, եթե մասիվի մեջ տեղ չկա, կանչել extend(),
    //և ավելացնել
    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;

    }


    //1.Ստեղծել մեր մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2.քցել հին մասիվի էլեմենտները նորի մեջ
    //3.հին մասիվի հղումը կապել նոր մասիվի հղման հետ
    private void extend() {
        int[] array1 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array[i] = array1[i];

        }
        array1 = array;

    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել մասիվի
    //ինդեքսերորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1:
    public int getByIndex(int index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                index++;
            } else return -1;

        }
        return array[index];
    }


    //Տպել մասիվի ավելացված էլեմենտները։
    public void print() {
        for (int size = 0; size < array.length+10; size++) {

        }
        System.out.println(array[size]);

    }


}
