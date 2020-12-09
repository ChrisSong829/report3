package jp.ac.uryukyu.ie.e205728;

/**
 * LivingThingを継承したクラス
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 */
public class Enemy extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     *死亡時のメッセージを変更するためにオーバーライドしている。
     */
    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint()-damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
    /**
     * getterメソッドを用意し,private指定したNameにアクセス可能にする
     */
    public String getName(){
        return this.name;
    }
    /**
      *getterメソッドを用意し,private指定したhitpointにアクセス可能にする
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
    /**
     * getterメソッドを用意し,private指定したattackにアクセス可能にする
     */
    public int getAttack(){
        return this.attack;
    }
    /**
     * getterメソッドを用意し,private指定したdeadにアクセス可能にする
     */
     public boolean getDead(){
            return this.dead;
    }
    /**
     * フィールドname setterメソッドを用意する
     * @param name フィールドnameに代入する
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * フィールドhitPoint setterメソッドを用意する
     * @param hitPoint フィールドhitpointに代入する
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    /**
     * フィールドattack setterメソッドを用意する
     * @param attack フィールドattackに代入する
     */
    public void setAttack(int attack){
        this.attack = attack;
    }
    /**
     * フィールドdead setterメソッドを用意する
     * @param dead フィールドdeadに代入する
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }

}
