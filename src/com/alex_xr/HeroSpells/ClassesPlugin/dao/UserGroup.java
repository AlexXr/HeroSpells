package com.alex_xr.HeroSpells.ClassesPlugin.dao;

import com.alex_xr.HeroSpells.PersistencePlugin.bukkit.persistence.annotation.PersistField;
import com.alex_xr.HeroSpells.PersistencePlugin.bukkit.persistence.annotation.PersistClass;

@PersistClass(name = "group", schema = "classes") 
public class UserGroup
{
	private String 		id;
	private String 		name;
	private String 		description;
	private UserGroup 	parent;
	
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
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@PersistField
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	@PersistField
	public UserGroup getParent()
	{
		return parent;
	}
	public void setParent(UserGroup parent)
	{
		this.parent = parent;
	}
}
