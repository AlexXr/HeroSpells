package com.alex_xr.HeroSpells.PersistencePlugin.bukkit.permission;

import com.alex_xr.HeroSpells.PersistencePlugin.craftbukkit.permission.PermissionDescriptionNode;
import com.alex_xr.HeroSpells.PersistencePlugin.craftbukkit.permission.RootPermissionDescription;

public interface PermissionManager
{
	public void addHandler(PermissionHandler handler);
	public RootPermissionDescription getPermissionRoot(final String path);
	public PermissionDescriptionNode getPermissionPath(final String path);
}
