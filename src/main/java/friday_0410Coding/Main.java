package friday_0410Coding;

public class Main {

 // Do not modify the code below:
 public static void main (String[]args){

		Triangle object = new Triangle();

		int a = 7;
     int b = 10;
     int c = 35;

     int perimeter = object.perimeterCalculator(a,b,c);
     int area = object.areaCalculator(7,10);

     System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
 }
}



