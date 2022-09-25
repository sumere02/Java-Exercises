import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;


public class Background {
    public static void saveGame(Card[][] card){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("save.bin"))) {
            out.writeObject(card);
        } catch (IOException e) {
            System.out.println("Error when saving the game");
        }
    }
    public static Card[][] loadGame(){
        Card[][] card = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("save.bin"))) {
            card = (Card[][])in.readObject();
            return card;
        }catch (ClassNotFoundException e) {
            System.out.println("Error when loading the game");
        }
         catch (IOException e) {
            System.out.println("Error when loading the game");
        }
        return null;
    }
}
