import java.util.*;    //imports scanners

public class Calc {

    public static void main(String[] args) {
        boolean go = true;    //sets up loop

        while(go)    //creates loop to top
        {
            System.out.println("Type your choice!");
            System.out.println("To add, type a \nTo subtract, type s \nTo multiply, type m \nTo divide, type d \nTo square root, type e \nTo find exponent, type f \nTo find absolute, type g");
            

            Scanner scan = new Scanner(System.in);    //sets up scanners
            Scanner scan1 = new Scanner(System.in);


            String action = scan.nextLine();    //tells comp. to take user input

            if("a".equals(action))    //addition
            {
                System.out.println("Enter the first number");
                double add1 = scan.nextDouble();
                System.out.println("Enter the second number.");
                double add2 = scan.nextDouble();
                double add3 = add1 + add2;
                System.out.println(add3);          
            }
            if("s".equals(action))    //subtraction
            {
                System.out.println("Enter the first number");
                double sub1 = scan.nextDouble();
                System.out.println("Enter the second number.");
                double sub2 = scan.nextDouble();
                double sub3 = sub1 - sub2;
                System.out.println(sub3); 
            }
            if("m".equals(action))    //multiplacation
            {
                System.out.println("Enter the first number");
                double mul1 = scan.nextDouble();
                System.out.println("Enter the second number.");
                double mul2 = scan.nextDouble();
                double mul3 = mul1 * mul2;
                System.out.println(mul3); 
            }
            if("d".equals(action))    //division
            {
                System.out.println("Enter the first number");
                double div1 = scan.nextDouble();
                System.out.println("Enter the second number.");
                double div2 = scan.nextDouble();
                double div3 = div1 / div2;
                System.out.println(div3); 
            }

             if("e".equals(action))    //square_root
            {
                System.out.println("Enter the number");
                double sqrt = scan.nextDouble();
                double root = Math.sqrt(sqrt);
                System.out.println(root); 
            }

             if("f".equals(action))    //exponent
            {
                System.out.println("Enter the number");
                double a = scan.nextDouble();
	            System.out.println("Enter the exponent");
                double b = scan.nextDouble();
	            double res = Math.pow(a,b);
                System.out.println(res); 
            }
	 if("g".equals(action))    //absolute
            {
                System.out.println("Enter the number");
                double a = scan.nextDouble();
	            double res = Math.abs(a);
                System.out.println(res); 
            }
	
            
            }
            scan.nextLine();
            System.out.println("Would you like to start over? (yes,no)");           
            String startOver = scan.nextLine();

            if("no".equals(startOver))
            {
                go = false;
                System.out.println("Bye");
            }
        }
    }                                  
}