import java.util.ArrayList;
public class Main {
    public static void main(String [] args)
    {
        WordChecker w = new WordChecker(null);
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);

        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());

        WordChecker y = new WordChecker(null);
        ArrayList<String> wordstwo = new ArrayList<String>();
        wordstwo.add("to");
        wordstwo.add("too");
        wordstwo.add("stool");
        wordstwo.add("tools");
        System.out.println(wordstwo);
        
        System.out.println(y.isWordChain());
    }
}