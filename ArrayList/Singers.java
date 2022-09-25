import java.util.ArrayList;

public class Singers {
    private ArrayList<String> singer_list = new ArrayList<String>();

    public void print_singers(){
        System.out.println("There are " + singer_list.size() + " singers in list.");
        for (int i = 0;i<singer_list.size();i++){
            System.out.println("Singer " + i + " " + singer_list.get(i));
        }
    }

    public void addSinger(String name){
        singer_list.add(name);
        System.out.println("List updated");
    }

    public void updateSinger(String new_name,int position){
        singer_list.set(position,new_name);
        System.out.println("List updated");
    }

    public void deleteSinger(int position){
        String name = singer_list.get(position);
        singer_list.remove(position);
        System.out.println("Singer named " + name + " deleted from list");
    }

    public void searchSinger(String name){
        int position = singer_list.indexOf(name);
        if(position == -1){
            System.out.println("Singer does not exist in list");
        }
        else{
            System.out.println("Singer found");
            System.out.println("Singer with name " + name + " found in position " + position);
        }
    }

}
