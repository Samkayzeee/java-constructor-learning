public class Constructor{
    double Area;

    Constructor(int length, int breadth){
        Area = length * breadth;
        System.out.println("-------------------");
        System.out.println("The Area of the Rectangle is: " + "\t" + Area + "cm2");
    }

    Constructor(double base, double height){
        Area = 0.5 * base * height;
        System.out.println("The Area of the Traingle is: " + "\t" + Area + "cm2");
    }

    Constructor(double radius){
        Area = Math.PI * radius * radius;
        System.out.println("----------------------");
        System.out.println("The Area of the Circle is: " + "\t" + Area + "cm2");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        new Constructor(30, 60);
        new Constructor(20.60, 60.30);
        new Constructor(45.6);
    }



    Constructor(){

    }


    
}