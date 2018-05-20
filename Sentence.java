package AP01;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private String sentence;
    public List<Integer> getBlankPositions()
    {
        List<Integer> posList = new ArrayList<Integer>();
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.substring(i, i+1).equals(" "))
                posList.add(i);
        }
        return posList;
    }
    public int countWords()
    {
        return getBlankPositions().size() + 1;
    }
    public String[] getWords()
    {
        List<Integer> posList = getBlankPositions();
        int numWords = countWords();
        String [] wordArr = new String[numWords];
        for(int i =0; i < numWords; i++)
        {
            if(i==0)
            {
                if(posList.size() != 0)
                    wordArr[i] = sentence.substring(0, posList.get(0));
                else
                    wordArr[i] = sentence;
            }
            else if(i== posList.size())
                wordArr[i] = sentence.substring(posList.get(i-1));
            else
              wordArr[i] = sentence.substring(posList.get(i-1), posList.get(i));
        }

        return wordArr;
    }
    public Sentence(String s)
    {
        sentence = s;
    }

    public static void main(String [] args)
    {
        Sentence s1 = new Sentence("I love you!");
        List<Integer> s1bp = s1.getBlankPositions();
        System.out.println(s1bp);
        System.out.println("words : "+ s1.countWords());


        Sentence s2 = new Sentence("The cat sat on the mat");
        List<Integer> s2bp = s2.getBlankPositions();
        System.out.println(s2bp);
        System.out.println("words : "+ s2.countWords());

    }
}
