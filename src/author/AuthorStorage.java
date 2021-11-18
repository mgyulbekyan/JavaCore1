package author;


public class AuthorStorage {
    private Author[] array = new Author[10];
    private int size = 0;
    private int[] author;


    public void add(Author author) {
        if (array.length == size) {
            extend();
        }
    }


    private void extend() {
        Author[] tmp = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];

        }
        array = tmp;

    }


    public int getByIndex(int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index");
            return -1;
        }
        return author[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }


    }
}



