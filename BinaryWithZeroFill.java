package wrapperclass;
import java.util.Scanner;

public class BinaryWithZeroFill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number between the 1 and 255:");
		int n=sc.nextInt();
		sc.close();
		int temp,index=0;
		int[] b=new int[20];
		temp=n;
		
		if(n<0||n>255) {
			System.out.println("Inavlid input please try again");
		}else {
			
		
         while(temp!=0) {
				b[index++]=temp%2;
				temp=temp/2;
				}
         if(index<8){
        	 for(int i=index;i<8;i++) {
        		 b[index++]=0;
        		 
        	 }
        
         }
		
				System.out.println("Its binary representation is:");
				for(int i=index-1;i>=0;i--) {
					System.out.print(b[i]);
				
			}
				 System.out.println();
		}

		
		
		
		
		}
	
		}
		

	


