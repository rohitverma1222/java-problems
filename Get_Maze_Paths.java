import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int dr =scn.nextInt();
        int dc=scn.nextInt();
        ArrayList<String> result=get(1,1,dr,dc);
        System.out.println(result);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> get(int sr, int sc, int dr, int dc) {
        if(sc==dc && sr==dr)
        {
            ArrayList<String> s=new ArrayList<>();
            s.add("");
            return s;
        }
        
        
        ArrayList<String> p1=new ArrayList<>();
        ArrayList<String> p2=new ArrayList<>();
        if(sc<dc)
        {
            p1=get(sr,sc+1,dr,dc);
        }
        if(sr<dr)
        {
            p2=get(sr+1,sc,dr,dc);
        }
        
        ArrayList<String> res=new ArrayList<>();
        for(String s:p1)
        {
            res.add("h"+s);
        }
        for(String s:p2)
        {
            res.add("v"+s);
        }
        return res;
    }

}