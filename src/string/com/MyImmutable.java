package string.com;

import java.util.Collections;

public final class MyImmutable {
    private int id;
    private  String name;

    private static MyImmutable myImmutable;
  private MyImmutable() {

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static MyImmutable createObject(){

        if(myImmutable == null){
            MyImmutable myImmutable = new MyImmutable();
       MyImmutable.myImmutable=myImmutable;
       return myImmutable;
        }
  else {
      return myImmutable;
        }
    }
}
