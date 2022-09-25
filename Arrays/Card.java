public class Card {
    private char letter;
    private Boolean flag = false;
    public Card(char letter) {
        this.letter = letter;
    }
    public char getLetter() {
        return letter;
    }
    public void setLetter(char letter) {
        this.letter = letter;
    }
    public Boolean getFlag() {
        return flag;
    }
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }    
}
