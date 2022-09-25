public class Game {
    Card[][] cards = new Card[4][4];

    public Game(Card[][] cards) {
        this.cards = cards;
    }

    public void printTable(){
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(cards[i][j].isFlag()){
                    System.out.print(" | " + cards[i][j].getLetter() + " | ");
                }
                else{
                    System.out.print(" | X | ");
                }
            }
            System.out.println();
        }
    }
    
    public void play(){
        int c1r;
        int c1c;
        int c2r;
        int c2c;
        int count = 8;
        while(count > 0){
            System.out.println();
            printTable();
            System.out.println();
            System.out.println("Press -1 to Exit");
            System.out.println("Card 1");
            System.out.println("******");
            System.out.print("Row-Col: ");
            c1r = Main.scanner.nextInt();
            if(c1r == -1){
                exit();
            }
            c1c = Main.scanner.nextInt();
            if(c1c == -1){
                exit();
            }
            c1r--;
            c1c--;
            cards[c1r][c1c].setFlag(true);
            printTable();
            System.out.println("Card 2");
            System.out.println("******");
            System.out.print("Row-Col: ");
            c2r = Main.scanner.nextInt();
            if(c2r == -1){
                exit();
            }
            c2c = Main.scanner.nextInt();
            if(c2c == -1){
                exit();
            }
            c2r--;
            c2c--;
            if(cards[c1r][c1c].getLetter() == cards[c2r][c2c].getLetter()){
                cards[c2r][c2c].setFlag(true);
                count--;
            }
            else{
                cards[c1r][c1c].setFlag(false);
            }
        }
        if(count == 0){
            exit();
        }
    }

    public void exit(){
        System.out.println("Good Day");
        System.exit(0);
    }

}
