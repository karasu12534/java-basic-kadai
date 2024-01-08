package kadai_017;
//加藤家

abstract public class Kato_Chapter17 {
	
	
	//フィールド
		public String familyName = "加藤";//姓
		public String givenName = "";//名前
		public String address = "東京都中野区〇×";//住所
		
		//共通の紹介
        public void commonintroduce() {
        	System.out.println(familyName);	
        	System.out.println(address);
			
		}
		
		//個別の紹介
		abstract public void eachintroduce();
		
		
		
		//紹介の出力
		public void execintroduce() {
			System.out.println("名前は" + this.familyName + this.givenName + "です" );
			System.out.println("住所は" + this.address + "です");
			eachintroduce();
			
		}

}
