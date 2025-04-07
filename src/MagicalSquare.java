package est;

import java.util.Arrays;

public class MagicalSquare {

	public static void main(String[] args) {
		int ausgabe[][] = createMagicalSquare(5);

		for (int i[] : ausgabe) {
			System.out.println(Arrays.toString(i));

		}
		System.out.println(isMagicalSquare(ausgabe));

	}

	public static int[][] createMagicalSquare(int n) {

		int square[][] = new int[n][n];
		int x = n / 2;
		int y = x + 1;

		square[y][x] = 1;
		for (int i = 2; i <= n * n; i++) {
			int xNew = cheackIndex(x + 1, n);
			int yNew = cheackIndex(y + 1, n);

			if (square[yNew][xNew] == 0) {
				square[yNew][xNew] = i;
				x++;
				y++;
			}
			else {
				y = cheackIndex(y + 2, n);
				x = cheackIndex(x, n);
				square[y][x] = i;
			}
		}

		return square;
	}
	
	public static int cheackIndex(int n, int max) {
		while (n >= max) {
			n = n - max;
		}
		return n;
	}

	public static boolean isMagicalSquare(int[][] square) {
		int n = square.length;
		int sn =n*(n*n +1) / 2;
		
		for(int i[]: square)
		{
			int summe = 0;
			for(int y : i)
			{
				summe = summe +y;
			}
			if(summe != sn)
			{
				return false;
			}
		}		
		return true;
	}
}
