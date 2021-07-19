import java.io.*;
import java.util.*;

public class codeforces 
{
    static long TIME_START, TIME_END;
    public static class Task 
    {
        
            public void solve(Scanner sc, PrintWriter pw) throws IOException 
            {
                int f=sc.nextInt();
                int fin[]=new int[f];
                for(int i=0;i<f;i++)
                {
                fin[i]=sc.nextInt();
                }
                int frnd=1;
                frnd+=f;
                int ways=0;
                int arsum=0;
                for(int i=0;i<fin.length;i++)
                {
                    arsum+=fin[i];
                }
                for(int i=1;i<=5;i++)
                {
                    int s=arsum+i;
                    if(s%frnd==1)
                    {
                        ways++;
                       // pw.println(i);
                    }
                }

                pw.println(5-ways);
            }
    }
    public static void main(String[] args) throws IOException 
    {

        Scanner sc = new Scanner(new FileReader(new File("input.txt")));

        //Scanner sc = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File("output.txt"))));

        //PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();

       // System.err.println("Memory increased: " + (usedMemoryAfter - usedMemoryBefore) / 1000000);

        //qSystem.err.println("Time used: " + (TIME_END - TIME_START) + ".");
    }
    static class Scanner {

        StringTokenizer st;
        BufferedReader br;public Scanner(InputStream s) 
        {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public Scanner(FileReader s) throws FileNotFoundException 
        {
            br = new BufferedReader(s);
        }
        public String next() throws IOException 
        {
            while (st == null || ! st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        public int nextInt() throws IOException 
        {
            return Integer.parseInt(next());
        }
        public long nextLong() throws IOException 
        {
            return Long.parseLong(next());
        }
        public String nextLine() throws IOException 
        {
            return br.readLine();
        }
        public double nextDouble() throws IOException 
        {
            return Double.parseDouble(next());
        }
        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}