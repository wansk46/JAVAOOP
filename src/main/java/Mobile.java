public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message) {
        System.out.printf( "Message : %s\n", message );
    }

    public void printInfo() {
        System.out.println( "Name:" + this.name + "   color:" + this.color + "   brand:" + this.brand );
    }


}
