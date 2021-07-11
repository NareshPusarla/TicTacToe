package com.bridgelabz.tictactoegame;

import java.util.Scanner;

public class TicTacToe {
	static String[] board;
	
	public static String playBoard() {
		for(int i=0;i<8;i++) {
			String line = null;
			switch(i) {
				case 0:
					line = board[0]+board[1]+board[2];
					break;
				case 1:
					line = board[3]+board[4]+board[5];
					break;
				case 2:
					line = board[6]+board[7]+board[8];
					break;
				case 3:
					line = board[0]+board[3]+board[6];
					break;
				case 4:
					line = board[1]+board[4]+board[7];
					break;
				case 5:
					line = board[2]+board[5]+board[8];
					break;
				case 6:
					line = board[0]+board[4]+board[8];
					break;
				case 7:
					line = board[2]+board[4]+board[6];
					break;
			}
			
		}
		return null;	
	}
	
	public static void showBoard() {
		System.out.println("|---|---|---|");
		System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
		System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
		System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
		System.out.println("|---|---|---|");
		
	}
	
	public static void option() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the symbol you want to use X or O:");
		String player1 = sc.nextLine();
		String player2 = sc.nextLine();
	}
	
	public static void main(String[] args) {
		board = new String[9];
		playBoard();
		option();
		showBoard();
	}

}
