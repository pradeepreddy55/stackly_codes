package day_1_t0_day_5;

public class string_methods {

	public static void main(String[] args) {
		String s1="Pradeep Reddy";
		String s2="pradeep reddy";
		
		 //length()
        System.out.println("Length: " + s1.length());

        //charAt()
        System.out.println("Character at index 6: " + s1.charAt(6));

        //toUpperCase()
        System.out.println("Upper Case: " + s1.toUpperCase());

        //toLowerCase()
        System.out.println("Lower Case: " + s1.toLowerCase());

        //equals()
        System.out.println("Equals: " + s1.equals(s2));

        //equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));

        //contains()
        System.out.println("Contains Pradeep: " + s1.contains("Pradeep"));

        //startsWith()
        System.out.println("Starts With Pradeep: " + s1.startsWith("Pradeep"));

        //endsWith()
        System.out.println("Ends With Reddy: " + s1.endsWith("Reddy"));

        //indexOf()
        System.out.println("Index of Pradeep: " + s1.indexOf("Pradeep"));
        
        // trim()
        String name = "   Pradeep   ";
        System.out.println("Trim: " + name.trim());

        //concat()
        System.out.println("Concat: " + s2.concat(" is a name"));



	}

}
