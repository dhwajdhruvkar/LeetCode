class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writting Something");
    }

    public void printColor(){
        System.out.println(this.color); //this. here is to give the value to object
    }

    public void printType(){
        System.out.println(this.type);
    }
}

public class oops1{ 
    public static void main(String[] args){
        Pen pen1 = new Pen(); //Creating an object
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen(); //Creating an object
        pen2.color = "black";
        pen2.type = "ballpointer";

        pen1.printColor();
        pen1.printType();

        pen2.printColor();
        pen2.printType();
    }
}