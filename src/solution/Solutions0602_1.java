package solution;

public class Solutions0602_1 {
	public static void main(String[] args) {
		
		int nums[] = {1,2,7,6,4};
		solution(nums);
		
	}
	
    public static int solution(int[] nums) {
        int answer = 0;
        //1번. nums.length C 3 조합의 결과를 다 저장(? 하면 그 조합하는 수 index를 만들어야함.) 거르기.
        int indexFir = 0;
        //0,1,2,3.
        for(int i=indexFir; i<nums.length-2; i++) {
        	
        	for(int j=i+1; j<nums.length-1; j++) {
        		
        		for(int k=j+1; k<nums.length; k++) {
        			int tmpNum = nums[i]+nums[j]+nums[k];
        			if(eraNumeric(tmpNum)) {
        				answer++;
        			}
        			
        		}//k
        	}//j
        }//i
        
        System.out.println(answer);
        return answer;
    }
    
    public static boolean eraNumeric(int num) {
    	int end = (int)Math.sqrt(num);
        for(int i = 2 ; i <= end; i++){
            if(num % i == 0 ) {
                return false;
            }
        }
        return true;

    }
    
}
