import java.util.Scanner;
public class Main{



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 4;
        System.out.println("Sumer Card Guess Game");
        System.out.println("*********************");
        System.out.println("1. Play");
        System.out.println("2. Settings");
        System.out.println("Q. Exit");
        System.out.println("*********************");
        while(true){
            System.out.print("Option: ");
            char op = scanner.nextLine().charAt(0);
            if(op == 'Q'){
                System.out.println("Shutting Down");
                break;
            }
            else if(op == '2'){
                while(true){
                    System.out.println("Choose Card Number");
                    System.out.println("******************");
                    System.out.println("1. Four Card");
                    System.out.println("2. Sixteen Card");
                    System.out.println("A: Apply");
                    System.out.println("******************");
                    System.out.print("Option: ");
                    char op_settings = scanner.nextLine().charAt(0);
                    if(op_settings == 'A'){
                        break;
                    }         
                    else if(op_settings == '1'){
                        size = 2;
                        System.out.println("Card changed to four");
                    }
                    else if(op_settings == '2'){
                        size = 4;
                        System.out.println("Card changed to sixteen");
                    }
                    else{
                        System.out.println("Invalid Option");
                    }         
                }
            }
            else if(op == '1'){
                Card[][] card = new Card[size][size];
                int[][] check_array = new int[size][size];
                for(int i=0;i<size;i++)
                {
                    for(int j = 0;j<size;j++){
                        check_array[i][j] = 0;
                    }
                }

                int a = 0;
                int flag_random = 0;
                while(true){
                    Double value_1_double = Math.random() * (size-1);
                    int value_1 = (int)Math.round(value_1_double);
                    Double value_2_double = (Math.random() * (size-1));
                    int value_2 = (int)Math.round(value_2_double);
                    if(check_array[value_1][value_2] == 0){
                        card[value_1][value_2] = new Card((char)(a + 65));
                        a +=1;
                        if(a == Math.pow(2,size)/2){
                            a = 0;
                            flag_random +=1;
                        }
                        if(flag_random == 2){
                            break;
                        }
                        check_array[value_1][value_2] = 1;
                    }
        
                }
                
                int count = 0;
                while(count < size){
                    System.out.println();
                    for(int i = 0;i<size;i++){
                        for(int j = 0;j<size;j++){
                            if(card[i][j].getFlag()){
                                System.out.print(" | " + card[i][j].getLetter() + " | ");
                            }
                            else{
                                System.out.print("| X |");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    System.out.print("Card 1 (row,col): ");
                    int row_1 = scanner.nextInt();
                    int col_1 = scanner.nextInt();
                    
                    card[row_1][col_1].setFlag(true);
                    for(int i = 0;i<size;i++){
                        for(int j = 0;j<size;j++){
                            if(card[i][j].getFlag()){
                                System.out.print("| " + card[i][j].getLetter() + " |");
                            }
                            else{
                                System.out.print("| X |");
                            }
                        }
                        System.out.println();
                    }
                    System.out.print("Card 2 (row,col): ");
                    int row_2 = scanner.nextInt();
                    int col_2 = scanner.nextInt();
                    scanner.nextLine();
                    if(card[row_1][col_1].getLetter() == card[row_2][col_2].getLetter()){
                        card[row_2][col_2].setFlag(true);
                        count += 1;
                    }
                    else{
                        card[row_1][col_1].setFlag(false);
                    }
                }
                
            }
            else{
                System.out.println("Invalid Operation");
            }
        
        }
        
        scanner.close();
    }

}