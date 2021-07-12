package com.bridgelabz.tictactoegame;

import java.util.Scanner;

public class TicTacToe {
	public static void drawBoard(char[][] board) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		Scanner sc = ScannerUtil.sc;
		System.out.println("Enter player1 name");
		String p1 = sc.nextLine();
		System.out.println("Enter player2 name");
		String p2 = sc.nextLine();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				board[i][j] = '-';
			}
		}
		drawBoard(board);
		
		char symbol = ' ';
		boolean isPlayer1 = true;
		if(isPlayer1) {
			symbol = 'x';
		}else {
			symbol = 'o';
		}
		
		int row = 0;
		int col = 0;
		while(true) {
			System.out.println("enter the row number u want palce: ");
			row = sc.nextInt();
			System.out.println("enter the column number u want palce: ");
			col = sc.nextInt();
			
			if(row<0 || col<0 || row>2 || col>2) {
				System.out.println("Enter a valid cell number.");
			}else if(board[row][col] != '-') {
				System.out.println("This cell already occupied.");
			}else {
				break;
			}
		}
		
		board[row][col] = symbol;
		drawBoard(board);
	}

}
