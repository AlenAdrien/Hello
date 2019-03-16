package Hello;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        System.out.println("Hello Warld");
	    Scanner in =new Scanner(System.in);
//	    System.out.println(in.nextLine());
        int foot;
        double inch;
        foot=in.nextInt();
        inch=in.nextInt();	
	    System.out.println((int)((foot+inch/12)*0.3048*100));
	}

}