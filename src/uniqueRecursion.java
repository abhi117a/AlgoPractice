import java.util.ArrayList;


public class uniqueRecursion {
	static String str = "Hell";
	static char[] x = str.toCharArray();
	
	private static int unq(char [] t, int start, int dstart){
		if(dstart >= t.length){
			return 0;
		}
		else {
			if(t[start]!= t[dstart]){
				return unq(t,++start, ++dstart);
			}
			else {
				return 1;
				
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(unq(x,0,1));

	}

}
