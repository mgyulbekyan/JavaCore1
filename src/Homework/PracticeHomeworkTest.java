package Homework;

public class PracticeHomeworkTest<max, a> {
    public static void main(String[] args) {
        PracticeHomework mypractice = new PracticeHomework();
        //փոխակերպել տրված րոպեն վայրկյանի և վերադարձնել
        int minutes = 10;
        minutes = (int) mypractice.convert(10);
        System.out.println(minutes);
        //Ընդունել տարին, վերադաևրձնել օրերի քանակը
        int age;
        age = mypractice.calcAge(1);
        System.out.println(age);
        //Վերադարձնել տրված թվի հաջորդ թիվը
        int number;
        number = mypractice.nextNumber(5);
        System.out.println(number);
        //վերադարձնել true,  եթե տրված a և b թվերը իրար հավասար են, եթե ոչ false.
        boolean result;
        result = mypractice.isSameNum(9, 9);
        System.out.println(result);
        //վերադարձնել true,  եթե թիվը փոքր է կամ համասար է 0- ին։
        // Մնացած դեպքերում վերադարձնել false:
        boolean result1;
        result1 = mypractice.lessThanOrEqualToZero(7);
        System.out.println(result1);
        //Վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
        boolean value;
        value = mypractice.reverseBool(true);
        System.out.println(value);
//Վերադարձնել երկու մասիվի ամենամեծ lenght-ը:
        int[] array1 = {3, 6, 8, 9, 29};
        int[] array2 = {3, 4, 5};
        int maxlen;
        maxlen = mypractice.maxLenght(new int[array1.length], new int[array2.length]);
        System.out.println(maxlen);


    }


}
