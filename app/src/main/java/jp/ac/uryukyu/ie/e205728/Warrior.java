package jp.ac.uryukyu.ie.e205728;

public class Warrior extends Hero{
    /**
     * 名前、HP、攻撃力を指定するコンストラクタ。
     * @param name Warriorの名前
     * @param maximumHP Warriorの体力
     * @param attack Warriorの攻撃力
     */
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    /**
     * attack値の1.5倍固定で攻撃するメソッド
     */
    public void attackWithWeponSkill(LivingThing opponent){
        if (getHitPoint() > 0){
            int damage = (int) (getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage); 
            opponent.wounded(damage);
        }
    }
}
