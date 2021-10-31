package Homework;

public class PracticeHomework {
    //փոխակերպել տրված րոպեն վայրկյանի և վերադարձնել
    long convert(int minutes) {
        return minutes * 60;
    }

    //Ընդունել տարին, վերադաևրձնել օրերի քանակը
    int calcAge(int years) {
        return years * 365;
    }

    //Վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        return number + 1;
    }

    //վերադարձնել true,  եթե տրված a և b թվերը իրար հավասար են, եթե ոչ false.
    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else return false;


    }

    //վերադարձնել true,  եթե թիվը փոքր է կամ համասար է 0- ին։
    // Մնացած դեպքերում վերադարձնել false:
    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else return false;


    }

    //Վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    boolean reverseBool(boolean value) {
        if (value = true) {
            return false;
        }
        else return true;

    }
    //Վերադարձնել երկու մասիվի ամենամեծ lenght-ը:
    int maxLenght(int[] array1, int[] array2){
        if (array1.length>array2.length){
            return array1.length;
        }
        else return array2.length;

    }
}
