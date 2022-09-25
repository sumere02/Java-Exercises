import java.io.Serializable;
public class Card implements Serializable {
    private Character letter;
    private Boolean flag = false;
    public Card(Character letter) {
        this.letter = letter;
    }
    public Character getLetter() {
        return letter;
    }
    public void setLetter(Character letter) {
        this.letter = letter;
    }
    public Boolean getFlag() {
        return flag;
    }
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
    
}
