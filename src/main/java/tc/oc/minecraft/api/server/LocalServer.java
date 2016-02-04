package tc.oc.minecraft.api.server;

import tc.oc.minecraft.api.command.ConsoleCommandSender;
import tc.oc.minecraft.api.logging.Loggable;
import tc.oc.minecraft.api.plugin.PluginManager;

/**
 * The local server i.e. the one hosting plugins
 */
public interface LocalServer extends Loggable, Server {

    PluginManager getPluginManager();

    ConsoleCommandSender getConsoleSender();
}