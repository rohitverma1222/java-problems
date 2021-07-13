    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Scanner;
    import java.util.StringTokenizer;
    import java.lang.Math;
    import java.util.*;
    //goal-10l codeforces (expert) 
    //15-20l chor 
    //germany,uk=europe
     
    public class som {
    	static class FastReader {
    		BufferedReader br;
    		StringTokenizer st;
     
    		public FastReader()
    		{
    			br = new BufferedReader(
    				new InputStreamReader(System.in));
    		}
     
    		String next()
    		{
    			while (st == null || !st.hasMoreElements()) {
    				try {
    					st = new StringTokenizer(br.readLine());
    				}
    				catch (IOException e) {
    					e.printStackTrace();
    				}
    			}
    			return st.nextToken();
    		}
     
    		int nextInt() { return Integer.parseInt(next()); }
     
    		long nextLong() { return Long.parseLong(next()); }
     
    		double nextDouble()
    		{
    			return Double.parseDouble(next());
    		}
     
    		String nextLine()
    		{
    			String str = "";
    			try {
    				str = br.readLine();
    			}
    			catch (IOException e) {
    				e.printStackTrace();
    			}
    			return str;
    		}
    	}
     
    	public static void main(String[] args) throws Exception
    	{
    		FastReader sc = new FastReader();
    		int arr[]={5,4,1,2,6};
           isarraySorted(arr,0,0);
           for(int i=0;i<arr.length;i++)
           {
            System.out.println(arr[i]);
           }
    		
    	}
    	public static int[] isarraySorted(int []arr,int i,int j)
        {
            if(i==arr.length-1 )
            {
               // int arr[]=new int[arr.length];
                return arr;
            }
            if(j==arr.length-1)
            {
                return arr;
            }
             isarraySorted(arr,i,j+1);
            if(arr[i]>arr[i+1])
            {
                int t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
            }
            return isarraySorted(arr,i+1,j);
        }
    }

