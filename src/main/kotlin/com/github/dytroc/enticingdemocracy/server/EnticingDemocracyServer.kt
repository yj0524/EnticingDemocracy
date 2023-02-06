package com.github.yj0524.enticingdemocracy.server

import com.github.yj0524.enticingdemocracy.EnticingDemocracy
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.DedicatedServerModInitializer

object EnticingDemocracyServer : DedicatedServerModInitializer {
    /**
     * Runs the mod initializer on the server environment.
     */
    override fun onInitializeServer() {
        EnticingDemocracy.logger.info("Server initialized!")
    }

}