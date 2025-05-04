package inheritancePractice;

//instance method resolve in run time
// static methods vaariables resolve in compiletime

public class Child extends Parent {

    int parentAge = 50; //overiding parent vale
    static String address="mumbai";  //hiding parent vakue

    private String address2;

    public static void staticMethod(){
        System.out.println(" this is child static method");
    }

    @Override
    public void getParentDetail()  {
        System.out.println(parentAge);
        System.out.println(parentName);
        System.out.println("child class print");
        System.out.println(super.parentAge);          //////// super. this access only for instance keyword use for parent class
        //motherName="neha";                       ///  final variable we can use but not change the value
        System.out.println(super.motherName);
        System.out.println(address);               // static variable directly access
    }

    public Child(){
        System.out.println("child class default constructor");
    }





    public static void main(String[] args) {

//            Parent parent = new Parent();
//            parent.getParentDetail();
//            Parent.staticMethod();
//
//            Child child= new Child();
//            child.getParentDetail();
//            child.staticMethod();

            Parent parent = new Child();
            parent.getParentDetail();
            parent. staticMethod(); //
        System.out.println(parent.address);

        }
    }



