import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 9 + 1);
		int num2;
		int num3;
		while (true) {
			num2 = (int) (Math.random() * 9 + 1);
			if (num2 != num1) {
				break;
			}
		}
		while (true) {
			num3 = (int) (Math.random() * 9 + 1);
			if (num3 != num2 && num3 != num1) {
				break;
			}
		}

		System.out.print(num1 + " " + num2 + " " + num3);
		System.out.println();

		int[] num = new int[3];
		num[0] = num1;
		num[1] = num2;
		num[2] = num3;

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int strike = 0, ball = 0;
		boolean result = true;

		do {
			strike = 0;
			ball = 0;
			System.out.println("Input number...");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			if (arr[0] == num[0] && arr[1] == num[1] && arr[2] == num[2]) {
				System.out.println("Game Over!!!");
				result = false;
				break;
			} else {
				if (arr[0] == num[0]) {
					strike++;
				} else {
					if (arr[0] == num[1] || arr[0] == num[2]) {
						ball++;
					}
				}
				if (arr[1] == num[1]) {
					strike++;
				} else {
					if (arr[1] == num[2] || arr[1] == num[0]) {
						ball++;
					}
				}
				if (arr[2] == num[2]) {
					strike++;
				} else {
					if (arr[2] == num[1] || arr[2] == num[0]) {
						ball++;
					}
				}
			} // else¹® ³¡

			System.out.printf("strike : %d, ball : %d\n", strike, ball);

		} while (result);
		sc.close();
	}
}