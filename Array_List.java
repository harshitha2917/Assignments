package collection;
//Assignment-67
import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();//storing heterogeneous values
		a1.add(100);//Accept Indexing
		a1.add(987);
		a1.add(211);
		a1.add("Harshitha");
		a1.add(false);
		a1.add('M');
		a1.add(3.32);
		a1.add(100);//Accept duplicate values
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();//storing heterogeneous values and accept duplicate values
		a2.add(100);
		a2.add(987);
		a2.add(211);
		a2.add("Harshitha");
		a2.add(true);
		a2.add('M');
		a2.add(3.32);
		a2.add(null);
		System.out.println(a2);
			
	}

}
