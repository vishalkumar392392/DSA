package com.backtracing;

public class Suduko {
	public static boolean isSafe(int[][] board, int row, int col, int num) {
		for (int d = 0; d < board.length; d++) {

			if (board[row][d] == num || board[d][col] == num) {
				return false;
			}

		}

		int sqrt = (int) Math.sqrt(board.length);
		int boxRowStart = row - row % sqrt;
		int boxColStart = col - col % sqrt;

		for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
			for (int d = boxColStart; d < boxColStart + sqrt; d++) {
				if (board[r][d] == num) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean solveSudoku(int[][] board, int n) {
		int row = -1;
		int col = -1;
		boolean isEmpty = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 0) {
					row = i;
					col = j;
					isEmpty = false;
					break;
				}
			}
			if (!isEmpty) {
				break;
			}
		}

		if (isEmpty) {
			return true;
		}

		for (int num = 1; num <= n; num++) {
			if (isSafe(board, row, col, num)) {
				board[row][col] = num;
				if (solveSudoku(board, n))
					return true;
				board[row][col] = 0;
			}
		}
		return false;
	}

	// Driver Code
	public static void main(String args[]) {

		int[][] board = new int[][] { { 1, 0, 3, 0 }, { 0, 0, 2, 1 }, { 0, 1, 0, 2 }, { 2, 4, 0, 0 } };
		int N = board.length;

		if (solveSudoku(board, N)) {
			// print solution
			print(board, N);
		} else {
			System.out.println("No solution");
		}
	}
	
	public static void print(int[][] board, int N) {

		// We got the answer, just print it
		for (int r = 0; r < N; r++) {
			for (int d = 0; d < N; d++) {
				System.out.print(board[r][d]);
				System.out.print(" ");
			}
			System.out.print("\n");

			if ((r + 1) % (int) Math.sqrt(N) == 0) {
				System.out.print("");
			}
		}
	}
}

