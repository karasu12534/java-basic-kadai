package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	public void DictionaryArray(String[] word) {
		//HashMapの宣言
		HashMap<String,String> engDic = new HashMap<String,String>();
		String result = "";
		//engDicの中身
		engDic.put("apple", "りんご");
		engDic.put("peach", "桃");
		engDic.put("banana", "バナナ");
		engDic.put("lemon", "レモン");
		engDic.put("pear", "梨");
		engDic.put("kiwi", "キウィ");
		engDic.put("strawberry", "いちご");
		engDic.put("grape", "ぶどう");
		engDic.put("muscat", "マスカット");
		engDic.put("cherry", "さくらんぼ");
		
		
		//見つける繰り返し
		
		for(int i = 0; i < word.length; i++) {
			result = engDic.get(word[i]);
			
			
			if(result == null) {
				result = word[i] + "は辞書に存在しません";
			}else {
				result = word[i] + "の意味は" + result;
			}
			System.out.println(result);
		}
		


	}
}



