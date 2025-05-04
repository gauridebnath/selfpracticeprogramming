package InterfacePractice.com;

import javax.swing.*;

public interface Gauri {

   void meth1();

   default void meth2(){
      System.out.println(" i am default 2 ");
   }
}
