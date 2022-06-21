package day0609;

public class StringBuffer1 {
	public static void main(String[] args) {
		String result1 = "";
		result1 += "Hello";
		result1 += " ";
		result1 += "world";
		System.out.println(result1);
		
		System.out.println("---------------");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("good");
		sb.append(" ");
		sb.append("morning");
		
		System.out.println(sb);
		
		System.out.println("---------------");
		
		StringBuffer sb1 = new StringBuffer();
		
		sb1.append("java");
		sb1.insert(2, "hello ");
		
		System.out.println(sb1);
		
		System.out.println(sb1.substring(2,7));
		
		System.out.println(sb1.reverse());
	}

}
