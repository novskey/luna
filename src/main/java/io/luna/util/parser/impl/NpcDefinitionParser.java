package io.luna.util.parser.impl;

import com.google.gson.JsonObject;
import io.luna.game.model.def.NpcDefinition;
import io.luna.util.GsonUtils;
import io.luna.util.parser.GsonParser;

import java.util.List;

/**
 * A {@link GsonParser} implementation that reads NPC definitions.
 *
 * @author lare96 <http://github.org/lare96>
 */
public final class NpcDefinitionParser extends GsonParser<NpcDefinition> {

    /**
     * The array of parsed definitions.
     */
    private final NpcDefinition[] definitions;

    /**
     * Creates a new {@link NpcDefinitionParser}.
     *
     * @param definitions The array of parsed definitions.
     */
    public NpcDefinitionParser(NpcDefinition[] definitions) {
        super("./data/npcs/npc_defs.json");
        this.definitions = definitions;
    }

    @Override
    public NpcDefinition readObject(JsonObject reader) throws Exception {
        int id = reader.get("id").getAsInt();
        String name = reader.get("name").getAsString();
        String examine = reader.get("examine").getAsString();
        int size = reader.get("size").getAsInt();
        int walkAnimation = reader.get("walk_animation").getAsInt();
        int walkBackAnimation = reader.get("walk_back_animation").getAsInt();
        int walkLeftAnimation = reader.get("walk_left_animation").getAsInt();
        int walkRightAnimation = reader.get("walk_right_animation").getAsInt();
        String[] actions = GsonUtils.getAsType(reader.get("actions"), String[].class);

        return new NpcDefinition(id, name, examine, size, walkAnimation, walkBackAnimation, walkLeftAnimation,
            walkRightAnimation, actions);
    }

    @Override
    public void onReadComplete(List<NpcDefinition> readObjects) throws Exception {
        readObjects.forEach(it -> definitions[it.getId()] = it);
    }
}