package solution;

import java.util.*;

public class Solutions0612 {
	public static void main(String[] args) {
		int[] people = { 70, 80, 50, 40, 40, 40 };
		int limit = 100;
		System.out.println(solution(people, limit));
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;
		List<Integer> list = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		for (int a : people) {
			list.add(a);
			stack.add(a);
		}
		list.sort(Comparator.naturalOrder());
		stack.sort(Comparator.naturalOrder());
		int tmpLimit = limit;

		for (int i = 0; i < list.size(); i++) {

		}

		return answer;
	}
}
