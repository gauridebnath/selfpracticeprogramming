package StreamPractice;

public class AbstractionImplimentation implements AbstractionPractice{
    @Override
    public void meth1(int id) {
        System.out.println("hello java");
    }

    @Override
    public void meth2(String name) {
        System.out.println("my name is gauri");

    }

    public static void main(String[] args) {
        AbstractionImplimentation abstractionImplimentation = new AbstractionImplimentation();
        abstractionImplimentation.meth1(1);
        abstractionImplimentation.meth2("rani");
    }



}
