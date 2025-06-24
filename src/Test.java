public class Test {

	static int[] input = {5, 8, 6, 3, 2, 7, 2, 6};
	static int[] tree = new int[4 * input.length];

	public static void main(String[] args) {

		int start = 0;
		int end = input.length-1;
		build(start, end, 1);
		System.out.println();
	}

	static void build(int start, int end, int node) {
		if (start == end) {
			tree[node] = input[start];
			return;
		}

		int mid = (start + end) / 2;

		// 2. 왼쪽 자식 노드(2 * node) 구간 합 구하기
		build(start, mid, node * 2);

		// 3. 오른쪽 자식 노드(2 * node + 1) 구간 합 구하기
		build(mid + 1, end, node * 2 + 1);

		// 4. 현재 노드 합은 왼쪽 + 오른쪽 자식 합
		tree[node] = tree[node * 2] + tree[node * 2 + 1];
	}


}
