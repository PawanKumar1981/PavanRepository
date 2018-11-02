package JavaExample;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Orginal ="pavan",reverse="";
		int len= Orginal.length();
		for(int i=len-1; i>=0; i--) {
			reverse =reverse+Orginal.charAt(i);
		}
System.out.println("The reverse string is" +    reverse);
	}

}
