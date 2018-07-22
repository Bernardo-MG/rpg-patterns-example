
package com.bernardomg.example.rpg.character.item;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.bernardomg.example.rpg.character.Character;
import com.bernardomg.example.rpg.character.builder.DefaultCharacterBuilder;
import com.bernardomg.example.rpg.character.constants.DefaultItemSlots;
import com.bernardomg.example.rpg.character.constants.DefaultStats;
import com.bernardomg.example.rpg.character.item.builder.DefaultItemBuilder;

@RunWith(JUnitPlatform.class)
public final class TestDefaultCharacterItemStat {

    private final Character character;

    private final Equipment equipment;

    public TestDefaultCharacterItemStat() {
        super();

        character = new DefaultCharacterBuilder()
                .withAttribute(DefaultStats.STRENGTH.getKey())
                .withMultipliedDerivedAttribute(DefaultStats.DAMAGE.getKey(),
                        DefaultStats.STRENGTH.getKey(), 2)
                .withItemSlot(DefaultItemSlots.LEFT_HAND.getKey()).get();

        equipment = new DefaultItemBuilder().equipment()
                .withAttribute(DefaultStats.DAMAGE.getKey(), 5).get();
    }

    @Test
    public final void testDerived_WithEquipment() {
        character.setStatValue(DefaultStats.STRENGTH.getKey(), 2);
        character.addEquipment(DefaultItemSlots.LEFT_HAND.getKey(), equipment);

        Assertions.assertEquals((Integer) 9,
                character.getStatValue(DefaultStats.DAMAGE.getKey()));
    }

}