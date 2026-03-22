class Hillstations {

    void famousfood() {
        System.out.println("Hillstation food");
    }

    void famousfor() {
        System.out.println("Hillstation famous for tourism");
    }
}


// subclass 1
class Manali extends Hillstations {

    @Override
    void famousfood() {
        System.out.println("Manali famous food: Siddu");
    }

    @Override
    void famousfor() {
        System.out.println("Manali famous for snow");
    }
}


// subclass 2
class Mussoorie extends Hillstations {

    @Override
    void famousfood() {
        System.out.println("Mussoorie famous food: Momos");
    }

    @Override
    void famousfor() {
        System.out.println("Mussoorie famous for hills");
    }
}


// subclass 3
class Gulmarg extends Hillstations {

    @Override
    void famousfood() {
        System.out.println("Gulmarg famous food: Kashmiri pulao");
    }

    @Override
    void famousfor() {
        System.out.println("Gulmarg famous for skiing");
    }
}


public class Main {

    public static void main(String[] args) {

        Hillstations h;

        h = new Manali();
        h.famousfood();
        h.famousfor();

        System.out.println();

        h = new Mussoorie();
        h.famousfood();
        h.famousfor();

        System.out.println();

        h = new Gulmarg();
        h.famousfood();
        h.famousfor();
    }
}