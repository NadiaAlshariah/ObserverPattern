public class User implements IObserver{
    private GroupChat groupChat;
    private String message;
    private String username;

    public User(String username) {
        this.username = username;
    }

    public void addToGroup(GroupChat groupChat){
        this.groupChat = groupChat;
        groupChat.add(this);
        System.out.println(username + " has been added to group chat " + groupChat.getId());
    }

    public void update(String message){
        this.message = message;
        display();
    }

    private void display() {
        System.out.println(message);
    }

    public String getUsername() {
        return username;
    }
}
