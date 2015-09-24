
public class ReverseString {

	static String str = "Abhimanyu";
	 static char [] t1 = str.toCharArray();
	 
	
	private int reverse(char [] t, int start, int end){
		if(start >= end) {
			return 1;
		}
		else{
			char temp;
			temp  = t[start];
			t[start] = t[end];
			t[end] = temp;
			return  reverse(t, ++start, --end);
		}
		
	}
	
	public static void main(String[] args) {
		
//		for(int i = 0; i < t.length ; i++){
//			System.out.println(t[i]);
//		}
		System.out.println(t1[0]);
		
//		ReverseString rs = new ReverseString();
//		rs.reverse(t1, 0, t1.length -1);
//		System.out.println(String.valueOf(t1));

	}

}
