package problems;
import java.util.*;

/**
 * 求一个数组里面所有数的组合
 * 如 1,2 可以有 1,2,12,21
 * @author lanchun
 *
 */
public class P1 {

	public static void main(String[] args) {
		String[] array = {"1","2","3"};
		listAll(Arrays.asList(array), "");
	}
	
	static void listAll(List<String> list,String prefix){
		System.out.println(prefix);
		for(int i = 0;i < list.size();i++){
			List<String> temp = new ArrayList<>(list);
			listAll(temp, prefix+temp.remove(i));
		}
	}

}
