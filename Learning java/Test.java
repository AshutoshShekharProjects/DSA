/*
public class Test {
    Test(Object object){
        System.out.println("Hello");
    }
    Test(Test test){
        System.out.println("World");
    }
    public static void main(String[] args){
        Test t=new Test(null);
    }
}*/

class NestingTryCC {
    // main method
    public static void main(String args[]) {
        // main try-block
        try {
            // try-block2
            try {
                // try-block3
                try {
                    int arr[] = {1, 2, 3, 4};
                    System.out.println(arr[10]);
                }
                // handles ArithmeticException if any
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException");
                    //System.out.println(" try-block1****");
                    e.printStackTrace();
                }
                int a = 5, b = 0;
                System.out.println(a / b);
            }
            // handles ArithmeticException if any
            catch (ArithmeticException e) {
                //System.out.println("Arithmetic exception");
                System.out.println(" try-block2*****");
                e.printStackTrace();
            }
            //int arr[]={ 1, 2, 3, 4, 5, 7, 8, 10};
            //System.out.println(arr[10]);
            String name = null;
            System.out.println(name.length());

        }
        // handles ArrayIndexOutofBoundsException if any
        catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(" main try-block");
            e.printStackTrace();
        }
        catch (Exception e) {
            //System.out. print("Exception");
            System.out.println("Exception handled in main try-block*******");
            e.printStackTrace();
            //System.out.println(e.toString());
        }
    }
}

//public class Test extends Exception{
//    public static void main(String[] args){
//        try{
//            throw new Test();
//        } catch (Test t){
//            System.out.println("Got the Test Exception");
//        }
//        finally{
//            System.out.println("Inside finally block");
//            System.out.println("\u0048\u0065\u006c\u006c\u006f\u0020\u0057\u006f\u0072\u006c\u0064");
//        }
//    }
//}

