package me.liyua.bedwars

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {
        this.logger.info("Hello World!")
    }
}