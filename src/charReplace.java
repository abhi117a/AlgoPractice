


public class charReplace {

	static String str = "aabbccdd";
	static char[] x = str.toCharArray();
	
	private int rep(char[] t, int start){
		if(start >= t.length -1){
			return 0;
		}
		else {
			if(x[start] != 'b'){
				
				return rep(t,++start);
			}
			else{
				x[start] = 'x';
				return rep(t,++start);
			}
		}
		
	}
	
	public static void main(String[] args) {
		charReplace cr = new charReplace();
		cr.rep(x, 0);
		System.out.println(String.valueOf(x));

	}

}
