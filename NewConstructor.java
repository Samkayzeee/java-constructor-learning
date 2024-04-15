public class NewConstructor {
    

    NewConstructor(){
    int length = 40;
    int breadth = 50;
    int Area;
    Area = length * breadth;
    System.out.println("The Area of the Rectangle is: " + Area + "cm2");
    }


     public static void main(String[] args) {
        new NewConstructor();
     }
    
}
