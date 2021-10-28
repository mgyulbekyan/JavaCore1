package lesson10;

public class CharArrayDemo {
    char[] charArray = {'b', 'o', 'l', 'o', 'l', 'a'};
    void CountOfo() {
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'o') {
                count++;
            }
        }
        System.out.println("count of " + 'o' + "=" + count);
    }
    void Indexofo(){for (int i = 0; i < charArray.length; i++) {
        if (charArray[i] == 'o') {
            System.out.println(i);
        }

    }

    }
    void medium() {
        System.out.println(charArray[charArray.length/2]);
    }
    void FinishLy() {
        if( charArray[charArray.length-2]=='l'&& charArray[charArray.length-1]=='y') {
            System.out.println("true");}
        else
            System.out.println("false");

    }
    void IsBob(){
        boolean isBob= false;
        for (int i = 0; i < charArray.length -2; i++) {
            if (charArray[i]=='b'&& charArray[i+2]=='b'){
                isBob=true;
                break;
            }

        }
        System.out.println(isBob);

    }
    void Space() {
        char[] text={' ',' ','b','a','r','e','v',' ',' ',' '};
        int statrIndex=0;
        int endIndex =text.length-1;
        while (statrIndex<endIndex && text[statrIndex]==' '){
            statrIndex++;
        }
        while (endIndex>statrIndex && text[endIndex]==' '){
            endIndex--;
        }
        char[] result= new char[endIndex-statrIndex+1];
        int index=0;
        for (int i = statrIndex; i <=endIndex ; i++) {
            result[index++]=text[i];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }


    }



}
