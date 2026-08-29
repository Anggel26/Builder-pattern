package rpg.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Character {
    private final String name;
    private final String race;
    private final String characterClass;
    private final String equippedWeapon;
    private final String armor;
    private final List<String> skills;
    private final String pet;
    private final int level;

    public Character(String name, String race, String characterClass, String equippedWeapon, String armor, List<String> skills, String pet, int level) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.equippedWeapon = equippedWeapon;
        this.armor = armor;
        this.skills = Collections.unmodifiableList(new ArrayList<>(skills));
        this.pet = pet;
        this.level = level;
    }

    public String printSheet() {
        StringBuilder sb = new StringBuilder();
        sb.append("Character Sheet:\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Race: ").append(race).append("\n");
        sb.append("Class: ").append(characterClass).append("\n");
        
        if (equippedWeapon != null && !equippedWeapon.trim().isEmpty()) {
            sb.append("Weapon: ").append(equippedWeapon).append("\n");
        }
        if (armor != null && !armor.trim().isEmpty()) {
            sb.append("Armor: ").append(armor).append("\n");
        }
        if (skills != null && !skills.isEmpty()) {
            sb.append("Skills: ").append(String.join(", ", skills)).append("\n");
        }
        if (pet != null && !pet.trim().isEmpty()) {
            sb.append("Pet: ").append(pet).append("\n");
        }
        sb.append("Level: ").append(level).append("\n");
        return sb.toString();
    }
}
