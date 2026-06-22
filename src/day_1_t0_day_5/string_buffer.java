package day_1_t0_day_5;

public class string_buffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		
		//append
		sb.append(" pradeep");
		System.out.println(sb);
		
		//insert
		sb.insert(6,"hi ");
	    System.out.println(sb);
	    
	    //replace
	    sb.replace(9, 20, "kiran");
		System.out.println(sb);
		
		//delete
		sb.delete(6, 8);
		System.out.println(sb);
	
		//reverse
		sb.reverse();
		System.out.println(sb);

	}

}
