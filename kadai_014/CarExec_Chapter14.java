package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//インスタンス化
		Car_Chapter14 gear = new Car_Chapter14(1,3);
		Car_Chapter14 speed = new Car_Chapter14(3,30);
		
		//afterGearの値・表示
		gear.gearChange(3);
		
		//runの表示
		speed.run();
		
	}

}
