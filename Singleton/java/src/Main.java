
/* Singleton Pattern
*  Creating object using singleton pattern and comparing their reference to ensure single instance
* */
public class Main {

    public static void main(String args[]){

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2)
            System.out.println("Same objects");

        else
            System.out.println("Different objects");

    }
}


/* Singleton pattern */
class Singleton {
    private static Singleton obj = null;

//    private: so it cannot be accessible from outside
    private Singleton(){

    }

//    method to create instance
    public static Singleton getInstance(){
        return obj;
    }

}


