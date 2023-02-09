package animal;

import animal.Thinkable;

public class Human extends Animal implements Thinkable{
    //フィールド
    private String hobby;//趣味
    
    //コンストラクタ
    public Human() {
    }
    
    //引数ありコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }
    
}
