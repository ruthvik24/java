import java.util.*;
import java.io.*;
public class Vmware1 {

	

	public static void main(String[] args) {
		
		
		int[][] mat = new int[][] {{11,2},{2,3},{4,6},{1,6}};
		int arr[] = new int[mat.length];
		int res = 0;
		for(int i=0; i< mat.length; i++) {
			arr[i]=res = mat[i][0] * mat[i][1];
		}
		
		
		int diff = Integer.MAX_VALUE;
        int x = 0,y = 0;
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if ( Math.abs((arr[i] - arr[j]) ) < diff){
                    diff =Math.abs((arr[i] - arr[j]) );
					x=i;
					y=j;
				}
			}
		}
		System.out.println(mat[x][0]+" "+mat[x][1]);
		System.out.println(mat[y][0]+" "+mat[y][1]); 
	}

}