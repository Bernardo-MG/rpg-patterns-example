
package com.bernardomg.example.rpg.builder.item;

import com.bernardomg.example.rpg.inventory.item.Equipment;

public interface EquipmentBuilder {

    public Equipment get();

    public EquipmentBuilder withAttribute(final String name,
            final Integer value);

    public EquipmentBuilder withProperty(final String property);

    public EquipmentBuilder withSlots(final Iterable<String> slots);

    public EquipmentBuilder withSlots(final String slot);

}