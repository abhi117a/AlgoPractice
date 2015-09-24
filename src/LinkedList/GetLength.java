
package LinkedList;
import java.util.ArrayList;
import java.util.Collections;
public class GetLength {

	static int [] a = {4,5,7,8};
	static int [] b = {11,99,4,5};
	static int [] c = {1,2,3,83};
	static int sum =10000;
	static int maxSum =sum;
	private static void chck(){
	for (int i=0; i < a.length;i++){
		for(int j=0; j < a.length;j++){
		sum = a[i]-b[j];
		sum = Math.abs(sum);
		if(sum < maxSum){
			maxSum = sum;
		}
		}
		
	}
	System.out.println(maxSum);
	}
	
	private static void findPrime(int val, int post){
		int [] x;
		int chck=0;
		int num;
		while( chck != post+1){
		for(int i= 2; i <val ; i++){
			if(val%2 == 0){
				break;
			}
			if(i == val+1){
				chck++;
			}
		}
		val++;
		}
		System.out.println(val);
	}
	private static void findConsec(){
		int []x = {1,2,3,10,25,26,30,31,32,33};
		int sum =0;
		for(int i=0 ; i < x.length-1;i++){
			if(x[i+1]-x[i]==1){
				System.out.println(x[i]);
				//System.out.println(x[i+1]);
				i++;
			}
			if(x[i]-x[i-1]==1){
				System.out.println(x[i]);
			}
		}
	}
	
	
	

	
		public static void removDups() 
		{
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			a1.add(3); a1.add(1); a1.add(4); a1.add(3); a1.add(6);
			Collections.sort(a1);
			
			for(int i=0;i<a1.size()-1;i++)
			{
				if(a1.get(i) == a1.get(i+1))
				{
					a1.remove(i+1);
				}
			}
			System.out.println(a1.toString());
		}
	
	
	
	public static void main(String[] args) {
		GetLength gl = new GetLength();
		//gl.chck();
		//gl.findPrime(3, 5);
		gl.findConsec();
	}

}
