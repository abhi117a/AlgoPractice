
public class Rotationalsubstring {

	String str = "waterbottle";
	String st = "erbottlewat";
	
	
	private boolean chck(String str, String st){
	int find =st.indexOf(str.charAt(0));
	for(int i =0; i <str.length();i++){
		if(str.charAt(i)== st.charAt(find)){
			find++;
			if(find == st.length()){
				find = 0;
			}
			continue;
		}
		else {
			return false;
		}
	}
	return true;
	
	
	}
		
		
	
	
	public static void main(String[] args) {
		
	}

}
