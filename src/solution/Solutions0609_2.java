package solution;
import java.util.*;
public class Solutions0609_2 {
	static StringBuilder sb = new StringBuilder();
	static StringBuffer sb2 = new StringBuffer();
	static int cnt = 0;
	static int cntZero = 0;
	static int twoBit = 0;
	static String lastStr = "";
	
	public static void main(String[] args) {
		String s = "110010101001";
		int arr[] = solution(s);
		for(int a: arr) {
			System.out.println(a);
		}
	}
    public static int[] solution(String s) {
    	int size=2;
    	while(size>1) {
    	size = delZero(s);
    	s = makeStr(size);
    	}
    	/*
    	 * 1. 일단 s의 딜리트제로 실행 -> size 나옴
    	 * 2. 사이즈를 2진수로 면환-> 문자화. 실행 s에 다시 저장
    	 * if(s 의 사이즈 == 1 스탑.)
    	 * 
    	 */

        int[] answer = {cnt,cntZero};
        return answer;
    }
    public static String makeStr(int num) {
    	Stack<Integer> mStr = new Stack<Integer>();
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	String tmp="";
    	while(num > 0) {
    		arr.add(num%2);
    		num /= 2;
    	}

    	Collections.reverse(arr);
    	for(int j=0; j<arr.size(); j++) {
    		mStr.add(arr.get(j));
    	}
    	tmp = mStr.toString();
//    	System.out.println(tmp);
    	cnt++;
    	return tmp;
    }
    public static int delZero(String s) {
    	Stack<Character> st = new Stack<Character>();
    	for(int i=0; i<s.length(); i++) {
    		if(s.charAt(i)=='0') {
    			cntZero++;
    		}
    		if(s.charAt(i)=='1') {
    			st.add('1');
    		}
    	}
    	twoBit = st.size();
    	st.clear();
//    	System.out.println("스택, 문자열 길이 = " + twoBit);
    	return twoBit;
    }
}
