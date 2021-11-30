package education;

public class LessonStorage {
    private Lesson[] lessons = new Lesson[16];
    private int size;

    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, size);
        lessons = tmp;
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);

        }
    }

}
