import java.io.*;

class project3ioBonus{
	public static void main(String[]args){
		System.out.println("Hello Everyone!");
		InputStreamReader j = new InputStreamReader(System.in);
		BufferedReader m = new BufferedReader (j);
		System.out.println("Enter Height of the Triangle:");
		double height =0
		try{
			height=Integer.valueof(m.readLine());
		}
		catch(Exception p){
			System.out.println("Invalid number!")
			
		}
		for(int g=1; g<=height; g++){
			for(int h=1; h<height -(g-1);h++){
				System.out.print(" ");
			}
			for(int i=1; i<=g; i++){
				System.out.print("*");
				for(int j1=1; j1<i; j1+=i){
				System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
