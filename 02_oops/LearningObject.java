// package Java-DSA.02_oops;

class car{

    String color;
    String Brand;

    //here this keyword refer to the current object i.e., the instance variable

    car(String col, String Brnd){
        this.color=col;
        this.Brand=Brnd;
    }

    car(){
        //calling a constructor with similar parameter
        //also accessing its argument, color and brand
       this("Black", "ALTO");
    }

    car(car name){
        //passing a constructor
        this.Brand=name.Brand;
    }

    void Driving(){
        System.out.println("The car is running");
        System.out.println(Brand);
        System.out.println(color);
    }

}
public class LearningObject {

    public static void main(String[] args) {
        car c1=new car("Red","Mustang");
        //Constructor overloading => Having same name with different parameter

        car c2=new car("Yellow","mUstang");

        car c3=new car();
        System.out.println(c3.Brand);
        System.out.println(c3.color);
        c3.Driving();

        car c4=new car(c1);//Here c4 is is passing c1 reference to its constructor, its like passing constructor as an argument


        // car c2=new car();
        // car c2=c1;
        // System.out.println(c1.Brand="BMW");
        // c2.Driving();
        // c2.Brand="Mercedes";
        // c2.Driving();
        // c1.Driving();
        // c1.Driving();
        // c2.Driving();
        // c3.Driving();
        c4.Driving();



    }
}
