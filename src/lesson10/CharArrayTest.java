package lesson10;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] charArray = {'b', 'o', 'l', 'o', 'l', 'a'};
        //Քանի օ կա մասիվի մեջ
        CharArrayDemo mychar = new CharArrayDemo();
        mychar.CountOfo();
        //Տպել մասիվի ՛օ՛ էլեմենտի ինդեքսները
        mychar.Indexofo();
        //Տպել մասիվի մեջտեղի էլեմենտները
        mychar.medium();
        //Տպել true եթե մասիվը վերջանում է լը-ով, եթե ոչ false
        mychar.FinishLy();
        //Տպում ենք true եթե մասիվը պարունակում է bob բառը, բաից օ-ի տեղը կարող է լինել ցանկացաց սիմվոլ։ Հակառակ
        // դեպքում false.
        mychar.IsBob();



    }
}
