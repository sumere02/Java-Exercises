import java.util.Scanner;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card[][] card = new Card[4][4];
        int check_array[][] = new int[4][4];
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                check_array[i][j] = 0;
            }
        }
        int a = 0;
        int flag_random = 0;
        while(true){
            Double value_1_double = Math.random() * 3;
            int value_1 = (int)Math.round(value_1_double);
            Double value_2_double = (Math.random() * 3);
            int value_2 = (int)Math.round(value_2_double);
            if(check_array[value_1][value_2] == 0){
                card[value_1][value_2] = new Card((char)(a + 65));
                a +=1;
                if(a == 8){
                    a = 0;
                    flag_random +=1;
                }
                if(flag_random == 2){
                    break;
                }
                check_array[value_1][value_2] = 1;
            }

        }
        /* 
        card[0][0] = new Card('E');
        card[0][1] = new Card('A');
        card[0][2] = new Card('B');
        card[0][3] = new Card('F');
        card[1][0] = new Card('G');
        card[1][1] = new Card('A');
        card[1][2] = new Card('D');
        card[1][3] = new Card('H');
        card[2][0] = new Card('F');
        card[2][1] = new Card('C');
        card[2][2] = new Card('D');
        card[2][3] = new Card('H');
        card[3][0] = new Card('E');
        card[3][1] = new Card('G');
        card[3][2] = new Card('B');
        card[3][3] = new Card('C');
        */

        System.out.println("Welcome To Memory Card Game");
        System.out.println("***************************\n");
        int count = 0;
        while(count < 8){
            for(int i = 0;i<4;i++){
                for(int j = 0;j<4;j++){
                    if(card[i][j].getFlag()){
                        System.out.print(" " + card[i][j].getLetter() + " ");
                    }
                    else{
                        System.out.print(" X ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.print("Choose Card 1 (4,4): ");
            int index_card_1_row = scanner.nextInt();
            int index_card_1_col = scanner.nextInt();
            System.out.print("Choose Card 2 (4,4): ");
            int index_card_2_row = scanner.nextInt();
            int index_card_2_col = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            index_card_1_row -= 1;
            index_card_1_col -= 1;
            index_card_2_row -= 1;
            index_card_2_col -= 1;
            if(card[index_card_1_row][index_card_1_col].getLetter() == card[index_card_2_row][index_card_2_col].getLetter()){
                card[index_card_1_row][index_card_1_col].setFlag(true);
                card[index_card_2_row][index_card_2_col].setFlag(true);
                count +=1;
            }
            else{
                System.out.println("Card 1: " + card[index_card_1_row][index_card_1_col].getLetter());
                System.out.println("Card 2: " + card[index_card_2_row][index_card_2_col].getLetter());
            }
        }
        scanner.close();
    }
}
