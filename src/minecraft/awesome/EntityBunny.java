package awesome;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityBunny extends EntityAnimal {
	
	public EntityBunny(World par1World) {
		super(par1World);
//		this.setSize(0.3F, 0.7F);
		this.tasks.addTask(1, new EntityAIPanic(this, 1.4D));
		this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAITempt(this, 1.0D, Item.carrot.itemID, false));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
    }
	
	public boolean isAIEnabled() {
		return true;
	}
	
	protected void fall(float par1) {}
    
	public EntityBunny spawnAnimal(EntityAgeable par1EntityAgeable) {
		return new EntityBunny(this.worldObj);
	}
	
	public boolean isBreedingItem(ItemStack par1ItemStack) {
		return par1ItemStack != null && par1ItemStack.itemID == Item.carrot.itemID;
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable entityageable) {
		// TODO Auto-generated method stub
		return this.spawnAnimal(entityageable);
	}
}
