import java.util.Arrays;


public class chkPermutation {
	static String str1 = "kkkkq";
	static String str2 = "qkkkk";
	static char x[] = str1.toCharArray();
	static char y[] = str2.toCharArray();
	int i=0;
	private int chck(String str1, String str2){
		if(str1.length() != str2.length()){
			return 1;
		}
		return 0;
	}
	private int cmpr(char x[],char [] y ,int i){
		if(i>=x.length){
			return 0;
		}else{
			if(x[i]!=y[i]){
				return 1;
			}
			else
		{
			return cmpr(x,y,++i);
		}}
		
	}
	
	private int chPermu(char[]x,char[]y){
		for(int k=0; k <= x.length; k++){
		for(int j=0; j <=y.length;j++){
			if(x[k] != y[j]){
				return 1;
			}
			
		}
	}
		return 0;
	}
	
	private void chkPermu(char[]x,char[]y){
		Arrays.sort(x);
		Arrays.sort(y);
		
		for(int i=0; i<x.length;i++){
			if(x[i]==y[i]){
				System.out.println("OK");
			}
			else System.out.println("No OK");
		}
	}
	
	
	public static void main(String[] args) {
		chkPermutation cp = new chkPermutation();
//		System.out.println(cp.chck(str1, str2));
//		System.out.println(cp.cmpr(x, y, 0));

		cp.chkPermu(x, y);
		
	}

}
