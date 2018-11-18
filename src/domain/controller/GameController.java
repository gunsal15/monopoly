package domain.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import domain.model.Board;
import domain.model.GameState;
import domain.model.Piece;
import domain.model.Player;
import domain.model.dice.Cup;
import domain.model.dice.faceValue;

public class GameController {
	private static GameController controller;
	private Board board = Board.getInstance();
	private GameState gameState = GameState.getInstance();
	private NetworkController networkController;
	private Player localPlayer;
	
	private GameController() {}
	
	public static synchronized GameController getInstance() {
		if(controller == null) {
			controller = new GameController();
		}
		return controller;
	}
	
	public void roll() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("type", "roll");
		board.rollCup();
		Cup cup = Cup.getInstance();
		List<faceValue> faceValList = cup.getFaceValues();
		for(int i=0; i<3;i++) {
			map.put("faceValue" + i, faceValList.get(i).toString());
		}
	}
	
	public void initializePlayers(HashMap<String, String> map) {
		ArrayList<Player> playerList = gameState.getPlayerList();
		int playerCount = Integer.parseInt(map.get("playerCount"));
		for(int i=0; i<playerCount; i++) {
			String key = "player" + i + "Name";
			String username = map.get(key);
			key = "player" + i + "ID";
			int ID = Integer.parseInt(map.get(key));
			Player p = new Player(username, ID, new Piece());
			playerList.add(p);
		}
	}
	
	
	public void move() {
		board.movePiece();
		System.out.println("Piece move Completed");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("type", "endTurn");
		map.put("currentPlayer", GameState.getInstance().getCurrentPlayer().getName());
		networkController.sendMessageToPlayers(map);
	}

	public void setNetworkController(NetworkController networkController) {
		this.networkController = networkController;
	}

	public Player getLocalPlayer() {
		return localPlayer;
	}

	public void setLocalPlayer(Player localPlayer) {
		this.localPlayer = localPlayer;
	}
}
