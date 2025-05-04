public class IfElsePractice {
    public static void main(String[] args) {

        int marks1= 35;
        int marks2=75;
        int marks3 = 35;
        int totalpercentage=35;


        if (marks1>35 && marks2>75){
            System.out.println("A grade");
        }
        else {
            System.out.println("pass");
        }

        if ( marks3>35 || totalpercentage >35){
            System.out.println("passed");

        }
        else {
            System.out.println("failed");
        }



        boolean gender = false;

        if (!gender){

            System.out.println("male");
        }
        else{
            System.out.println("female");
        }


String name="rekha";
        if (name !="gauri"){
            System.out.println("i am gauri");
        }
else {
            System.out.println("i m not gauri");
        }
    }

}
