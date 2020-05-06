
package recruitement;


import java.util.ArrayList;

public class Recruitement {


    public static void main(String[] args) {

        DBConnection DB = new DBConnection();



        ArrayList<User> Users = DB.getAllUsers();
        System.out.println("Found " + Users.size() + " Users!");
        for (int i = 0; i < Users.size(); i++) {
            System.out.println("Name: " + Users.get(i).getName() + "\nEmail: " + Users.get(i).getAddress()+"\nGender: " + Users.get(i).getGender());
        }

    }
}