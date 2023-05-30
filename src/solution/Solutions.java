package solution;

public class Solutions {
	public static void main(String[] args) {
		System.out.println(solution("aukks", "wbqd", 5));
	}
	
	public static String solution(String s, String skip, int index) {
		String answer = "";
		StringBuffer sb = new StringBuffer();
		//s = aukks , skip = w b q d, index = 10;
		char[] inputs = s.toCharArray();
		for(int k = 0; k<inputs.length; k++) {
//			System.out.print(inputs[k]);
			for(int i=0; i<index; i++) {
					if(inputs[k]+1 <123) {
					inputs[k]= (char)(inputs[k]+1);
					}
					else{
						inputs[k] = (char)(((inputs[k]+1)%123)+97);
					}
				if(skip.contains(String.valueOf(inputs[k]))) {
					i--;
					continue;
				}
			}
//			System.out.println(inputs[k]);
			sb.append(inputs[k]);
		}

//		System.out.println(sb);
		answer = answer.concat(sb.toString());
		return answer;
	}
}
