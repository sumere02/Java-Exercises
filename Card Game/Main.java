import java.util.Scanner;
import java.util.Random;

public class Main{
    static Scanner scanner = new Scanner(System.in);

    public static Card[][] createCards(){
        int count[] = new int[8];
        Random rand = new Random();
        int randnum;
        for(int i = 0;i<8;i++){
            count[i] = 0;
        }
        Card[][] cards = new Card[4][4];
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                randnum = rand.nextInt(8);
                while(count[randnum] >= 2){
                    randnum = rand.nextInt(8);
                }
                count[randnum]++;

                cards[i][j] = new Card((char)((int)'A' + randnum));
            }
        }
        return cards;
    }

    public static void main(String[] args) {
        String settings = "Card Guess Game\n"
                        + "***************\n"
                        + "1.Play Game\n"
                        + "Q:Exit\n"
                        + "***************";
        Card[][] cards = createCards(); 
        Game game = new Game(cards);
        System.out.println(settings);
        char op;
        while(true){
            System.out.print("Operation: ");
            op = scanner.nextLine().charAt(0);
            switch(op){
                case '1':
                    System.out.println(settings);
                    game.play();
                    break;
                case 'Q':
                    game.exit();
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }
    }
}
