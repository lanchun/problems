package problems;
/**
 * 将字符串中的空格替换为%20
 */
import java.util.Arrays;

public class ReplaceSpaceTest {

	public static void main(String[] args) {
		char[] str = { 'w', 'e', ' ', 'a', 'r', 'e', ' ', 'h', 'a', 'p', 'p', 'y' };
		str = replaceSpace(str, str.length);
		System.out.println(Arrays.toString(str));
	}

	public static char[] replaceSpace(char[] str, int length) {
		int spaceCount = 0;
		for (char ch : str) {
			if (ch == ' ')
				spaceCount++;
		}
		int newLength = length + spaceCount * 2;
		str = Arrays.copyOf(str, newLength);
		newLength--;
		for (int i = length - 1; i >= 0; i--) {
			char ch = str[i];
			if (ch == ' ') {
				str[newLength--] = '0';
				str[newLength--] = '2';
				str[newLength--] = '%';
			} else {
				str[newLength--] = ch;
			}
		}
		return str;
	}

}
