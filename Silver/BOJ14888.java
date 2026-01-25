package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14888 {
    static int n;
    static int[] arr;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine().trim());
        arr = new int[n];

        String array = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(array);

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String op = br.readLine().trim();
        StringTokenizer st1 = new StringTokenizer(op);

        for (int j=0; j<n; j++){
            
        }
    }   
}
