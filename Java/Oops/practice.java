// class bike {
//     String brand ;
//     int price;
//     String colour;

//      void drive (){
//         System.out.println(brand + "is starting to drive");

//      }
// }


// public class practice{
//     public static void main (String [] args ){
// bike b1 = new bike ();
// b1.brand = "bullet";
// b1.price = 3500000;
// b1.colour = "black";
// b1.drive();     
//     }
// }



// class vehicle {
//     void drive() {
//         System.out.println("Vehicle is driving");
//     }
//     void stop() {
//         System.out.println("Vehicle has stopped");
//     }   
//     void changeGear() {
//         System.out.println("Vehicle gear changed");
//     }   
// }
// class car extends vehicle {
//     @Override
//     void changeGear() {
//         System.out.println("Car gear changed");
//     }
//     void openSunroof() {
//         System.out.println("Car sunroof opened");
//     }   
//     @Override
// void drive() {
//         System.out.println("Car is driving");
//     }
// }
// class bike extends vehicle {
//     @Override
//     void changeGear() {
//         System.out.println("Bike gear changed");
//     }
//     void popWheelie() {
//         System.out.println("Bike is popping a wheelie");
//     }   
// }

// public class practice {
//     public static void main(String[] args) {
//         vehicle myVehicle = new vehicle();
//         myVehicle.drive();
//         myVehicle.changeGear();
//         myVehicle.stop();

//         car myCar = new car();
//         myCar.drive();
//         myCar.changeGear();
//         myCar.openSunroof();
//         myCar.stop();

//         bike myBike = new bike();
//         myBike.drive();
//         myBike.changeGear();
//         myBike.popWheelie();
//         myBike.stop();
//     }
// }



//classes and objects

// class car {
//     String brand ;
//     int year;

//     void drive (){
//         System.out.println(brand + "iss getting ready ");

//     }
// }

// public class practice {
//     public static void main(String[] args){
//         car c1 = new car();
//         c1.brand = "G_wagon";
//         c1.year =2025;
//         c1.drive();

//         car c2 = new car();
//         c2.brand = "BMW";   
//         c2.year = 2024;
//         c2.drive(); 

//     }
// }


// question1

//java program to calculate cgpa of 3 subjects

// public static void main (String [] args){
// float subject1= 45;
// float subject2= 55;
// float subject3= 65;
// float cgpa = (subject1 + subject2 + subject3)/30;
// System.out.println("CGPA is :" + cgpa);
// }


// Quetion 2

//java program to take input from user and print Hello <name> have a good day

// public static void main (String [] args){
// Scanner sc= new Scanner (System.in);
// System.out.print("Enter your name");
// String name = sc.nextLine() ;
// System.out.println("Hello " + name +"have a good day");
// sc.close();
// }









// Question 3
//java program to convert km to miles and miles to km


// import java.util.Scanner;
// public static void main (String [] args){
//     Scanner sc = new Scanner (System.in);
//     System.out.print("Select Conversion ");
//     System.out.print("1. km to miles ");
//     System.out.print("2. miles to km ");    
//     System.out.print("Enter the number :");
//     float Choice = sc.nextInt();

//     if (Choice ==1){
//         System.out.println("Enter the number in km :"); 
//         float km=sc.nextFloat();
//         float m= km* 0.621371f;
//         System.out.println("The Kilometer " + m + " in miles");
//     }
//     else  if(Choice ==2){
//         System.out.println("Enter the number in miles :"); 
//         float m=sc.nextFloat();
//         float km=m* 1.60934f;
//         System.out.println("The miles " + km + " in Kilometer");


//     }
//     else {
//         System.out.println("Invalid input");
//     }
//     sc.close();
//     }


// Question 4
//java progaram to to select wheter number entered by user is integer or float

// import java.util.Scanner;
// public class practice {
//     public static void main (String [] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the number :");
//         if (sc.hasNextInt()){
//             int num = sc.nextInt();
//             System.out.println("The number is integer :" + num);
//         }
//         else if (sc.hasNextFloat()){
//             float num = sc.nextFloat();
//             System.out.println("The number is float :" + num);
//         }
//         else {
//             System.out.println("Invalid input");
//         }
//         sc.close(); 
//     }
// }


// OR


import java.util.Scanner;
public class practice {
    public static void main (String [] args){
        System.out.println("Enter the number :");
        Scanner sc = new Scanner (System.in);
        System.out.println(sc.hasNextInt());
 
    }
}