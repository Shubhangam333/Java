import java.util.Scanner;

public class TicTacToe {
	private player player1,player2;
	private Board board;
	
	public static void main(String args[]) {
		TicTacToe t = new TicTacToe();
		t.startGame();
	}
	public void startGame() {
		//player input
		Scanner scan = new Scanner(System.in);
		player1=takeplayerInput(1);
		player2=takeplayerInput(2);
		while(player1.getSymbol()==player2.getSymbol()) {
			System.out.println("Symbol already taken || Pick another Symbol");
			char symbol=scan.next().charAt(0);
			player2.setSymbol(symbol);
		}
	//create board
		board = new Board(player1.getSymbol(),player2.getSymbol());
		//Conduct the game
		boolean player1turn=true;
		int status=Board.INCOMPLETE;
		while(status==Board.INCOMPLETE || status==Board.INVALID) {
		if(player1turn) {
			System.out.println("Player"+player1.getName() +"'s turn");		
			System.out.println("Enter x");
			int x = scan.nextInt();
			System.out.println("Enter y");
			int y = scan.nextInt();
			status = board.move(player1.getSymbol(),x,y);
			if(status!=Board.INVALID) {
				player1turn=false;
				board.print();
			}else {
				System.out.println("Invalid Move || Try Again");
			}
		}else {
			System.out.println("Player"+player2.getName() +"'s turn");		
			System.out.println("Enter x");
			int x = scan.nextInt();
			System.out.println("Enter y");
			int y = scan.nextInt();
			status = board.move(player2.getSymbol(),x,y);
			if(status!=Board.INVALID) {
			 player1turn=true;
			 board.print();
			}else {
				System.out.println("Invalid Move || Try Again");
			}
		}
		}
		if(status==Board.PLAYER_1_WINS) {
			System.out.println("Player 1-"+player1.getName() +"wins||");
		}else if(status==Board.PLAYER_2_WINS) {
			System.out.println("Player 2-"+player2.getName() +"wins||");
		}else {
			System.out.println("DRAW !!");
		}
	}


	private player takeplayerInput(int num) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Player"+ num+ "Name:");
		String name=scan.nextLine();
		System.out.println("Enter Player"+ num+ "Symbol:");
		char symbol=scan.next().charAt(0);
		player p = new player(name,symbol);
		return p;
	}
}
