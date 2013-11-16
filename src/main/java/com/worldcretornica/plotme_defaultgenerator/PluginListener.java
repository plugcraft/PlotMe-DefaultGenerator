/*
 * Copyright (C) 2013 Fabrizio Lungo <fab@lungo.co.uk> - All Rights Reserved
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Created by Fabrizio Lungo <fab@lungo.co.uk>, November 2013
 */
package com.worldcretornica.plotme_defaultgenerator;

import me.flungo.bukkit.plotme.abstractgenerator.AbstractGenerator;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginEnableEvent;

/**
 *
 * @author Fabrizio Lungo <fab@lungo.co.uk>
 */
public class PluginListener implements Listener {

    private final PlotMe_DefaultGenerator plugin;

    public PluginListener(PlotMe_DefaultGenerator plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPluginEnable(final PluginEnableEvent event) {
        if (event.getPlugin().getName().equals(AbstractGenerator.CORE_PLUGIN_NAME)) {
            plugin.importOldConfigs();
        }
    }
}