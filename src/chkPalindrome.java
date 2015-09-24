
public class chkPalindrome {
	
	static String chk = "madam";
	static char[] x = chk.toCharArray();
	String ans = "String is Palindrome";
	String altAns = "String is not Palindrome";
	private String palindrome(char[] str, int start, int end){
		if (start >= end){
			return ans;
		}
		else {
			if(str[start]!= str[end] ){
				return altAns;
			}
			else {
				return palindrome(str, ++start, --end);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		chkPalindrome cp = new chkPalindrome();
		System.out.println(cp.palindrome(x, 0, chk.length()-1));
		
		
	
	}

}
