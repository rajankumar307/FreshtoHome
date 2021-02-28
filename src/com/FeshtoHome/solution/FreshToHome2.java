package com.FeshtoHome.solution;
import java.util.*;
public class FreshToHome2 {
    static int calculateTotalEgg(int day_yesterday[],int yesterday[],int today[])
    {
    	int total_egg=0;
    	for(int i=0;i<8;i++)
    		total_egg+=today[i];
    	int sum=0;
    	for(int i=8;i<12;i++)
    	{
    		sum+=day_yesterday[i]+yesterday[i];
    	}
    	total_egg+=sum/4;
    	return total_egg;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int day_yesterday[]= new int[12];
	int yesterday[]= new int[12];
	int today[]= new int[8];
	for(int i=0;i<12;i++) {
		day_yesterday[i]=sc.nextInt();
		yesterday[i]=sc.nextInt();
	}
	for(int i=0;i<8;i++)
		today[i]=sc.nextInt();
	int total_egg=calculateTotalEgg(day_yesterday,yesterday,today);
	System.out.print(total_egg);
	

	}

}
