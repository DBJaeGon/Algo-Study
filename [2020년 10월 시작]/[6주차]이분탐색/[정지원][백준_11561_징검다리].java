package binary_search;

import java.util.*;
import java.io.*;

public class _11561 {
	static long func(long n){
		long left = 1, right = Integer.MAX_VALUE;
		while(left <= right){
			long mid = (left + right) / 2;
			// a = 1���� mid������ ��
			long a = (mid*(mid+1))/2;
			// b = 1���� mid + 1 ������ ��
			long b = ((mid+1)*(mid+2))/2;
			// ���� �� �ִ� ������ 3����
			// n�� a ���� ���� ���
			if (n < a) 
				right = mid - 1;
	          
			// n�� b ���� ���ų� ū ���
			else if (n >= b) 
				left = mid + 1;
	          
          	// �� ��
			else
				return mid;
   		}
		return left;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			long x = Long.parseLong(st.nextToken());
			System.out.println(func(x));
		}
	}
}