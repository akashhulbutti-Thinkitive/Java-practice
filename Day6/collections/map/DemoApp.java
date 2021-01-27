package collections.map;

import java.util.HashMap;
import java.util.Map;

public class DemoApp {
	public static void main(String[] args) {
		String a="hello hi hi how where how hi you you your your your";
		String[] arr=a.split(" ");
		Map<String ,Integer> map=new HashMap<String,Integer>();
		for(String x:arr) {
			map.merge(x,1,DemoApp::add);
		}
		System.out.println(map);
	}

	public static Integer add(Integer a,Integer b) {
		return a+b;
	}

}
