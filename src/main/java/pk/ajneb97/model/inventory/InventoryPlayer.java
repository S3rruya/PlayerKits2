package pk.ajneb97.model.inventory;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class InventoryPlayer {
    private Player player;
    private String inventoryName;

    private String previousInventoryName;
    private String kitName;
    private int previewShulkerIndex;
    private ItemStack[] savedInventoryContents;

    public InventoryPlayer(Player player, String inventoryName) {
        this.player = player;
        this.inventoryName = inventoryName;
        this.previewShulkerIndex = 0;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getPreviousInventoryName() {
        return previousInventoryName;
    }

    public void setPreviousInventoryName(String previousInventoryName) {
        this.previousInventoryName = previousInventoryName;
    }

    public String getKitName() {
        return kitName;
    }

    public void setKitName(String kitName) {
        this.kitName = kitName;
    }

    public int getPreviewShulkerIndex() {
        return previewShulkerIndex;
    }

    public void setPreviewShulkerIndex(int previewShulkerIndex) {
        this.previewShulkerIndex = previewShulkerIndex;
    }

    public void restoreSavedInventoryContents() {
        if(savedInventoryContents != null){
            player.getInventory().setContents(savedInventoryContents);
            //player.updateInventory();
            savedInventoryContents = null;
        }
    }

    public void saveInventoryContents() {
        if(this.savedInventoryContents == null){
            this.savedInventoryContents = player.getInventory().getContents();
        }
    }
}
