package xxx;

public class test2 {

	public static void main(String[] args) {
		String x="jklmnopqrstuvwxyz";
		String y="abcdefghijklmnopqrstuvwxyz";
		int number=5;
		int count=0;
	//	System.out.println(x.matches(y));
		
	//	boolean regionMatches(int toffset, String other, int ooffset, int len)
		while(!x.regionMatches(0, y, count, number)){
			count++;	
		}
		System.out.println(x.regionMatches(0, y, count, number));
	//	System.out.println(x.regionMatches(0, y, 1, number));

	}

}
