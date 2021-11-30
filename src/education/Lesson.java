package education;

public class Lesson {
    private String name;
    private double duration;
    private String lectureName;
    private int price;

    public Lesson(String name, double duration, String lectureName, int price) {
        this.name = name;
        this.duration = duration;
        this.lectureName = lectureName;
        this.price = price;
    }

    public Lesson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", lectureName='" + lectureName + '\'' +
                ", price=" + price +
                '}';
    }
}
