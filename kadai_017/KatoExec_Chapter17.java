package kadai_017;

 public class KatoExec_Chapter17 {
	 public static void main(String[] args) {
		//インスタンス
		 KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();//花子
		 KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();//一郎
		 KatoTaro_Chapter17   taro   = new KatoTaro_Chapter17();//太郎
		 
		 //名前の紹介
		 hanako.setGivenName();
		 taro.setGivenName();
		 ichiro.setGivenName();
		 
		 
		 
		 //各子クラスの個別紹介
		 hanako.execintroduce();
		 taro.execintroduce();
		 ichiro.execintroduce();
		 
	 
	 
		
	}

}
