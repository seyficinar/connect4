import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	// Last played position either from bot or player
	private static int lastCol = -1;

	private static int lastRow = -1;

	public static boolean isGameOver = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Empty places are represented by 'O', players represented by 'P', bots
		// represented by 'B'
		State gameState = new State();
		char[][] table = new char[6][7];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = 'O';
			}
		}
		gameState.setData(table);
		System.out.println("Burdayým");
		while (!isGameOver) {
			System.out.println("Burdayým");
			gameState.display();
			// It is assumed that player does not play illegal move
			System.out.println("Enter a column number to play: ");
			int col = sc.nextInt();

			for (int i = 5; i >= 0; i--) {
				if (table[i][col] != 'P' && table[i][col] =='O') {
					System.out.println("Burdayým");
					table[i][col] = 'P';
					lastRow = i;
					lastCol = col;
					gameState.setData(table);
					gameState.display();
					System.out.println();
					
					break;
				}
			}
			gameState = computersChoice(gameState);
			gameState.display();
			System.out.println();

		}

	}

	// Chose the best move according to given state
	public static State computersChoice(State state) {
        LinkedList<State> possibleStates = possibleStatesByBot(state);
        int maxPoint = Integer.MIN_VALUE;
        State bestState = null;

        for (State s : possibleStates) {
            int point = s.calculatePoint();
            if (point > maxPoint) {
                maxPoint = point;
                bestState = s;
            }
        }

        return bestState;
    }




	public static LinkedList<State> possibleStatesByPlayerAfterBot(State state) {
	    LinkedList<State> list = new LinkedList<State>();
	    char[][] table = state.getData();
	    for (int j = 0; j < 7; j++) {
	        char[][] updatedTable = copyArray(table); // Create a new copy of the table
	        for (int i = 5; i >= 0; i--) {
	            if (updatedTable[i][j] == 'O') {
	                updatedTable[i][j] = 'P';
	                State s = new State(updatedTable);
	                list.add(s);
	                break;
	            }
	        }
	    }
	    return list;
	}


	// Helper method to create a copy of a 2D char array
	private static char[][] copyArray(char[][] array) {
	    char[][] copy = new char[array.length][];
	    for (int i = 0; i < array.length; i++) {
	        copy[i] = array[i].clone();
	    }
	    return copy;
	}



	public static LinkedList<State> possibleStatesByBot(State state) {
        LinkedList<State> list = new LinkedList<State>();
        char[][] table = copyArray(state.getData());

        for (int j = 0; j < 7; j++) {
            for (int i = 5; i >= 0; i--) {
                if (table[i][j] == 'O') {
                    char[][] updatedTable = copyArray(table);
                    updatedTable[i][j] = 'B';
                    State s = new State(updatedTable);
                    list.add(s);
                    break;
                }
            }
        }

        return list;
    }

	// Methods for checking the game ended or not

//	public static boolean checkLastRow(int lastCol, int lastRow) {
//
//	}
//
//	public static boolean checkLastColumn(int lastCol, int lastRow) {
//
//	}
//
//	public static boolean checkDiagonal(int lastCol, int lastRow) {
//
//	}
//
//	public static boolean checkReverseDiagonal(int lastCol, int lastRow) {
//
//	}
}
