import java.util.*;
public class Vmware {

	

	public static void main(String[] args) {
		
		
		int[][] mat = new int[][] {{11,2},{2,3},{1,6},{4,6}};
		List<List<Integer>> l = new ArrayList<>();
		for (int[] ints : mat) {
		    List<Integer> list = new ArrayList<>();
		    for (int i : ints) {
		        list.add(i);
		    }
		    l.add(list);
		}System.out.println(l);
		
		


		
		HashMap<List<Integer> ,Integer> map = new HashMap<>();
		

		
		for(int i=0; i< mat.length; i++) {
			int j = 0; 
			map.put(l.get(i), mat[i][j]* mat[i][j+1]);
			
			
		}
		System.out.println(map);
		
		List<Integer> val = new ArrayList<>(map.values());
		System.out.println(val);
		for(Map.Entry<List<Integer>, Integer> a: map.entrySet()) {
			if(a.getValue() == val.get(0) ) {
				System.out.println(a.getKey());
			}
		}	 
}
	}