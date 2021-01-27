
public class ObjectClass {
	int oId;
	String oName;

	public ObjectClass() {
	System.out.println("Object Initialized..");
	
	}
	
	ObjectClass(int oid,String oname){
		this.oId=oid;
		this.oName=oname;
	}
	
	@Override
	public String toString() {
	return "ObjectClass: { oId :'"+this.oId+"', oName : '"+this.oName+"'}";
	}
	
	@Override
	public boolean equals(Object obj) {
		ObjectClass objNew =(ObjectClass)obj;
		if(this.oId==objNew.oId) {
			return true;
		}else return false;
	}
	
	@Override
	public int hashCode() {
		return this.oId;
	}
}
