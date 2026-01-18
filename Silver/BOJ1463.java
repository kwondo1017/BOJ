package Silver;

import java.util.Scanner;


public class BOJ1463 {

    public static double logJudge(int num) {
        double x = Math.log(num) / Math.log(3);
        double y = Math.log(num) / Math.log(2);

        int ix = (int) x;
        int iy = (int) y;

        x -= ix;
        y -= iy;

        return x-y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int cnt = 0; // 연산 카운트

        if (n==1) 
            cnt = 0;
        else if (n==2 || n==3){
            cnt = n-1;
        } else {
            while (true){
                if (n==1) 
                    break;

                if (logJudge(n) < 0) {
                    if (n%3 == 0){
                        n /= 3;
                        cnt++;
                    } else {
                        n--;
                        cnt++;
                    }
                }

                if (logJudge(n) > 0) {
                    if (n%2 == 0){
                        n /= 2;
                        cnt++;
                    } else {
                        n--;
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
