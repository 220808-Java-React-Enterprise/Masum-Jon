import com.revature.P1.models.Users.ERS_Users;
import  com.revature.P1.daos.User_Daos;

import static java.lang.Boolean.TRUE;

public class main {
    public static void main(String[] args) {
        ERS_Users user = new ERS_Users("0","Masum123!","Man@gmail.com","blubber","chicken","Frog",TRUE,"1a");
        User_Daos newuser= new User_Daos();
        newuser.save(user);



            }
        }






