/*
https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java

Create a function that returns the name of the winner in a fight between two fighters.

Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.

Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.

Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
 */

public class Two_Fighters_One_Winner {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (!fighter1.name.equals(firstAttacker)) {
            Fighter temp = fighter1;
            fighter1 = fighter2;
            fighter2 = temp;
        }
        while (fighter1.health > 0 && fighter2.health > 0) {
            fighter2.health -= fighter1.damagePerAttack;
            fighter1.health -= fighter2.damagePerAttack;
        }

        if (fighter1.health <= 0 && fighter2.health <=0) {
            return firstAttacker;
        } else {
            if (fighter1.health <= 0) {
                return fighter2.name;
            } else {
                return fighter1.name;
            }
        }
    }

    public class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
}
