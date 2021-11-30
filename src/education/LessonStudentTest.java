package education;


import java.util.Scanner;

public class LessonStudentTest {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();
    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";


    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for add author");
        System.out.println("please input " + ADD_STUDENT + " for add book");
        System.out.println("please input " + PRINT_STUDENTS + " for search author by name");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for search author by age");
        System.out.println("please input " + PRINT_LESSONS + " for search book by title");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for print authors");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for print books");
    }

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "EXIT":
                    isRun = false;
                    break;
                case "ADD_LESSON":
                    addLesson();
                    break;
                case "ADD_STUDENT":
                    addStudent();
                    break;
                case "PRINT_STUDENTS":
                    studentStorage.print();
                    break;
                case "PRINT_STUDENTS_BY_LESSON":
                    printStudentbyLesson();
                    break;
                case "PRINT_LESSONS":
                    lessonStorage.print();
                    break;
                case "DELETE_LESSON_BY_NAME":
                    break;
                case " DELETE_STUDENT_BY_EMAIL ":
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }


    }

    private static void printStudentbyLesson() {
        System.out.println("please input lesson");
        String lesson = scanner.nextLine();
        studentStorage.searchStudentbyLesson(lesson);
    }

    private static void addStudent() {
        System.out.println("please input student's name");
        String name = scanner.nextLine();
        System.out.println("please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("please input student's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input students's email");
        String email = scanner.nextLine();
        System.out.println("please input student's phone");
        String phone = scanner.nextLine();
        System.out.println("please input student's lesson");
        String lesson = scanner.nextLine();
        Student student = new Student(name, surname, age, email, phone, lesson);
        studentStorage.add(student);
        System.out.println("thank you,student was added");


    }

    private static void addLesson() {
        System.out.println("please input lesson's name");
        String name = scanner.nextLine();
        System.out.println("please input lesson's duration");
        double duration = Double.parseDouble(scanner.nextLine());
        System.out.println("please input lesson's lectureName");
        String lectureName = scanner.nextLine();
        System.out.println("please input lesson's price");
        int price = Integer.parseInt(scanner.nextLine());
        Lesson lesson = new Lesson(name, duration, lectureName, price);
        lessonStorage.add(lesson);
        System.out.println("thank you, lesson was added");

    }
}






