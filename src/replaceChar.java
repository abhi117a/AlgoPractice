
public class replaceChar {
	static String str = "Mr John Smith    ";
	static char[] x = str.toCharArray();
	static int q = 12;
	static int len = x.length-1;
	private void move(char[]x){
		while(q>=0){
		if(x[q]!=' '){
			x[len] = x[q];
			len--;
			q--;
		}
		else{
			x[len] = '0';
			len--;
			x[len] = '2';
			len--;
			x[len] = '%';
			len--;
			q--;
		}
		}for(int i=0; i <x.length;i++){
		System.out.print(x[i]);
	}}
	
	
	public static void main(String[] args) {
		replaceChar rc = new replaceChar();
		rc.move(x);
		//System.out.println(x.length);

	}

}
