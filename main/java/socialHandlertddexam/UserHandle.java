package socialHandlertddexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserHandle {
    private String handleName;
    private static final List<String> userNames = new ArrayList<>();

    public UserHandle(String handleName) {
        this.handleName = handleName;
    }

    public String getHandleName() {
        return handleName;
    }

    public static List<String> getUserNames() {
        return userNames;
    }

    public String createSocialHandle() {
        String uniqueHandleName = "@";

        try {
            if (this.handleName.isBlank()) {
                throw new RuntimeException();
            } else {
                String handleNameSub = handleName.substring(0, 9).toLowerCase();
                uniqueHandleName += handleNameSub;
                userNames.add(uniqueHandleName);
                handleName = uniqueHandleName;
                System.out.println(uniqueHandleName + " Was created!! ");
            }

        } catch (RuntimeException e) {
            System.out.println("User handle is blank please try again");
        }
        return uniqueHandleName;
    }

    public void deleteUserHandle() {
        for (String u : userNames) {
            if (u.equals(handleName)) {
                userNames.remove(u);
                System.out.println(u + " Was successfully removed");
            }
        }
    }

    public void updateUserHandle(String updatedUserHandle) {
        for (String u : userNames) {
            if (u.equals(handleName)) {
                try {
                    if (updatedUserHandle.isBlank()) {
                        throw new NullPointerException();
                    } else {
                        String uniqueHandleName = "@";
                        String updatedName = updatedUserHandle.substring(0, 9).toLowerCase();
                        uniqueHandleName += updatedName;
                        userNames.remove(handleName);
                        userNames.add(uniqueHandleName);
                        handleName = uniqueHandleName;
                        System.out.println("Updated user handle to: " + uniqueHandleName + " !!!");
                    }
                } catch (NullPointerException e) {
                    System.out.println("Please enter a valid user handle.");
                }

            } else {
                System.out.println("User not found! Tyr again.");
            }
        }
    }


//    public static String createHandle(){
//        Scanner scanUserName = null;
//        try {
//            String uniqueHandelName = "@";
//            scanUserName = new Scanner(System.in);
//            System.out.println("Enter your unique userHandle");
//           String handelName = scanUserName.nextLine().toLowerCase();
//            if(handelName.isBlank()){
//                throw new RuntimeException();
//            }else
//                uniqueHandelName += handelName.substring(0,9);
//
//            userNames.add(uniqueHandelName);
//            System.out.println(uniqueHandelName);
//
//
//        } catch (RuntimeException e) {
//            System.out.println("User handle is blank please try again");
//            createHandle();
//
//        }
//
//
//
//        return null;
//    }


}


