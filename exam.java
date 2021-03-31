import java.io.*;
import java.util.*;

class exam{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();  
		for(int i = 0; i<n; i++){
			int a = sc.nextInt();
			list.add(a);
			a=0;
		}
		Set<Integer> tset = new HashSet<Integer>(list);
		tset.addAll(list);
		System.out.println(tset.size());

	}
}