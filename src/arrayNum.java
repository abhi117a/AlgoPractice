import java.util.Arrays;


public class arrayNum {
	static int x[] = {45,67,9,7,800};
	static float z[]  = new float[4];
	static String y[];
	static int val=0;
	
	private void calC(int[]x){
		for(int i=0; i < x.length; i++){
			val = String.valueOf(x[i]).length(); 
			z[i]= x[i]/(int) Math.pow(10, val);
			System.out.println(z[i]);
		}
		Arrays.sort(z);
		
		for(int i =0 ; i <z.length;i++){
			System.out.println(z[i]);
			//z[i] = z[i]
		}
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayNum aN = new arrayNum();
		aN.calC(x);
	}

}
