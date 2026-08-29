package rpg.builder;

import java.util.ArrayList;
import java.util.List;
import rpg.product.Character;

public class CharacterBuilder {
    private String name;
    private String race;
    private String characterClass;
    private String equippedWeapon;
    private String armor;
    private List<String> skills = new ArrayList<>();
    private String pet;
    private int level = 1;

    public CharacterBuilder(String name, String race, String characterClass) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
    }

    public CharacterBuilder withEquippedWeapon(String equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
        return this;
    }

    public CharacterBuilder withArmor(String armor) {
        this.armor = armor;
        return this;
    }

    public CharacterBuilder addSkill(String skill) {
        this.skills.add(skill);
        return this;
    }

    public CharacterBuilder withPet(String pet) {
        this.pet = pet;
        return this;
    }

    public CharacterBuilder withLevel(int level) {
        this.level = level;
        return this;
    }

    public Character build() {
        return new Character(name, race, characterClass, equippedWeapon, armor, skills, pet, level);
    }
}
