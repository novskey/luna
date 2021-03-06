package io.luna;

import io.luna.game.GameService;
import io.luna.game.model.World;
import io.luna.game.plugin.PluginManager;

/**
 * A model representing a single instance of Runescape. Only one instance should exist at a time, unless
 * multiple servers are being ran on the same system.
 *
 * @author lare96 <http://github.org/lare96>
 */
public final class LunaContext {

    /**
     * The world.
     */
    private final World world = new World(this);

    /**
     * The game service.
     */
    private final GameService service = new GameService(this);

    /**
     * The plugin manager.
     */
    private final PluginManager plugins = new PluginManager(this);

    /**
     * A package-private constructor.
     */
    LunaContext() {
    }

    /**
     * @return The world.
     */
    public World getWorld() {
        return world;
    }

    /**
     * @return The game service.
     */
    public GameService getService() {
        return service;
    }

    /**
     * @return The plugin manager.
     */
    public PluginManager getPlugins() {
        return plugins;
    }
}
