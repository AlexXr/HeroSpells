package com.alex_xr.HeroSpells.SpellsPlugin.SpellsPlugin;

import java.util.ArrayList;
import java.util.List;

class SpellGroup implements Comparable<SpellGroup>
{
	public String groupName;
	public List<SpellVariant> spells = new ArrayList<SpellVariant>();
	
	public int compareTo(SpellGroup other) 
	{
		return groupName.compareTo(other.groupName);
	}
}
