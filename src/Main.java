import attack.ArrowAttack;
import attack.SwordAttack;
import defend.ArmorDefend;
import defend.ShieldDefend;
import fly.PlaneFly;
import fly.RocketFly;
import fly.WingsFly;
import sound.NormalSound;
import sound.ToaSound;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Duck superDuck = new Duck(new RocketFly(), new ToaSound(), new ArrowAttack(), new ShieldDefend());
        System.out.println("Super Duck Behaviour : ");
        System.out.print("Fly\t\t: "); superDuck.fly();
        System.out.print("Sound\t: "); superDuck.sound();
        System.out.print("Attack\t: "); superDuck.attack();
        System.out.print("Defend\t: "); superDuck.defend();

        Duck noobDuck = new Duck(new WingsFly(), new NormalSound(), new SwordAttack(), new ArmorDefend());
        System.out.println("\nNoob Duck Behaviour : ");
        System.out.print("Fly\t\t: "); noobDuck.fly();
        System.out.print("Sound\t: "); noobDuck.sound();
        System.out.print("Attack\t: "); noobDuck.attack();
        System.out.print("Defend\t: "); noobDuck.defend();

        System.out.println("\nSuper Duck Change Fly and Defend Behaviour : ");
        superDuck.setFlyBehaviour(new PlaneFly());
        superDuck.setDefendBehaviour(new ArmorDefend());
        System.out.print("Fly\t\t: "); superDuck.fly();
        System.out.print("Sound\t: "); superDuck.sound();
        System.out.print("Attack\t: "); superDuck.attack();
        System.out.print("Defend\t: "); superDuck.defend();
    }
}
