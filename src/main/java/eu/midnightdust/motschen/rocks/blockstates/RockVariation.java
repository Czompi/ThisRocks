package eu.midnightdust.motschen.rocks.blockstates;

import net.minecraft.util.StringIdentifiable;

public enum RockVariation implements StringIdentifiable {
    TINY("tiny"),
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    private final String name;

    RockVariation(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String asString() {
        return this.name;
    }
}
