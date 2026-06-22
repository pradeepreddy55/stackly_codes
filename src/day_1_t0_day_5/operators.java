package day_1_t0_day_5;

public class operators {

	public static void main(String[] args) {
		
		int a = 10;
		int b=20 ;
		int c= 30;
		
		System.out.println("-----Arithmetic operator-----");
		System.out.println("the sum of the values is :"+ (a+b+c));
		System.out.println("the subtraction of the values is :"+ (c-a));
		System.out.println("the multiplication of the values is :"+ (a*b*c));
		System.out.println("the division of the values is :"+ (c/b));
		System.out.println("the modulo of the values is :"+ (b%a));
		
		System.out.println("-----Assignment operator-----");
	    a += 5; 
	    System.out.println("After += : " + a);
	    a -= 5; 
	    System.out.println("After -= : " + a);
        a *= 2; 
	    System.out.println("After *= : " + a);
        a /= 2;   
        System.out.println("After /= : " + a);
		
        System.out.println("-----Relationl operator-----");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        
        System.out.println("------Logical operators------");
        System.out.println((a > b) && (a > 0));
        System.out.println((a < b) || (a > 0));
        System.out.println(!(a > b));
        
        System.out.println("-----unary operator------");
        System.out.println("increment :"+ a++);
        System.out.println("decrement :"+ a--);
        System.out.println("increment :"+ ++a);
        System.out.println("increment :"+ --a);
        
        System.out.println("------Ternary operator-----");
        int largest = (a > b) ? a : b;
        System.out.println("Largest number is: " + largest);


        
        
        
        
        
	}

}
