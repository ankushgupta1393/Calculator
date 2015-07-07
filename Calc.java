import java.util.*;    //imports scanners

public class Calc {


    public static void main(String[] args) {
        boolean go = true;    //sets up loop

        while(go)    //creates loop to top
        {
            System.out.println("Type your choice!");
            System.out.println("To Add, type A \nTo Subtract, type B \nTo Multiply, type C \nTo Divide, type D \nTo Square root, type E \nTo find Exponent, type F \nTo find Absolute, type G \nTo round a number, type H \nTo calculate modulus, type I");
            

            Scanner scan = new Scanner(System.in);    //sets up scanners
            Scanner scan1 = new Scanner(System.in);


            String action = scan.nextLine();    //tells comp. to take user input
            
            if("A".equals(action))    //addition
            {
                System.out.println("Enter the first number");
                float add1 = scan.nextFloat();
                if(add1==0){
                    break;
                }
                System.out.println("Enter the second number.");
                float add2 = scan.nextFloat();
                float add3 = add1 + add2;
                System.out.println(add3);          
            }
            if("B".equals(action))    //subtraction
            {
                System.out.println("Enter the first number");
                double sub1 = scan.nextDouble();
                System.out.println("Enter the second number.");
                double sub2 = scan.nextDouble();
                double sub3 = sub1 - sub2;
                System.out.println(sub3); 
            }
            if("C".equals(action))    //multiplacation
            {
                System.out.println("Enter the first number");
                double mul1 = scan.nextDouble();
                System.out.println("Enter the second number.");
                double mul2 = scan.nextDouble();
                double mul3 = mul1 * mul2;
                System.out.println(mul3); 
            }
            if("D".equals(action))    //division
            {
                System.out.println("Enter the first number");
                double div1 = scan.nextDouble();
                System.out.println("Enter the second number.");
                double div2 = scan.nextDouble();
                double div3 = div1 / div2;
                System.out.println(div3); 
            }

             if("E".equals(action))    //square_root
            {
                System.out.println("Enter the number");
                double sqrt = scan.nextDouble();
                double root = Math.sqrt(sqrt);
                System.out.println(root); 
            }

             if("F".equals(action))    //exponent
            {
                System.out.println("Enter the number");
                double a = scan.nextDouble();
	            System.out.println("Enter the exponent");
                double b = scan.nextDouble();
	            double res = Math.pow(a,b);
                System.out.println(res); 
            }
	         if("G".equals(action))    //absolute
            {
                System.out.println("Enter the number");
                double a = scan.nextDouble();
	            double res = Math.abs(a);
                System.out.println(res); 
            }

            if("H".equals(action))    //round
            {
                System.out.println("Enter the number");
                double a = scan.nextDouble();
                double res = Math.round(a);
                System.out.println(res); 
            }

            if("I".equals(action))    //modulus
            {
                System.out.println("Enter the first number");
                double a = scan.nextDouble();
                System.out.println("Enter the second number");
                double b = scan.nextDouble();
                double res = a % b;
                System.out.println(res); 
            }
    
	
            
            
            scan.nextLine();
            System.out.println("Would you like to start over? (Y,N)");           
            String startOver = scan.nextLine();

            if("N".equals(startOver))
            {
                go = false;
                System.out.println("Bye");
            }
        }
        System.out.println("Bye");
    }                                  
}