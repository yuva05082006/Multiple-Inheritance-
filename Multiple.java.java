interface Animal{
    void shout();
}
interface Reptiles{
    void sleep();
}
class Frog implements Animal,Reptiles{
    public void shout(){
        System.out.println("The Animal is Shouting");
    }
    public void sleep(){
        System.out.println("The Reptile is sleeping");
    }
}
public class Main {
    public static void main (String[] args){
        Frog a=new Frog();
        a.shout();
        a.sleep();
    }
}
    