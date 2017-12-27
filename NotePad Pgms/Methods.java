import java.util.Scanner;
class Methods{
	public static void main(String[] arg){
		System.out.println("Main begins");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 decial values to perfom addition"  );
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		sc.close();
		double res=addition(a,b);
		System.out.println("Addition of a & b is "+res); 
		System.out.println("Main ends");
		
	}//End of main
	
	static double addition(double a,double b){
		System.out.println("Addition begins");
		double res = a+b;
		System.out.println("Addition ends");
		return res;
	}
	
}//End of class	
