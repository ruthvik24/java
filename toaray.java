import java.util.*;
public class toaray{
	public static void main(String[] args){
        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
        linkedset.add("Create"); 
        linkedset.add("Own"); 
        linkedset.add("Program");  
        System.out.println(linkedset);
        String[] arr = new String[linkedset.size()];
		linkedset.toArray(arr);
        for (int j = 0; j < arr.length; j++) 
            System.out.println(arr[j]); 





	}
}
