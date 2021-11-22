package lesson17;

public class Box1 {
    private double widht;
    private double height;
    private double depth;

    Box1(Box1 ob) {
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;

    }

    Box1(double w, double h, double d) {
        w = widht;
        h = height;
        d = depth;
    }

    Box1() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {
        widht = height = depth = len;
    }

    double vol() {
        return widht * height * depth;
    }
}

class Box1Weight extends Box1 {
    double weight;

    Box1Weight(Box1Weight ob) {
        super(ob);
        weight = ob.weight;
    }

    Box1Weight(double w, double h, double d, double m) {
        super(w, h, d);
        w = weight;
    }

    Box1Weight() {
        super();
        weight = -1;
    }

    Box1Weight(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String[] args) {
        Box1Weight mybox1 = new Box1Weight(10, 20, 15, 34.3);
        Box1Weight mybox2 = new Box1Weight(2, 3, 4, 0.076);
        Box1Weight mybox3 = new Box1Weight();
        Box1Weight mycube = new Box1Weight(3, 2);
        Box1Weight myclone = new Box1Weight(mybox1);
        double vol;
        vol = mybox1.vol();
        System.out.println("Oбъeм mybox1 равен" + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();
        vol = mybox2.vol();

        System.out.println("Oбъeм mybox2 равен" + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();
        vol = mybox3.vol();
        System.out.println("Oбъeм mybox3 равен" + vol);
        System.out.println(
                "Вес mybox3 равен " + mybox3.weight);
        System.out.println();
        vol = myclone.vol();
        System.out.println("Oбъeм myclone равен " + vol);
        System.out.println(
                "Вес myclone равен" + myclone.weight);
        System.out.println();
        vol = mycube.vol();
        System. out .println ("Объем mycube равен " + vol);
        System.out.println(
                "Вес mycube равен " + mycube.weight);
        System.out.println();

    }
}

