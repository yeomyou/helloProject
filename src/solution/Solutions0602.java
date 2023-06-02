package solution;

public class Solutions0602 {
	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String b = "3people         unDe Me33";
		solution(s);
		solution(b);
	}


    public static String solution(String s) {
    		String answer = "";
    	  String preText = " ";

    	    StringBuilder sb = new StringBuilder();

    	    for(int a = 0 ; a < s.length() ; a++) {

    	        String nowText = String.valueOf(s.charAt(a));

    	        if(isStringEmpty(preText)) nowText = nowText.toUpperCase();
    	        else nowText = nowText.toLowerCase();

    	        sb.append(nowText);
    	        preText = nowText;

    	    }//end for()

    	    answer = sb.toString();

    	    return answer;
    	}

    	public static boolean isStringEmpty(String str) {

    	    return str == null || str.trim().isEmpty();

    	}

}