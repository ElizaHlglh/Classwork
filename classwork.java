import java.util.List;
import java.util.ArrayList;
public class classwork{
  public static List<String> makeAllWords(int k, int maxLetter){ //classwork 2/4/19
    List<String> ans = new ArrayList<String>();
    makeWordsHelp(k, "", ans, maxLetter);
    return ans;
  }

  public static void makeWordsHelp(int k, String word, List<String> ans, int max){
    if (k == 0){
      ans.add(word);
    }
    else{
      for (int i = 'a' + 0; i < 'a' + max; i++){
        makeWordsHelp(k-1, word + (char) i, ans, max);
      }
    }
  }

}
