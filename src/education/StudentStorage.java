package education;

public class StudentStorage {
    private Student[] students = new Student[16];
    private int size;

    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, size);
        students = tmp;
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);

        }
    }


}
