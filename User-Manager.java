package atm;
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class UserManager {
    private HashMap<String, String> userCredentials; // Store username and password pairs

    public UserManager() {
        userCredentials = new HashMap<>();
    }

    // Register a new user
    public void registerUser(String username, String password) {
        userCredentials.put(username, password);
    }

    // Authenticate a user
    public boolean authenticateUser(String username, String password) {
        String storedPassword = userCredentials.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.registerUser("user1", "password1");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username:  ");
        String username = sc.next();
        System.out.println("Enter password:  ");
        String password = sc.next();
        System.out.println("Confirm password:  ");
        String confirmpassword = sc.next();
        if(confirmpassword.equals(password)){
            System.out.println("Password set successfully..!");
        }
        else{
            System.out.println("Try again");
        }
        if (userManager.authenticateUser(username, password)) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
        }
    }
}

