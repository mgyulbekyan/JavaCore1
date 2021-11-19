package author;

import java.util.Scanner;

import author.Author;

public class AuthorTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthorStorage authorStorage = new AuthorStorage();
        Author author = new Author();
        System.out.println("How many authors we have?");
        int a = scanner.nextInt();


        for (int i = 0; i < a; i++) {
            System.out.println("name");
            String name = scanner.next();
            System.out.println("surname");
            String surname = scanner.next();
            System.out.println("email");
            String email = scanner.next();
            System.out.println("age");
            int age = scanner.nextInt();
            System.out.println("gender");
            String gender = scanner.next();


        }



    }

}
