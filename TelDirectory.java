import java.util.Collections;

public class TelDirectory implements Comparable <TelDirectory> {

	private String name;
	private String phoneNumber;
	
	public TelDirectory(String name, String phoneNumber){
		this.name= name;
		this.phoneNumber= phoneNumber;
	}
	public String getName(){
		return name;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public String toString(){
		return getName()+ " " + getPhoneNumber();
	}
	public int compareTo(TelDirectory other){
		 if (name.equals(other.getName())){
			    return phoneNumber.compareTo(other.getPhoneNumber());
			   } else {
			    return name.compareTo(other.getName());
			   }
	 }
	 
}
 interface comparable {
	 public TelDirectory Collections(String a, String b );
 }
