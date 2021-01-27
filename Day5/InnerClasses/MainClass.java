package InnerClasses;

public class MainClass {

	public static void main(String[] args) {
		
		TemplateInterface tAdd=new TemplateInterface() {
			
			@Override
			public int returnInt(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		
		TemplateInterface tSub=new TemplateInterface() {
			
			@Override
			public int returnInt(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1-num2;
			}
		};
		
		TemplateInterface tMul=new TemplateInterface() {
			
			@Override
			public int returnInt(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1*num2;
			}
		};
		
		TemplateInterface tDiv=new TemplateInterface() {
			
			@Override
			public int returnInt(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1/num2;
			}
		};
		System.out.println("1 : "+tAdd.returnInt(20, 10));
		System.out.println("2 : "+tSub.returnInt(20, 10));
		System.out.println("3 : "+tMul.returnInt(20, 10));
		System.out.println("4 : "+tDiv.returnInt(20, 10));
	}
}
