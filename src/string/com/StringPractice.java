package string.com;

public class StringPractice {
    public static void main(String[] args) {

        String str = "gauri";
        str.concat("abc");
        System.out.println(str);


        StringBuffer stringBuffer= new StringBuffer("gauri");
      stringBuffer.append("abc");
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("gauri");
        stringBuffer.append("ggggggggg");
        System.out.println(stringBuffer);

//MyImmutable myImmutable = new MyImmutable();

        MyImmutable object = MyImmutable.createObject();
        System.out.println(object);

        MyImmutable object2 = MyImmutable.createObject();
        System.out.println(object2);
    }


}
