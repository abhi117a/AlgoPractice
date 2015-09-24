
public class MatchString {
	static String st = "Hello wow";
	static	String st1 = "Hell wow";
	static char []x = st.toCharArray();
static	char[] y = st1.toCharArray();
	static int count =0;
	static int j = 0; 
	private static void chck(){
		for(int i=0; i < x.length-1;i++){
			if(x[i]==y[j]){
				count++;
				x[i] =  ' ';
				j++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatchString ms = new MatchString();
		ms.chck();
	}

}
