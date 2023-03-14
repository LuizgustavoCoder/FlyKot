package org.evilone

import org.bukkit.plugin.java.JavaPlugin
import org.evilone.Cmd.CFly

class FlyKotlin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        Commands()
    }

    private fun Commands() {
        getCommand("fly").executor = CFly()
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}