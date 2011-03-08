package com.alex_xr.HeroSpells.PersistencePlugin.bukkit.persistence.dao;

import com.alex_xr.HeroSpells.PersistencePlugin.bukkit.persistence.annotation.PersistClass;
import com.alex_xr.HeroSpells.PersistencePlugin.bukkit.persistence.annotation.PersistField;
import com.alex_xr.HeroSpells.PersistencePlugin.craftbukkit.persistence.Persistence;

/**
 * Represents a possible command sender.
 * 
 * This entity is pre-populated, currently only "generic" and "player" present.
 * 
 * Use of this class is currently hard-coded, so it would not be advised to add or
 * modify this data.
 * 
 * @author nathan
 *
 */
@PersistClass(name="sender", schema="global")
public class CommandSenderData extends Persisted
{
	public CommandSenderData()
	{
		
	}
	
	public CommandSenderData(String id, Class<?> senderClass)
	{
		this.id = id;
		if (senderClass != null)
		{
			this.className = senderClass.getName();
		}
	}
	
	public Class<?> getType()
	{
		if (className == null || className.length() == 0) return null;
		Class<?> senderType = null;
		try
		{
			senderType = Class.forName(className);
		}
		catch (ClassNotFoundException e)
		{
			Persistence.getLogger().severe("Persistence: CommandSender type " + className + " unknown.");
			senderType = null;
		}
		return senderType;
	}
	
	@PersistField(id=true)
	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}
	
	@PersistField
	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	protected String id;
	protected String className;
}
