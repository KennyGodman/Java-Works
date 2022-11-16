////package chapter14;
//
//import Chapter7.Poll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class WordCombinatorTest {
//    private WordCombinator wordCombinator;
//    @BeforeEach
//    void setUp() {
//        wordCombinator = new WordCombinator();
//    }
//    @Test
//    void generateThreeLetterCharacterCombinationTest(){
//        String word = "bathe";
//        var  combinations = WordCombinator.generateThreeCharacterCombinations(word);
//        for (String wrd : combinations){
//            assertEquals(3, wrd.length());
//            assertTrue(wrd.matches("\\w"));
//        }
//    }
// //private static boolean isCombinationWithEveryletterOfWord()
//
//}
