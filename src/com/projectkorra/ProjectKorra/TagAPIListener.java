package com.projectkorra.ProjectKorra;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.kitteh.tag.AsyncPlayerReceiveNameTagEvent;

public class TagAPIListener implements Listener {

	ProjectKorra plugin;

	public TagAPIListener(ProjectKorra plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onNameTag(AsyncPlayerReceiveNameTagEvent e) {
		List<Element> elements = Methods.getBendingPlayer(e.getNamedPlayer().getName()).getElements();
		if (elements.size() > 1)
			e.setTag(ChatColor.LIGHT_PURPLE + e.getNamedPlayer().getName());
		else if (elements.get(0).equals(Element.Earth))
			e.setTag(ChatColor.GREEN + e.getNamedPlayer().getName());
		else if (elements.get(0).equals(Element.Air))
			e.setTag(ChatColor.GRAY + e.getNamedPlayer().getName());
		else if (elements.get(0).equals(Element.Water))
			e.setTag(ChatColor.AQUA + e.getNamedPlayer().getName());
		else if (elements.get(0).equals(Element.Fire))
			e.setTag(ChatColor.RED + e.getNamedPlayer().getName());
		else if (elements.get(0).equals(Element.Chi))
			e.setTag(ChatColor.GOLD + e.getNamedPlayer().getName());
	}
}
