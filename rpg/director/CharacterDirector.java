package rpg.director;

import rpg.builder.CharacterBuilder;
import rpg.product.Character;

public class CharacterDirector {
    
    public Character defaultWarrior() {
        return new CharacterBuilder("Grom", "Orc", "Warrior")
            .withEquippedWeapon("Two-handed Axe")
            .withArmor("Heavy Plate Armor")
            .addSkill("Charge")
            .addSkill("Cleave")
            .withLevel(5)
            .build();
    }

    public Character defaultMage() {
        return new CharacterBuilder("Eldoria", "Elf", "Mage")
            .withEquippedWeapon("Staff of Wisdom")
            .withArmor("Robes of the Archmage")
            .addSkill("Fireball")
            .addSkill("Teleport")
            .addSkill("Mana Shield")
            .withPet("Owl")
            .withLevel(10)
            .build();
    }
}
