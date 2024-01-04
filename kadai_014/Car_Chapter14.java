package kadai_014;

public class Car_Chapter14 {
	
	
		//スピード・ギアの初期値（フィールド）
		private int gear = 1;
		private int speed =10;
		
		//コンストラクタ
		public Car_Chapter14(int gear, int speed) {
			this.gear = gear;
			this.speed = speed;
		}
		//ギアチェンジの実装
		public void gearChange(int afterGear) {
			
			this.gear = gear;
			this.speed = speed;
			
			System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました" );
		
			
			 switch(gear) {
			case 1 ->  speed =10;
			case 2 ->   speed =20;
			case 3 ->   speed =30;
			case 4 ->  speed = 40;
			case 5 ->  speed = 50;
			default ->   speed = 10;
			
			
			}
			
			
			
					
			}
		//速度の表示
		public void run() {
			this.speed = speed;
			System.out.println("速度は時速" + speed + "kmです");			
			
		}
		

}
