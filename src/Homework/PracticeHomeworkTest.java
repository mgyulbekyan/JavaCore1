package Homework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework mypractice = new PracticeHomework();
        //փոխակերպել տրված րոպեն վայրկյանի և վերադարձնել
        System.out.println(mypractice.convert(10));
        //Ընդունել տարին, վերադաևրձնել օրերի քանակը
        System.out.println(mypractice.calcAge(10));
        //Վերադարձնել տրված թվի հաջորդ թիվը
        System.out.println(mypractice.nextNumber(87));
        //վերադարձնել true,  եթե տրված a և b թվերը իրար հավասար են, եթե ոչ false.
        System.out.println(mypractice.isSameNum(7, 9));
        //վերադարձնել true,  եթե թիվը փոքր է կամ համասար է 0- ին։
        // Մնացած դեպքերում վերադարձնել false:
        System.out.println(mypractice.lessThanOrEqualToZero(-6));
        //Վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
        System.out.println(mypractice.reverseBool(true));
//Վերադարձնել երկու մասիվի ամենամեծ lenght-ը:
        int[] array1 = {3, 6, 8, 9, 29};
        int[] array2 = {3, 4, 5};
        System.out.println(mypractice.maxLenght(array1, array2));


    }


}
