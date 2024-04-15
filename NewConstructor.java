public class NewConstructor {
    int Area;

    NewConstructor(int length , int breadth){

    Area = length * breadth;
    System.out.println("The Area of the Rectangle is: " + Area + "cm2");
    }


     public static void main(String[] args) {
        new NewConstructor(40, 50);
     }
    
}
