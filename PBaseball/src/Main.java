import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] num = new int[3];
		boolean eq;

		do {
			eq = false;
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 10);
			}
			if (num[0] == num[1] || num[1] == num[2] || num[2] == num[0]) {
				eq = true;
			}
		} while (eq);

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];
		boolean b = false;
		int stk, ball;

		do {
			stk = 0;
			ball = 0;
			b = true;
			System.out.print("Input number... ");
			for (int i = 0; i < inp.length; i++) {
				inp[i] = sc.nextInt();
			}

			for (int i = 0; i < inp.length; i++) { // strike check
				if (num[i] == inp[i]) {
					stk++;
				}
			}

			for (int i = 0; i < inp.length; i++) { // ball check
				for (int j = 0; j < inp.length; j++) {
					if (num[i] == inp[j] && i != j) {
						ball++;
					}
				}
			}
			
			System.out.println("strike : " + stk + ", ball : " + ball);
			if(stk == 0 && ball == 0) {
				System.out.println("OUT!");
			}
			if(stk == 3) {
				b = false;
			}
		} while (b);
		sc.close();
	}
}
