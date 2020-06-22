class Shape {
    public String toString() { return("Shape Class"); }
} 

class Square extends Shape {
    public String toString() { return("Square Class"); }
}

class Circle extends Shape {
    public String toString() { return("Circle Class"); }
}

class Rectangle extends Shape {
    public String toString() { return("Rectangle Class"); }
    public boolean m1() { return(true); }
}

public class Downcasting {
    public static void main(String[] args) {
        Shape[] arr = {new Square(), new Circle(), new Rectangle()};
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i].toString());
            if(arr[i] instanceof Rectangle) {
                Rectangle r = (Rectangle)arr[i];
                System.out.println(r.m1());
                // Another mehtod of downcasting   
                ((Rectangle)arr[i]).m1();
              }
        }
    }
}
