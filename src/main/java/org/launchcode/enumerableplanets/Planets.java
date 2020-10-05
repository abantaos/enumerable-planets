package org.launchcode.enumerableplanets;

public enum Planets {
    MERCURY("Mercury"),
    VENUS("Venus"),
    EARTH("Earth"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    SATURN("Saturn"),
    URANUS("Uranus"),
    NEPTUNE("Neptune");

    private String name;

    private Planets(String name) { //cannot have public constructor for enum
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

}
