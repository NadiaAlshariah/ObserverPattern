import java.util.HashMap;
import java.util.List;

public class GroupManager {
    static HashMap<String, GroupChat> groupChats = new HashMap<>();

    public static void createGroupChat(String id){
        if(!groupChats.containsKey(id)){
            groupChats.put(id, new GroupChat(id));
            System.out.println("group " + id +" is created successfully");
        }
        else{
            System.out.println("The group id " + id + " is already used.");
        }
    }

    public static void deleteGroupChat(String id){
        if(groupChats.containsKey(id)){
            groupChats.remove(id);
            System.out.println("group " + id +" is deleted successfully");
        }
        else{
            System.out.println("There is not such a group with the id " + id);
        }
    }

    public static GroupChat getGroupChat(String id) {
        if(groupChats.containsKey(id)){
            return groupChats.get(id);
        }
        else{
            System.out.println("There is not such a group with the id " + id);
            return null;
        }
    }
}
