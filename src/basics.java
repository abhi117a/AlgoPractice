
public class basics {
	int height;
	int weight;
	int age;
	double result;
	
	void result(){
		result = height * weight * age;
		System.out.println(result);
	}
	public static void main(String[] args) {
		
		basics basics_1 = new basics ();
		basics_1.height = 10;
		basics_1.weight = 90;
		basics_1.age = 12;
		basics_1.result();
		

	}

}
