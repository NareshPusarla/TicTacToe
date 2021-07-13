package com.bridgelabz.tictactoegame;

import java.util.Scanner;

public class TicTacToe {
	public static void drawBoard(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	public static char won(char[][] board) {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
				return board[i][0];
			}
		}

		for (int j = 0; j < 3; j++) {
			if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
				return board[0][j];
			}
		}

		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
			return board[0][0];
		}

		if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
			return board[2][0];
		}

		return '-';
	}

	public static boolean tied(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		char[][] board = new char[3][3];
		Scanner sc = ScannerUtil.sc;
		
		System.out.println("Enter player1 name");
		String p1 = sc.nextLine();
		System.out.println("Enter player2 name");
		String p2 = sc.nextLine();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
		
		boolean isPlayer1 = true;

		boolean endGame = false;
		while (!endGame) {
			drawBoard(board);

			char symbol = ' ';

			if (isPlayer1) {
				symbol = 'x';
			} else {
				symbol = 'o';
			}

			if (isPlayer1) {
				System.out.println(p1 + "'s turn(x)");
			} else {
				System.out.println(p2 + "'s turn(o)");
			}

			int row = 0;
			int col = 0;

			while (true) {
				System.out.println("enter the row number u want palce: ");
				row = sc.nextInt();
				System.out.println("enter the column number u want palce: ");
				col = sc.nextInt();

				if (row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("Enter a valid cell number.");
				} else if (board[row][col] != '-') {
					System.out.println("This cell already occupied.");
				} else {
					break;
				}
			}

			board[row][col] = symbol;

			if (won(board) == 'x') {
				System.out.println(p1 + " has won.");
				endGame = true;
			} else if (won(board) == 'o') {
				System.out.println(p2 + " has won.");
				endGame = true;
			} else {
				if (tied(board)) {
					System.out.println("It's a tie.");
					endGame = true;
				} else {
					isPlayer1 =! isPlayer1;
				}
			}
		}
		drawBoard(board);
	}
}
