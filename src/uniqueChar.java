
public class uniqueChar {

	static String str = "Hello";
	static char [] x = str.toCharArray();
	static int count =0;
	
	private void unique(char [] t){
		for(int i = 0; i < t.length ; i++){
			for(int j = i+1; j< t.length;j++){
			if(t[i] == t[j]){
				count ++;
			}
		}
	}
	}
	public static void main(String[] args) {
		
		uniqueChar uc = new uniqueChar();
		uc.unique(x);
		System.out.println(count);
	}

}
