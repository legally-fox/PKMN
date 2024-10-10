package ru.mirea.pryazhentsevaes.pkmn;

public enum EnergyType {
    FIRE("F"),
    GRASS("G"),
    WATER("W"),
    LIGHTNING("L"),
    PSYCHIC("P"),
    FIGHTING("H"),
    DARKNESS("D"),
    METAL("M"),
    FAIRY("I"),
    DRAGON("R"),
    COLORLESS("C");

    private String forshort;

    EnergyType(String forshort) {
        this.forshort = forshort;
    }

    public String Get_ShortName() {
        return this.forshort;
    }
}