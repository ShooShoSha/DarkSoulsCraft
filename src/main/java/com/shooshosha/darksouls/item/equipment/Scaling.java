package com.shooshosha.darksouls.item.equipment;

/**
 * @author shooshosha
 */
public class Scaling {
    private Bonus strength;
    private Bonus dexterity;
    private Bonus intelligence;
    private Bonus faith;

    public Scaling(Bonus strength, Bonus dexterity, Bonus intelligence, Bonus faith) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.faith = faith;
    }

    public Bonus getStrength() {
        return strength;
    }

    public void setStrength(Bonus strength) {
        this.strength = strength;
    }

    public Bonus getDexterity() {
        return dexterity;
    }

    public void setDexterity(Bonus dexterity) {
        this.dexterity = dexterity;
    }

    public Bonus getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Bonus intelligence) {
        this.intelligence = intelligence;
    }

    public Bonus getFaith() {
        return faith;
    }

    public void setFaith(Bonus faith) {
        this.faith = faith;
    }
}
