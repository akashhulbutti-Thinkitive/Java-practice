package collections.comparator.assignment;

import java.util.Comparator;

public class AddressPincodeComp implements Comparator<Address>{
	
	@Override
	public int compare(Address arg0, Address arg1) {
		if(arg0.getPincode()>arg1.getPincode()) {
			return 1;
		}else if(arg0.getPincode()<arg1.getPincode()) {
			return -1;
		}else
		return 0;
	}

}
