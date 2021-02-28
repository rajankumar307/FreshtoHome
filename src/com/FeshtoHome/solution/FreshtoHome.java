package com.FeshtoHome.solution;
import java.util.*;
public class FreshtoHome {
	static int minimumTimeRequired(int time[],int total_item,int no_of_worker)
	{
		int low=1;
		int high=(int)Math.pow(10,4);
		int item;
		int min_time=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			item=0;
			for(int i=0;i<no_of_worker;i++)
			{
				item+=mid/time[i];
				if(item>=total_item)
					break;
				
			}
			if(item>=total_item)
			{
				min_time=mid;
				high=mid-1;
				
			}
			else
				low=mid+1;
		}
		return min_time;
	}
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
    int no_of_worker=sc.nextInt();
    int total_item=sc.nextInt();
    int time[]=new int[no_of_worker];
    for(int i=0;i<no_of_worker;i++)
      time[i]=sc.nextInt(); 
	int ans=minimumTimeRequired(time,total_item,no_of_worker);
	System.out.println(ans);
 }
}
