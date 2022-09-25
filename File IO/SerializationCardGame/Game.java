import java.util.Scanner;
import java.util.Random;

public class Game{
    private static Scanner scanner= new Scanner(System.in);
    private static int size = 2;

    private static Card[][] createCards(){
        int range = (int)Math.pow((double)2,(double)(size-1));
        Random ran = new Random();
        int[] randomCheck = new int[range];
        for(int i = 0;i<range;i++){
            randomCheck[i] = 0;
        }
        Card[][] cards = new Card[size][size];
        int num = ran.nextInt(range) + 65;;
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                num = ran.nextInt(range) + 65;
                while(randomCheck[num-65] == 2){
                    num = ran.nextInt(range) + 65;
                }
                randomCheck[num-65]++;
                cards[i][j] = new Card((char)num);        
            }    
        }
        return cards;
    }

    private static void printMainMenu(){
        System.out.println("***************");
        System.out.println("Card Guess Game");
        System.out.println("***************");
        System.out.println("1.New Game");
        System.out.println("2.Load Game");
        System.out.println("3.Options");
        System.out.println("4.Exit");
        System.out.println("***************");
    }

    private static void printOptionsMenu(){
        System.out.println("**************");
        System.out.println("1.Four Card");
        System.out.println("2.Sixteen Card");
        System.out.println("3.Apply");
        System.out.println("**************");
        
    }

    private static void printTable(Card[][] card){
        for(int i = 0;i<Game.size;i++){
            for(int j = 0;j<Game.size;j++){
                Character temp = card[i][j].getFlag() ? card[i][j].getLetter() : 'X';
                System.out.print(" | " + temp + " | ");
            }
            System.out.println();
        }
    }

    private static void playGame(Card[][] card){
        int count = 0;
        int c1_row = 0;
        int c1_col = 0;
        int c2_row = 0;
        int c2_col = 0;
        while(count < size*size){
            System.out.println("Press 0 0 at Card 1 for save");
            System.out.println();
            printTable(card);
            System.out.println();
            System.out.print("Card 1(row,col): ");
            c1_row = scanner.nextInt();
            c1_col = scanner.nextInt();
            if(c1_row == 0 && c1_col == 0){
                Background.saveGame(card);
                System.out.println("Saving...");
                break;
            }
            c1_row--;
            c1_col--;
            card[c1_row][c1_col].setFlag(true);
            System.out.println();
            printTable(card);
            System.out.println();
            System.out.print("Card 2(row,col): ");
            c2_row = scanner.nextInt();
            c2_col = scanner.nextInt();
            c2_row--;
            c2_col--;
            scanner.nextLine();
            System.out.println();
            if(card[c1_row][c1_col].getLetter() == card[c2_row][c2_col].getLetter()){
                card[c2_row][c2_col].setFlag(true);
                count += 2;    
            }
            else{
                card[c1_row][c1_col].setFlag(false);
            }
            
        }
        if(c1_row != 0){
            System.out.println("You Won");
        }
    }
    
    public static void main(String[] args) {
        while(true){
            printMainMenu();
            System.out.print("Operation: ");
            int opMainMenu = scanner.nextInt();
            scanner.nextLine();
            Card[][] card = null;
            switch(opMainMenu){
                case 4:
                    System.out.println("Goodbye");
                    return;
                case 1:
                    card = createCards();
                    System.out.println();
                    playGame(card);
                    break;
                case 2:
                    card = Background.loadGame();
                    System.out.println();
                    playGame(card);
                    break;
                case 3:
                    int opOptionsMenu = 0;
                    while(opOptionsMenu != 3){
                        printOptionsMenu();
                        System.out.print("Operation: ");
                        opOptionsMenu = scanner.nextInt();
                        scanner.nextLine();
                        switch (opOptionsMenu) {
                            case 1:
                                size = 2;
                                break;
                            case 2:
                                size = 4;
                                break;
                            case 3:
                                System.out.println("Options Saved");
                                break;
                            default:
                                System.out.println("Invalid Option");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
            
        }
    }
}