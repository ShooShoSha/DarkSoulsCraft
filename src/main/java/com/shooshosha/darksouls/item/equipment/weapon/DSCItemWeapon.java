package com.shooshosha.darksouls.item.equipment.weapon;

import com.shooshosha.darksouls.item.*;
import com.shooshosha.darksouls.item.equipment.*;
import net.minecraft.creativetab.CreativeTabs;

import java.util.HashSet;
import java.util.Set;

public abstract class DSCItemWeapon extends DSCItem {
    private static Set<DSCItemWeapon> weapons = new HashSet<DSCItemWeapon>();

    private Damage attackRatings;
    //TODO Account for multiple damage types
    private Type damageType;
    private int durability;
    private double weight;
    private Requirement statsRequirements;
    private Scaling statsScaling;
    private Reduction reductionRatings;
    private int stability;
    private int soulValue;
    private Upgrade path;
    private int modifier;
    private Effect ailmentEffects;

    public DSCItemWeapon(String unlocalName) {
        super("weapon." + unlocalName);
        setCreativeTab(CreativeTabs.tabCombat);
        setMaxStackSize(1);
        setAttackRatings(0, 0, 0, 0, 0);
        setDamageType(Type.NORMAL);
        setDurability(0);
        setWeight(0);
        setStatsRequirements(0, 0, 0, 0);
        setStatsScaling(Bonus.Z, Bonus.Z, Bonus.Z, Bonus.Z);
        setReductionRatings(0.0, 0.0, 0.0, 0.0);
        setStability(0);
        setSoulValue(0);
        setPath(Upgrade.NORMAL);
        setModifier(0);
        setAilmentEffects(0, 0, 0, 0, 0, 0);
        weapons.add(this);
    }

    public static Set<DSCItemWeapon> getWeapons() {
        return weapons;
    }

    public Damage getAttackRatings() {
        return attackRatings;
    }

    public void setAttackRatings(int physical, int magical, int fire, int lightning, int critical) {
        this.attackRatings = new Damage(physical, magical, fire, lightning, critical);
    }

    public Type getDamageType() {
        return damageType;
    }

    public void setDamageType(Type damageType) {
        this.damageType = damageType;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Requirement getStatsRequirements() {
        return statsRequirements;
    }

    public void setStatsRequirements(int strength, int dexterity, int intelligence, int faith) {
        this.statsRequirements = new Requirement(strength, dexterity, intelligence, faith);
    }

    public Scaling getStatsScaling() {
        return statsScaling;
    }

    public void setStatsScaling(Bonus strength, Bonus dexterity, Bonus intelligence, Bonus faith) {
        this.statsScaling = new Scaling(strength, dexterity, intelligence, faith);
    }

    public Reduction getReductionRatings() {
        return reductionRatings;
    }

    public void setReductionRatings(double physical, double magical, double fire, double lightning) {
        this.reductionRatings = new Reduction(physical, magical, fire, lightning);
    }

    public int getStability() {
        return stability;
    }

    public void setStability(int stability) {
        this.stability = stability;
    }

    public int getSoulValue() {
        return soulValue;
    }

    public void setSoulValue(int soulValue) {
        this.soulValue = soulValue;
    }

    public Upgrade getPath() {
        return path;
    }

    public void setPath(Upgrade path) {
        this.path = path;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public Effect getAilmentEffects() {
        return ailmentEffects;
    }

    public void setAilmentEffects(int bleed, int curse, int poison, int toxic, int holy, int occult) {
        this.ailmentEffects = ailmentEffects;
    }
}
