package com.adebray.OldDwarves.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GlassBlock extends Block {
	
	@Override
	public boolean isOpaqueCube () {
		return false;
	}
	
	public GlassBlock() {
		super(Material.glass);

		setBlockTextureName("OldDwarves:test1");
		setBlockName("DefaultGlass");
		setCreativeTab(CreativeTabs.tabBlock);
	}
}