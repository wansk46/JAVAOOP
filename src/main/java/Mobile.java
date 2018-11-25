public class Mobile {
    private String name;
    private String color;
    public String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message) {
        if ((this.brand == "iphone" ) && (message.length()>10) || (this.brand == "android" ) && (message.length()>15)) {
            System.out.printf("Message cannot be sent\n");
        }else {
            System.out.printf( "Message : %s\n", message );
        }

    }

    public void printInfo() {
        System.out.println( "Name:" + this.name + "   color:" + this.color + "   brand:" + this.brand );
    }


}
