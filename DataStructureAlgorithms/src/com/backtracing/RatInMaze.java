package com.backtracing;

public class RatInMaze {

	public static void main(String[] args) {
		int maze[][] = { { 1, 0, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		int sol[][] = new int[3][3];

		System.out.println(solveMazeRat(maze, 0, 0, sol));
		System.out.println("======================");

		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("======================");

		for (int i = 0; i < sol.length; i++) {
			for (int j = 0; j < sol.length; j++) {
				System.out.print(sol[i][j] + " ");
			}
			System.out.println();
		}
	}

	static boolean isSafe(int[][] maze, int i, int j) {

		return (i < maze.length && j < maze.length && maze[i][j] == 1);
	}

	static boolean solveMazeRat(int maze[][], int i, int j, int sol[][]) {

		if (i == maze.length - 1 && j == maze.length - 1) {
			sol[i][j] = 1;
			return true;

		}

		if (isSafe(maze, i, j)) {
			sol[i][j] = 1;
			if (solveMazeRat(maze, i + 1, j, sol))
				return true;
			else if (solveMazeRat(maze, i, j + 1, sol))
				return true;
			sol[i][j] = 0;
		}

		return false;
	}

}
