package backtracking;

import java.io.*;
import java.util.*;

public class _15649 {
	static int n, m;
	static boolean[] vst;
	static StringBuilder sb = new StringBuilder();
	
	static void func(int cnt, String str) {
		// ��������
		if (cnt == m) {
			sb.append(str + "\n");
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			if (vst[i] == false) {
				vst[i] = true;
				func(cnt+1, str+i+" ");
				vst[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		vst = new boolean[n+1];		// ��ǻ� vst[]���� ����ϴ� �� vst[1] ~ vst[n]�������� �迭�� 0���� �����ϴϱ� n+1 ����
		func(0, "");
		System.out.println(sb);
	}
}

//n = 3, m = 2
//��� (cnt(0<=cnt<=m), str + true�� �� ������ i)
//
//func(0, "")
//cnt = 0, str = ""
//i = 1) vst[1] = false -> true
//        func(1, 1) 	// func(cnt, str + true�� �� ������ i)
//	       *func(1, 1)
//	        cnt = 1, str = 1
//	        i = 1) vst[1] = true �ǳ� ��
//	        i = 2) vst[2] = false -> true
//		   func(2, 1 2)	// func(cnt, str + true�� �� ������ i)
//			     * func(2, 1 2) ----- �������� ------
//			       cnt = 2, str = 1 2
//			       ��� (1 2)
//		   vst[2] = false
//	        i = 3) vst[3] = false -> true
//		   func(3, 1 3)	// func(cnt, str + true�� �� ������ i) 
//			     * func(3, 1 3) ----- �������� ------
//			       cnt = 3, str = 1 3
//			       ��� (1 3)
//		   vst[3] = false
//        vst[1] = false
//i = 2) vst[2] = false -> true
//        func(1, 2)	// func(cnt, str + true�� �� ������ i)
//	       * func(1, 2)
//	         cnt = 1, str = 2
//	         i = 1) vst[1] = false -> true
//		   func(2, 2 1)	// func(cnt, str + true�� �� ������ i)
//		 	     * func(2, 2 1) ----- ���� ���� -----
//			       cnt = 2, str = 2 1
//			       ��� (2 1)
//		    vst[1] = false
//	         i = 2) vst[2] = true �ǳ� ��
//	         i = 3) vst[3] = false -> true
//		    func(2, 2 3) 	// func(cnt, str + true�� �� ������ i)
//			      * func(2, 2 3) ----- ���� ���� -----
//			        cnt = 2, str = 2 3
//			        ��� (2 3)
//		    vst[3] = false
//        vst[2] = false
//i = 3) vst[3] = false -> true
//        func(1, 3)	// func(cnt, str + true�� �� ������ i)
//	       * func(1, 3)
//	         cnt = 1, str = 3
//	         i = 1) vst[1] = false -> true
//		    func(2, 3 1)	// func(cnt, str + true�� �� ������ i)
//			      * func(2, 3 1) ---- ���� ���� -----
//			        cnt = 2, str = 3 1
//			        ��� (3 1)
//		  vst[1] = false
//	       i = 2) vst[2] = false -> true
//		 func(2, 3 2)	// func(cnt, str + true�� �� ������ i)
//			   * func(2, 3 2) ----- ���� ���� -----
//			     cnt = 2, str = 3 2
//			     ��� (3 2)
//		 vst[2] = false
//	      i = 3) vst[3] = true �ǳ� ��
//      vst[3] = false