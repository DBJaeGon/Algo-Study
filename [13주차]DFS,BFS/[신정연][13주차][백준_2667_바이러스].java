package week13;

import java.util.*;

/*
 * ����_2667_������ȣ���̱�
 * ù ��° �ٿ��� �� �������� ���. �׸��� �� ������ ���� ���� ������������ �����Ͽ� �� �ٿ� �ϳ��� ���.
 * 
 * 7		������ ũ��
 * 0110100	1�� ���� �ִ� ��, 0�� ���� ��
 * 0110101
 * 1110101
 * 0000111
 * 0100000
 * 0111110
 * 0111000
 * --------
 * 3
 * 7
 * 8
 * 9
 */
public class Problem_2667 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com = sc.nextInt();
		int net = sc.nextInt();
		int[][] network = new int[net][2];
		
		for(int i=0; i<net; i++) {
			network[i][0] = sc.nextInt();
			network[i][1] = sc.nextInt();
		}
		
		Queue<Integer> next = new LinkedList<>();
		next.add(1);
		boolean[] vst = new boolean[com+1];
		int cnt = 0;
//		List<Integer> vst = new ArrayList<>();
		
		while(!next.isEmpty()) {
			int current = next.poll();
			if(!vst[current]) {
				vst[current] = true;
				cnt++;
			}
			for(int i=0; i<net; i++) {
				if(network[i][0] == current || network[i][1] == current) {
					if(!vst[network[i][1]]) {
						next.add(network[i][1]);
					} else if(!vst[network[i][0]]) {
						next.add(network[i][0]);
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
