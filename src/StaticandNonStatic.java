public class StaticandNonStatic {

    int id ;
    String address;

    static String name;

    public StaticandNonStatic() {
    }

    public StaticandNonStatic(int id, String address) {
        this.id = id;
        this.address = address;

    }

    public void getdetails(){
        System.out.println(id);
        System.out.println(address);
        System.out.println(name);
    }

    public static void staticMethod(){
        System.out.println("gauri");
    }

    public static void main(String[] args) {
        StaticandNonStatic staticandNonStatic = new StaticandNonStatic(1,"hydrabad");
        staticandNonStatic.getdetails(); // called with object instance variable

        StaticandNonStatic.staticMethod();////  called with class name
        staticMethod();// called with direct method name


    }

}
