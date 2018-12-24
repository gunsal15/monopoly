package domain.model.cards.communityChestCards;

import java.util.HashMap;

import domain.model.cards.CommunityChestCard;
import domain.model.gameHandler.Board;
import domain.model.gameHandler.GameState;
import domain.model.players.Player;

public class PayHospitalBillsCard extends CommunityChestCard{

	
	public PayHospitalBillsCard(String name, String d) {
		super(name, d);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void action(Player currentPlayer) {
		// TODO Auto-generated method stub
		Board board = Board.getInstance();
		GameState game = GameState.getInstance();
		
		int newPoolBalance = board.getPoolBalance() + 100;
		int newPlayerBalance = currentPlayer.getBalance() - 100;
		
		HashMap<String, String> mapForUITransfer = new HashMap<String, String>();
		mapForUITransfer.put("type", "payHospitalBill");
		
		board.setPoolBalance(newPoolBalance);
		currentPlayer.setBalance(newPlayerBalance);
		
		String pName = currentPlayer.getName();
		
		mapForUITransfer.put(pName, ((Integer) newPlayerBalance).toString());
		mapForUITransfer.put("Pool", ((Integer) newPoolBalance).toString());
		
		game.publishToUIListeners(mapForUITransfer);////displays player&pool balances in UI.
		game.publishToNetworkListeners(mapForUITransfer);//publish the mapping to the network.
	}

	
	
}
