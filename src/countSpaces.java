
public class countSpaces {

	static String str = "H e l l o W o r l d";
	static char [] t = str.toCharArray();
	static int count = 0;
	private int space(char[] x, int start){
		if(start >= x.length -1) {
			return 0;
		}
		else {
				if(x[start] != ' '){
					return space(x,++start);
				}
				else {
					count++;
					//System.out.println(count);
					return count +space(x,++start);
				}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countSpaces cs = new countSpaces();
		cs.space(t,0);
		System.out.println(count);
	}

}
