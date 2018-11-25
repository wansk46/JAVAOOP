public class Person {
    private final String name;
//    private final String brand;
    private final Mobile mobile;


    public Person(String name, Mobile mobile){
        this.name=name;
//        this.brand=brand;
        this.mobile=mobile;
    }

    public void call(String message){
        System.out.println("Person Name: "+this.name+"  Mobile Brand: "+this.mobile.brand);
        this.mobile.call(message);
    }
}
