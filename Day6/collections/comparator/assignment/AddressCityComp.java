package collections.comparator.assignment;

import java.util.Comparator;

public class AddressCityComp implements Comparator<Address>{
	@Override
	public int compare(Address arg0, Address arg1) {
		return arg0.getCity().compareTo(arg1.getCity());
	}

}
