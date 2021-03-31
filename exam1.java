import java.io.*;
import java.util.*;

class exam1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();  
		for(int i = 0; i<n; i++){
			int a = sc.nextInt();
			list.add(a);
			a=0;
		}
		List<Integer> list1=new ArrayList<Integer>();
		for(int i = 0; i<n; i++){
			int s = list.get(i);
			for(int j = 0; j < s ; j++){
					
				int temp = sc.nextInt();
				list1.add(temp);
			}
			if(s > 1){
			System.out.println(list1.get(0)+" "+list1.get(s-1));
			}
			else{
				System.out.println(list1.get(0));
			}
			list1.clear();
			
		}
		

	}
}