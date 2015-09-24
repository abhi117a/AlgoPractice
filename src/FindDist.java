import java.util.Arrays;


public class FindDist {

	private static void findDist(int P1, int P2, int P3, int P4){
		int []x = {0,0,0,0,0,0};
		x[0] = P1-P2;
		x[1] = P2-P3;
		x[3] = P3-P4;
		x[4] = P1-P3;
		x[5] = P2-P4;
		Arrays.sort(x);
		if(x[0]==x[1]&& x[2]==x[1] &&  x[2]==x[3] && x[1]==x[3] && x[4]==x[5]){
			System.out.println("Square");
		}
		else if(x[0]==x[1]&& x[2]==x[3] && x[4]==x[5]){
			System.out.println("Rectangle");
		}
		else{
			System.out.println("Neither");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
