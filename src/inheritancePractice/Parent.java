package inheritancePractice;

public class Parent {

    int parentAge = 40;
    String parentName ="shiva";

    static String address="hydrabad";

    final String motherName= "lilla";

    final static  String uncleName= "rohan"; // doesnot part in inheritance


    final void finalMethod(){  // final method does not override
        System.out.println("this is parent final method");
    }


    public static void staticMethod(){
        System.out.println(" this is parent static method");
    }

    public Parent(){
        System.out.println("parent class default constructor");
    }

    public Parent(int parentAge, String parentName) {
        this.parentAge = parentAge;
        this.parentName = parentName;
    }

    public void getParentDetail() throws RuntimeException{
        System.out.println("parent class ");
if (parentAge>35){
    System.out.println("called as a parent");
}
else {
    System.out.println("not call as a parent");
}
    }

}
