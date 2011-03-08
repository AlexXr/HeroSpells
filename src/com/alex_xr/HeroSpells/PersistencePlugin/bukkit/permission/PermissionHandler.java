package com.alex_xr.HeroSpells.PersistencePlugin.bukkit.permission;

import org.bukkit.entity.Player;

public interface PermissionHandler
{
	public boolean isSet(Player player, String permissionNode);
}
