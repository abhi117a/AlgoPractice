import java.util.ArrayList;


public class Kandenes {
	static int [] x = {-10,4,7,-9,21};
	
	private void subarr(int [] x){
		ArrayList<Integer> AL = new ArrayList<Integer>();
		int sum=0;
		int maxSum=0;
		int i=0;
		for(;i<x.length;i++){
			sum = sum+x[i];
			AL.add(x[i]);
			if(sum <= 0){
				AL.clear();
				sum = 0;
			}
			if(maxSum < sum){
				maxSum = sum;
			}
		}
		System.out.println(maxSum);
	}
	
	public static void main(String[] args) {
		Kandenes k = new Kandenes();
		k.subarr(x);

	}

}
