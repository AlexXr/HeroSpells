package com.alex_xr.HeroSpells.PersistencePlugin.bukkit.persistence;

import java.util.ArrayList;
import java.util.List;

import com.alex_xr.HeroSpells.PersistencePlugin.bukkit.persistence.annotation.Migrate;
import com.alex_xr.HeroSpells.PersistencePlugin.bukkit.persistence.annotation.MigrateStep;
import com.alex_xr.HeroSpells.PersistencePlugin.bukkit.persistence.dao.MigrationStep;
import com.alex_xr.HeroSpells.PersistencePlugin.craftbukkit.persistence.core.PersistedClass;

public class MigrationInfo
{
	public MigrationInfo()
	{
	}
	
	public MigrationInfo(PersistedClass entityClass, Migrate info)
	{
		if (info.steps() != null)
		{
			steps = new ArrayList<MigrationStep>();
			for (MigrateStep stepInfo : info.steps())
			{
				MigrationStep step = new MigrationStep(entityClass, stepInfo);
				steps.add(step);
			}
		}
	}

	public List<MigrationStep> getSteps()
	{
		return steps;
	}

	protected List<MigrationStep>	steps	= null;
}
