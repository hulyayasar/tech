package day23overriding;

class A{
    public A(int i){
        System.out.println("Class A int Constructor");
    }
    public A(){
        System.out.println("Class A Constructor");
    }
}
class B extends A{
    public B(){
    	super(5);
        System.out.println("Class B Constructor");
    }
    public B(double d){
        System.out.println("Class B double Constructor");
    }
}
class C extends B{
    public C(){
        System.out.println("Class C Constructor");
    }
    public C(String s){
    	super(1.2);
        System.out.println("Class C String Constructor");
    }
}
class MainClass{
    public static void main(String[] args){
       // B obj = new C();
        
    }
}

