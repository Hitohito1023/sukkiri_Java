
public class Hero {
	String name = "ミナト";
	int hp = 100;
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した!!");
	}
//	Sword sword;
//	public void attack() {
//		System.out.println(this.name + "は" + this.sword.name + "で攻撃した");
//		System.out.println("敵に5ポイントのダメージを与えた");
//	}
//	public void sleep() {
//		this.hp = 100;
//		System.out.println(this.name + "は、眠って回復した！");
//	}
//	public void sit(int sec) {
//		this.hp += sec;
//		System.out.println(this.name + "は、" + sec + "秒座った！");
//		System.out.println("HPが" + sec + "ポイント回復した。");
//	}
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
//	public void run() {
//		System.out.println(this.name + "は、逃げ出した！");
//		System.out.println("GAMEOVER");
//		System.out.println("最終HPは" + this.hp + "でした。");
//	}
//	
//	public Hero(String name) {
//		this.name = name;
//		this.hp = 100;
//	}
//	
//	public Hero() {
//		this("ダミー");
//	}

}
