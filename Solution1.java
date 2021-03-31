import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) throws Exception{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int r = 0; // result
        
		for(String s: bi.readLine().split(",\\s")){
			int n = Integer.parseInt(s);
			r = r ^ n;
		}
		System.out.println(r);
	}
}