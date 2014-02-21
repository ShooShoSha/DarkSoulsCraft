package com.shooshosha.darksouls.item.weapon;

import net.minecraft.item.Item;

import com.shooshosha.darksouls.item.DSCItem;

public abstract class Weapon extends DSCItem {
	private int physicalDamage;
	private int magicalDamage;
	private int fireDamage;
	private int lightningDamage;
	private int physicalDamageReduction;
	private int magicalDamageReduction;
	private int fireDamageReduction;
	private int lightningDamageReduction;
	private int strengthStatusRequired;
	private int dexterityStatusRequired;
	private int intelligenceStatusRequired;
	private int faithStatusRequired;
	private Bonus strengthStatusBonus;
	private Bonus dexterityStatusBonus;
	private Bonus intelligenceStatusBonus;
	private Bonus faithStatusBonus;
	private boolean isNormal;
	private boolean isStriking;
	private boolean isSlashing;
	private boolean isThrusting;
	private int criticalDamage;
	private int weight;
	private int durability;
	private int soulValue;
	private Upgrade path;
	private int modifier;
	private int stability;
	
	public Weapon() {
		super();
		setMaxStackSize(1);
		setPath(Upgrade.NORMAL);
		setModifier(0);
	}
	
	@Override
	public final Item setMaxStackSize(int stackSize) {
		return super.setMaxStackSize(1);
	}
	
	private boolean isNegative(int integerCandidate) {
		return integerCandidate < 0;
	}
	
	private boolean isPercent(int percentCandidate) {
		return 0 <= percentCandidate && percentCandidate <= 100;
	}
	
	/**
	 * Subclasses must implement this to set base status for weapon. Needs to call:
	 * <li> {@link #setDamages(int, int, int, int)}
	 * <li> {@link #setReductions(int, int, int, int)}
	 * <li> {@link #setRequirements(int, int, int, int)}
	 * <li> {@link #setBonuses(Bonus, Bonus, Bonus, Bonus)}
	 * <li> {@link #setTypes(boolean, boolean, boolean, boolean)}
	 * <li> {@link #setCritcalDamage(int)}
	 * <li> {@link #setWeight(int)}
	 * <li> {@link #setDurability(int)}
	 * <li> {@link #setSoulValue(int)}
	 * <li> {@link #setStability(int)}
	 */
	protected abstract void setBaseStatuses();
	
	/**
	 * Sets attack ratings for the following types.
	 * @param physical
	 * @param magical
	 * @param fire
	 * @param lightning
	 */
	protected final void setDamages(int physical, int magical, int fire, int lightning) {
		setPhysicalDamage(physical);
		setMagicalDamage(magical);
		setFireDamage(fire);
		setLightningDamage(lightning);
	}
	
	/**
	 * Sets the damage reduction when blocking for the following types.
	 * @param physical
	 * @param magical
	 * @param fire
	 * @param lightning
	 */
	protected final void setReductions(int physical, int magical, int fire, int lightning) {
		setPhysicalDamageReduction(physical);
		setMagicalDamageReduction(magical);
		setFireDamageReduction(fire);
		setLightningDamageReduction(lightning);
	}
	
	protected final void setRequirements(int strength, int dexterity, int intelligence, int faith) {
		setStrengthStatusRequired(strength);
		setDexterityStatusRequired(dexterity);
		setIntelligenceStatusRequired(intelligence);
		setFaithStatusRequired(faith);
	}
	
	protected final void setBonuses(Bonus strength, Bonus dexterity, Bonus intelligence, Bonus faith) {
		setStrengthStatusBonus(strength);
		setDexterityStatusBonus(dexterity);
		setIntelligenceStatusBonus(intelligence);
		setFaithStatusBonus(faith);
	}
	
	protected final void setTypes(boolean normal, boolean strike, boolean slash, boolean thrust) {
		setNormal(normal);
		setStriking(strike);
		setSlashing(slash);
		setThrusting(thrust);
	}

	public final void setPhysicalDamage(int physicalDamage) {
		if(!isNegative(physicalDamage))
			this.physicalDamage = physicalDamage;
	}

	public final void setMagicalDamage(int magicalDamage) {
		if(!isNegative(magicalDamage))
			this.magicalDamage = magicalDamage;
	}

	public final void setFireDamage(int fireDamage) {
		if(!isNegative(fireDamage))
			this.fireDamage = fireDamage;
	}

	public final void setLightningDamage(int lightningDamage) {
		if(!isNegative(lightningDamage))
			this.lightningDamage = lightningDamage;
	}

	public final void setPhysicalDamageReduction(int physicalDamageReduction) {
		if(isPercent(physicalDamageReduction))
			this.physicalDamageReduction = physicalDamageReduction;
	}

	public final void setMagicalDamageReduction(int magicalDamageReduction) {
		if(isPercent(magicalDamageReduction))
			this.magicalDamageReduction = magicalDamageReduction;
	}

	public final void setFireDamageReduction(int fireDamageReduction) {
		if(isPercent(fireDamageReduction))
			this.fireDamageReduction = fireDamageReduction;
	}

	public final void setLightningDamageReduction(int lightningDamageReduction) {
		if(isPercent(lightningDamageReduction))
			this.lightningDamageReduction = lightningDamageReduction;
	}

	public final void setStrengthStatusRequired(int strengthStatusRequired) {
		if(!isNegative(strengthStatusRequired))
			this.strengthStatusRequired = strengthStatusRequired;
	}

	public final void setDexterityStatusRequired(int dexterityStatusRequired) {
		if(!isNegative(dexterityStatusRequired))
			this.dexterityStatusRequired = dexterityStatusRequired;
	}

	public final void setIntelligenceStatusRequired(int intelligenceStatusRequired) {
		if(!isNegative(intelligenceStatusRequired))
			this.intelligenceStatusRequired = intelligenceStatusRequired;
	}

	public final void setFaithStatusRequired(int faithStatusRequired) {
		if(!isNegative(faithStatusRequired))
			this.faithStatusRequired = faithStatusRequired;
	}

	public final void setStrengthStatusBonus(Bonus strengthStatusBonus) {
		this.strengthStatusBonus = strengthStatusBonus;
	}

	public final void setDexterityStatusBonus(Bonus dexterityStatusBonus) {
		this.dexterityStatusBonus = dexterityStatusBonus;
	}

	public final void setIntelligenceStatusBonus(Bonus intelligenceStatusBonus) {
		this.intelligenceStatusBonus = intelligenceStatusBonus;
	}

	public final void setFaithStatusBonus(Bonus faithStatusBonus) {
		this.faithStatusBonus = faithStatusBonus;
	}

	public final void setNormal(boolean isNormal) {
		this.isNormal = isNormal;
	}

	public final void setStriking(boolean isStriking) {
		this.isStriking = isStriking;
	}

	public final void setSlashing(boolean isSlashing) {
		this.isSlashing = isSlashing;
	}

	public final void setThrusting(boolean isThrusting) {
		this.isThrusting = isThrusting;
	}

	public final void setCriticalDamage(int criticalDamage) {
		if(!isNegative(criticalDamage))
			this.criticalDamage = criticalDamage;
	}

	public final void setWeight(int weight) {
		if(isNegative(weight))
			this.weight = weight;
	}

	public final void setDurability(int durability) {
		if(!isNegative(durability))
			this.durability = durability;
	}

	public final void setSoulValue(int soulValue) {
		if(!isNegative(soulValue))
			this.soulValue = soulValue;
	}
	
	public final void setPath(Upgrade path) {
		this.path = path;
	}

	public final void setModifier(int modifier) {
		this.modifier = modifier;
	}

	public final void setStability(int stability) {
		this.stability = stability;
	}

	public final int getPhysicalDamage() {
		return physicalDamage;
	}

	public final int getMagicalDamage() {
		return magicalDamage;
	}

	public final int getFireDamage() {
		return fireDamage;
	}

	public final int getLightningDamage() {
		return lightningDamage;
	}

	public final int getPhysicalDamageReduction() {
		return physicalDamageReduction;
	}

	public final int getMagicalDamageReduction() {
		return magicalDamageReduction;
	}

	public final int getFireDamageReduction() {
		return fireDamageReduction;
	}

	public final int getLightningDamageReduction() {
		return lightningDamageReduction;
	}

	public final int getStrengthStatusRequired() {
		return strengthStatusRequired;
	}

	public final int getDexterityStatusRequired() {
		return dexterityStatusRequired;
	}

	public final int getIntelligenceStatusRequired() {
		return intelligenceStatusRequired;
	}

	public final int getFaithStatusRequired() {
		return faithStatusRequired;
	}

	public final Bonus getStrengthStatusBonus() {
		return strengthStatusBonus;
	}

	public final Bonus getDexterityStatusBonus() {
		return dexterityStatusBonus;
	}

	public final Bonus getIntelligenceStatusBonus() {
		return intelligenceStatusBonus;
	}

	public final Bonus getFaithStatusBonus() {
		return faithStatusBonus;
	}

	public final boolean isNormal() {
		return isNormal;
	}

	public final boolean isStriking() {
		return isStriking;
	}

	public final boolean isSlashing() {
		return isSlashing;
	}

	public final boolean isThrusting() {
		return isThrusting;
	}

	public final int getCritcalDamage() {
		return criticalDamage;
	}

	public final int getWeight() {
		return weight;
	}

	public final int getDurability() {
		return durability;
	}

	public final int getSoulValue() {
		return soulValue;
	}

	public final Upgrade getPath() {
		return path;
	}

	public final int getModifier() {
		return modifier;
	}

	public final int getStability() {
		return stability;
	}
}
