/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.farming;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public interface IFarmInventory {
	boolean hasResources(NonNullList<ItemStack> resources);

	void removeResources(NonNullList<ItemStack> resources);

	boolean acceptsAsSeedling(ItemStack itemstack);

	boolean acceptsAsResource(ItemStack itemstack);

	boolean acceptsAsFertilizer(ItemStack itemstack);

	IInventory getProductInventory();

	IInventory getGermlingsInventory();

	IInventory getResourcesInventory();

	IInventory getFertilizerInventory();


}
