package com.geeks.backtracing;

public class NQueens {

	public static void main(String[] args) {

		int board[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		System.out.print("Permutation: -> ");
		nQueens(board, 0);
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isSafe(int row, int col, int board[][]) {

		for (int i = 0; i < col; i++) {
			if (board[row][i] == 1)
				return false;
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		for (int i = row, j = col; j >= 0 && i < board.length; i++, j--) {
			if (board[i][j] == 1)
				return false;
		}
		System.out.print(row);

		return true;
	}

	public static boolean nQueens(int board[][], int col) {
		if (col == board.length)
			return true;

		for (int i = 0; i < board.length; i++) {

			if (isSafe(i, col, board)) {

				board[i][col] = 1;
				if (nQueens(board, col + 1)) {
					return true;
				}
				board[i][col] = 0;
			}
		}

		return false;
	}

}
