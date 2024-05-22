package socialHandlertddexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserHandle {

    private  List<String> userNames = new ArrayList<>();


    public String createHandle(){
        Scanner scanUserName = null;
        try {
            String uniqueHandelName = "@";
            scanUserName = new Scanner(System.in);
            System.out.println("Enter your unique userHandle");
           String handelName = scanUserName.nextLine().toLowerCase();
            if(handelName.isBlank()){
                throw new RuntimeException();
            }else
                uniqueHandelName += handelName.substring(0,9);

            userNames.add(uniqueHandelName);
            System.out.println(uniqueHandelName);


        } catch (RuntimeException e) {
            System.out.println("User handle is blank please try again");
            createHandle();

        }



        return null;
    }

    public void main(String[] args) {
        createHandle();

    }



}


