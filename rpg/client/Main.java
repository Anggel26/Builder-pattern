package rpg.client;

import rpg.builder.CharacterBuilder;
import rpg.director.CharacterDirector;
import rpg.product.Character;

public class Main {
    public static void main(String[] args) {
        
        Character wellEquipped = new CharacterBuilder("Arthur", "Human", "Paladin")
            .withEquippedWeapon("Excalibur")
            .withArmor("Shining Armor")
            .withPet("White Horse")
            .addSkill("Holy Light")
            .addSkill("Shield Bash")
            .addSkill("Divine Smite")
            .withLevel(20)
            .build();
            
        Character minimumAttributes = new CharacterBuilder("Bob", "Dwarf", "Peasant").build();
        
        CharacterDirector director = new CharacterDirector();
        Character templateCharacter = director.defaultMage();
        
        System.out.println(wellEquipped.printSheet());
        System.out.println(minimumAttributes.printSheet());
        System.out.println(templateCharacter.printSheet());
    }
}
