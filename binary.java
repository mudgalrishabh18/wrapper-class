package wrapperclass;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number:");
		int n=sc.nextInt();
		sc.close();
		
		int temp,index1=0;
		int[] b=new int[40];
		temp=n;
		while(temp!=0) {
			b[index1++]=temp%2;
			temp=temp/2;
			
		}
		System.out.println("Given Number:"+n);
		System.out.println("Its Binary:");
	    for(int i = index1-1;i >= 0;i--){    
	        System.out.print(b[i]);    
	      } 
        }
        }
