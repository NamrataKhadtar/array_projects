import java.io.*;
import java.util.*;
public class Array
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=n-1;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println("enter the value of p,x,ad z");
		int p=sc.nextInt();
		int x=sc.nextInt();
		int z=sc.nextInt();
		
		int res=findpthelement(n,arr,p,x,z);
		System.out.println("res"+res);
		
}
public static int findpthelement(int n,int arr[],int p,int x,int z){
	    int res=0;
	    int res_arr[]=new int[n];
	    for(int i=0,j=0;i<n;i++)
	    {
	        
	        if(arr[i]%x==z)
	        {
	            res_arr[j]=arr[i];
	            j++;
	        }
	       
	    }
	    int len=0;
	    for (int i=0; i<res_arr.length; i++){
            if (res_arr[i] != 0)
                len++;
        }
        int [] newArray = new int[len];
        for (int i=0,j=0; i<len; i++){
            if (res_arr[i] != 0) {
                newArray[j] = res_arr[i];
                j++;
            }
        }
	    
	    Arrays.sort(newArray);
	    
	    for(int i=0;i<newArray.length;i++)
	    {
	           System.out.println(newArray[i]);
	        
	    }
	    
	    int p_element=newArray[p-1];
	    System.out.println("p_elemet is:"+p_element);
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==p_element)
	         {
	             res=i;
	         }
	    }
	    
	    return res;
	}
	 
}
