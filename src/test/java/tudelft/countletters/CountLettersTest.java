package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleSMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void oneWordWithR() {
        int words = new CountLetters().count("car");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleRMatchingWords() {
        int words = new CountLetters().count("car|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void noWords() {
        int words = new CountLetters().count("sun!noon");
        Assertions.assertEquals(0, words);
    }





}