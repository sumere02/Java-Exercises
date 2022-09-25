public class BeybladeFactory {
    public Beyblade CreateBeyblade(String beyblade_type){
        if(beyblade_type.equals("Dragon")){
            return new Dragon("Takao",800,300,"Blue Dragon","Pep Talk");
        }
        else if(beyblade_type.equals("Dransa")){
            return new Dransa("Kai",600,400,"Red Phoneix");
        }
        else if(beyblade_type.equals("Drayga")){
            return new Drayga("Rei",800,250,"White Tiger");
        }
        else if(beyblade_type.equals("Draciel")){
            return new Draciel("Max",400,1000,"Dark Turtle");
        }
        else{
            return null;
        }

    }
}
