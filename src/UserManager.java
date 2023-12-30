import java.util.HashMap;

public class UserManager {
    static HashMap<String, User> users = new HashMap<>();

    public static void createUser(String id){
        if(!users.containsKey(id)){
            users.put(id, new User(id));
            System.out.println("User " + id +" is added successfully");

        }
        else{
            System.out.println("The user id " + id + " is already used.");
        }
    }

    public static void deleteUser(String id){
        if(users.containsKey(id)){
            users.remove(id);
            System.out.println("User " + id +" is deleted successfully");
        }
        else{
            System.out.println("There is not such a user with the id " + id);
        }
    }

    public static User getuser(String id) {
        if(users.containsKey(id)){
            return users.get(id);
        }
        else {
            System.out.println("There is not such a user with the id " + id);
            return null;
        }
    }
}
