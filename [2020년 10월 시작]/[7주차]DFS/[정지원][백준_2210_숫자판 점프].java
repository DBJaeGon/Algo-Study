package dfs;

import java.util.*;
import java.io.*;

public class _2210 {
    static char[][] arr;
    static int[][] wh = {{-1, 0, 1, 0}, {0, 1, 0, -1}};
    static Set<String> set = new HashSet<>();
    
    static void func(int x, int y, String str){
        // ���� ���� ( ���� ���� )
    	if (str.length() == 6) {
    		set.add(str);
    		return;
    	}
    	
    	// 4���� Ȯ��
        for(int i = 0; i < 4; i++){
            int X = x + wh[0][i];
            int Y = y + wh[1][i];
            //���� üũ
            if(0 <= X && 0 <= Y && X < 5 && Y < 5)
                func(X, Y, str + arr[X][Y]);
        }
    }
    
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;

        arr = new char[5][5];
        
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++)
                arr[i][j] = st.nextToken().charAt(0);
         }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) 
            	func(i, j, Character.toString(arr[i][j]));
        }
        
        System.out.println(set.size());
    }
}