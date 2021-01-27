
public class ObjectClass1 {
	private int oId;
	private String oName;
	
	
	public ObjectClass1() {
		System.out.println("ObjectClass1 initallized...");
	}
	
	public ObjectClass1(int oid,String oname){
		this.oId=oid;
		this.oName=oname;
	}
	
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}

	@Override
	public String toString() {
		return "ObjectClass1 [oId=" + oId + ", oName=" + oName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	

	
}
