package jp.ac.uryukyu.ie.e205728;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Warriortest {
    /**
     * 
     */
    @Test
    void attackWithWeponSkilltest(){
        int defaultHeroHp = 100;
        int defaultHeroAttack = 100;
        int wantWithWeponAttack = (int) (defaultHeroAttack * 1.5);
        Warrior demoWarrior = new Warrior("デモ勇者", defaultHeroHp, defaultHeroAttack);
        Enemy slime = new Enemy("スライムもどき", 1000, 100);
        for (int i=0; i<3; i++){
            int beforeAttackEnemyHP = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(wantWithWeponAttack,beforeAttackEnemyHP - slime.getHitPoint() ); 
        }
    }
}
