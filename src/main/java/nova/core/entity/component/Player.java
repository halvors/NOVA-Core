package nova.core.entity.component;

import nova.core.entity.Entity;
import nova.core.inventory.component.InventoryPlayer;

import java.util.Optional;

/**
 * Basic representation of Player
 */
public abstract class Player extends Living {
	/**
	 * @return Returns player name that can be used to identify this player
	 */
	public abstract String getUsername();

	/**
	 * @return The entity of the player
	 */
	public abstract Entity entity();

	/**
	 * @return Returns the ID representing the player.
	 * For many games, the username is the ID.
	 */
	public String getPlayerID() {
		return getUsername();
	}

	/**
	 * @return Inventory of the player
	 */
	public abstract InventoryPlayer getInventory();

	/**
	 * @return Returns non-identifying player name
	 */
	public String getDisplayName() {
		return getUsername();
	}

	/**
	 * @return Returns a Optional with a Boolean that is true if player is sneaking.
	 */
	public abstract Optional<Boolean> isSneaking();
}
