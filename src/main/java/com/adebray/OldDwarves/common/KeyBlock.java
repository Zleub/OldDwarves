package com.adebray.OldDwarves.common;
import com.adebray.OldDwarves.OldDwarves;

import org.lwjgl.input.Keyboard;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class KeyBlock extends Block {
	public class KeyBlockEventHandler {
		
		@SubscribeEvent
		public void PlayerInteract(PlayerInteractEvent event) {
			if (!event.world.getBlock(event.x, event.y, event.z).getUnlocalizedName().equals(OldDwarves.instance.blockA.getUnlocalizedName()))
				return ;

			boolean shift = false;
			boolean shifted = false;

			if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
				shift = true;
			if (shift || event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {
				shifted = true;
				event.setCanceled(true);
			}
			
			OldDwarves.instance.Debug(event.action + ":" + event.world.getBlock(event.x, event.y, event.z).getUnlocalizedName());			
			if (shifted == true)
				OldDwarves.instance.Debug("this is a right click ?");
		}
	}
		
	public KeyBlockEventHandler eventhandler = new KeyBlockEventHandler();
	
	public KeyBlock() {
		super(Material.ground);

		setBlockTextureName("OldDwarves:test0");
		setBlockName("DefaultName");
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.5F);
		setLightOpacity(0);
		
	}
}
