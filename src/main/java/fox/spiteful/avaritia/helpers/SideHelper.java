package fox.spiteful.avaritia.helpers;

import cpw.mods.fml.common.FMLCommonHandler;

public final class SideHelper
{
	private static FMLCommonHandler FCH = FMLCommonHandler.instance();

	public static final boolean isClientSide() {
		return SideHelper.FCH.getEffectiveSide().isClient();
	}

	public static final boolean isServerSide() {
		return SideHelper.FCH.getEffectiveSide().isServer();
	}
}