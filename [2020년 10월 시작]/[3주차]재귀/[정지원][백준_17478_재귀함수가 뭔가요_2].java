package recursive;

import java.io.*;

public class _17478_2 {
	static String arr[];
	static int num = 0;
	
	static void rec(int n) {
		String u = "____";
		u = (new String(new char[num])).replace("\0", String.valueOf(u));		// u = u.repeat(num);

		if (n == 0) {
			System.out.println(u + arr[0]);
			System.out.println(u + arr[4]);
			
			int j = num;

			for (int i = 0; i <= j; i++) {
				u = "____";
				u = (new String(new char[num--])).replace("\0", String.valueOf(u));		// u = u.repeat(num--);
				System.out.println(u + arr[5]);
			}
			return;
		}
		
		for (int i = 0; i < 4; i++)
			System.out.println(u + arr[i]);
				
		num++;
		rec(n-1);
	}	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");

		arr = new String[6];
		arr[0] = "\"����Լ��� ������?\"";
		arr[1] = "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���."; 
		arr[2] = "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.";
		arr[3] = "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"";
		arr[4] = "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"";
		arr[5] = "��� �亯�Ͽ���.";
		
		rec(n);
	}
}