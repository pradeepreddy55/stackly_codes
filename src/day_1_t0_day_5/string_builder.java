package day_1_t0_day_5;

public class string_builder {

	public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java");
		
		//append
		sb.append(" programing");
		System.out.println(sb);
		
		//insert
		sb.insert(5,"language ");
	    System.out.println(sb);
	    
	    //replace
	    sb.replace(5, 13, "code");
		System.out.println(sb);
		
		//delete
		sb.delete(5, 10);
		System.out.println(sb);
	
		//reverse
		sb.reverse();
		System.out.println(sb);


	}

}
