import java.util.*;
	public class TelDirectoryClient {
		public static void main(String[]args){
		ArrayList <TelDirectory> List1 = new ArrayList<TelDirectory>();
		List1.add(new TelDirectory("Peter", "6784521250"));
		List1.add(new TelDirectory("Anum", "4045612589"));
		List1.add(new TelDirectory("Sandra", "6789254625"));
		List1.add(new TelDirectory("Joana", "7079854521"));
		List1.add(new TelDirectory("John", "4045218765"));
		List1.add(new TelDirectory("Table", "4046105875"));
		List1.add(new TelDirectory("chair", "4045875698"));
		List1.add(new TelDirectory("Coach", "6784523250"));
		List1.add(new TelDirectory("water", "4044521250"));
		List1.add(new TelDirectory("water", "6788521250"));
		System.out.println(List1);
        Collections.sort(List1);
        System.out.println(List1);
}
}
