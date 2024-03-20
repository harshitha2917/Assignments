package collection;
//Assignment-68
import java.util.Collections;
import java.util.Vector;
public class Vector_Demo {

	public static void main(String[] args) {
		Vector v1 = new Vector(); // storing heterogeneous values
		v1.add(100);// Accept Indexing
		v1.add(250);
		v1.add('H');
		v1.add("Harshitha");
		v1.add(29.179); // Dynamic
		v1.add("Harshitha");
		v1.add(100); // Accepts duplicate values
		v1.add(250);
		v1.add(null); // Accepts null
		// Collections.sort(v1);
		System.out.println(v1);

		Vector v2 = new Vector();
		v2.add(19);
		v2.add(190);
		v2.add(19);
		v2.add(119);
		v2.add(319);
		v2.add(199);
		Collections.sort(v2); // can sort homogeneous values
		System.out.println(v2);
	}
}