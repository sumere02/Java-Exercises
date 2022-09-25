public class Card {
    private char letter;
    private boolean flag = false;
    public Card(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }
    public void setLetter(char letter) {
        this.letter = letter;
    }
    public boolean getFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    
}
