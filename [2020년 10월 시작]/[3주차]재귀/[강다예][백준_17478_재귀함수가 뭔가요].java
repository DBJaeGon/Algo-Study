package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j17478 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		
		recursion(n,0);
				
	}

	private static void recursion(int n, int cnt) {
		if (cnt == n) { //�������
			underbar(n);System.out.println("\"����Լ��� ������?\"");
			underbar(n);System.out.println("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			underbar(n);System.out.println("��� �亯�Ͽ���.");
		}else {
			underbar(cnt);System.out.println("\"����Լ��� ������?\"");
			underbar(cnt);System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			underbar(cnt);System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			underbar(cnt);System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			cnt++;
			recursion(n, cnt);
			for (int i = 0; i < cnt-1; i++) {
				System.out.print("____");
			}
			System.out.println("��� �亯�Ͽ���.");
		}
	}
	
	private static void underbar(int a) {
		for (int i = 1; i <=a; i++) {
			System.out.print("____");
		}
	}


}
