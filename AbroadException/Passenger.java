public class Passenger{
    private int mortar;
    private boolean political_restriction;
    private boolean visa_status;

    class politicalException extends Exception{

        @Override
        public void printStackTrace() {
            System.out.println("You have political restriction");
        }
        
    }

    class visaException extends Exception{

        @Override
        public void printStackTrace() {
            System.out.println("You don't have visa");
        }
        
    }

    class abroadMortarException extends Exception{

        @Override
        public void printStackTrace() {
            System.out.println("Insifficuent Fund");
        }
        
    }

    
    
    public Passenger(int mortar,boolean political_restriction, boolean visa_status){
        this.mortar = mortar;
        this.political_restriction = political_restriction;
        this.visa_status = visa_status;
    }

    
    public void abroadMortar() throws Exception {
        
        if(this.mortar < 15){
            throw new abroadMortarException();
        }
        else{
            System.out.println("Operation completed succesfully");
            
        }
        

    }
    
    public void politicalRestriction() throws Exception{
        if(this.political_restriction == true){
            throw new politicalException();
        }
        else{
            System.out.println("Operation completed succesfully");
            
        }
        
    }
   
    public void visaStatus() throws Exception {
        if(this.visa_status){
            System.out.println("Operation completed succesfully");
        }
        else{
            throw new visaException();
        }
        
    }

    
}
