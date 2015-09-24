
public class arraySortCheck {
	static int [] x = {1,2,3,4,5,1};
	
	private int chck(int[] x, int start){
		if(start +1 >= x.length){
			return 1;
		}
		else {
			if (x[start] <= x[start+1]){   //(x[start+1-1) == x[start]])
				return chck(x,++start);
			}
			else {
				return 0;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraySortCheck as = new arraySortCheck();
		System.out.println(as.chck(x, 0));
		
	}

}
