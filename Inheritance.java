package inheritance;

class parent1{
    int age = 100;
    void mathodparent1(){
        System.out.println("this method belongs to parent1 class. ");
    }
    void test (){
        System.out.println("Test method of parent class.");
    }
}
class child extends parent1{
    int ram(int a,int b){
        int c = a*b;
        return c;
    }
}
public class Inheritance extends parent1{
    public static void main(String[] args) {
        Inheritance abc = new Inheritance();
        child apm = new child();
        int c = apm.ram(11,10);
        System.out.println(c);

        System.out.println(abc.age);
        abc.mathodparent1();
        abc.test();
    }

}

