package io.luna.game.event.impl;

import io.luna.game.event.EventArguments;
import io.luna.game.model.mobile.Npc;
import io.luna.game.model.mobile.Player;

/**
 * An npc-click based event. Not intended for interception.
 *
 * @author lare96 <http://github.org/lare96>
 */
public class NpcClickEvent extends PlayerEvent {

    /* Needs to be public so inner classes are visible. */

    /**
     * An event sent when a player clicks an npc's first index.
     *
     * @author lare96 <http://github.org/lare96>
     */
    public static final class NpcFirstClickEvent extends NpcClickEvent {

        /**
         * Creates a new {@link NpcClickEvent}.
         */
        public NpcFirstClickEvent(Player player, Npc npc) {
            super(player, npc);
        }
    }

    /**
     * An event sent when a player clicks an npc's second index.
     *
     * @author lare96 <http://github.org/lare96>
     */
    public static final class NpcSecondClickEvent extends NpcClickEvent {

        /**
         * Creates a new {@link NpcSecondClickEvent}.
         */
        public NpcSecondClickEvent(Player player, Npc npc) {
            super(player, npc);
        }
    }

    /**
     * An event sent when a player clicks an npc's third index.
     *
     * @author lare96 <http://github.org/lare96>
     */
    public static final class NpcThirdClickEvent extends NpcClickEvent {

        /**
         * Creates a new {@link NpcClickEvent}.
         */
        public NpcThirdClickEvent(Player player, Npc npc) {
            super(player, npc);
        }
    }

    /**
     * An event sent when a player clicks an npc's fourth index.
     *
     * @author lare96 <http://github.org/lare96>
     */
    public static final class NpcFourthClickEvent extends NpcClickEvent {

        /**
         * Creates a new {@link NpcClickEvent}.
         */
        public NpcFourthClickEvent(Player player, Npc npc) {
            super(player, npc);
        }
    }

    /**
     * An event sent when a player clicks an npc's fifth index.
     *
     * @author lare96 <http://github.org/lare96>
     */
    public static final class NpcFifthClickEvent extends NpcClickEvent {

        /**
         * Creates a new {@link NpcClickEvent}.
         */
        public NpcFifthClickEvent(Player player, Npc npc) {
            super(player, npc);
        }
    }

    /**
     * The non-player character.
     */
    private final Npc npc;

    /**
     * Creates a new {@link NpcClickEvent}.
     *
     * @param player The player.
     * @param npc The non-player character.
     */
    private NpcClickEvent(Player player, Npc npc) {
        super(player);
        this.npc = npc;
    }

    @Override
    public final boolean matches(EventArguments args) {
        return args.contains(npc.getId());
    }

    /**
     * @return The non-player character.
     */
    public Npc npc() {
        return npc;
    }
}
