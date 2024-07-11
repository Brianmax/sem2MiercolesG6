package ejercicio4;

import java.util.ArrayList;

public class LibraryUser {
    private String username;
    private int userId;
    private ArrayList<LibraryItem> items;

    public LibraryUser(String username, int userId, ArrayList<LibraryItem> items)
    {
        this.username = username;
        this.userId = userId;
        this.items = items;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<LibraryItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<LibraryItem> items) {
        this.items = items;
    }
}
