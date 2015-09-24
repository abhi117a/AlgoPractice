
public class fibonaciSeries {

	private int fibonaci(int n){
		if(n <= 1) {
			return n;
		}
		
		else {
			return fibonaci(n -1) + fibonaci(n-2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibonaciSeries fs = new fibonaciSeries();
		System.out.println(fs.fibonaci(4));
		
	}

}
