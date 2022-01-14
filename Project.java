import java.util.*;

public class Main{

	public static void main(String[] args) {
	    int n;int sum=0;
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
        	String token=st.nextToken();
        	System.out.println(token);
        	n = Integer.parseInt(token);
            sum = sum + n;
        	System.out.println(sum);
        }
	}

}