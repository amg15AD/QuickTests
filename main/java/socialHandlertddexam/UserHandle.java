package socialHandlertddexam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
        for (int i = 0 ; i < userNames.size(); i++ ) {
            if (userNames.get(i).equals(handleName)) {
                userNames.remove(i);
                System.out.println("User handle was successfully removed");
            }
        }
    }

    public void updateUserHandle(String updatedUserHandle) {
        if(!userNames.isEmpty()){
            for (int i = 0 ; i < userNames.size(); i++ ) {
                if (userNames.get(i).equals(handleName)) {
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

                }
            }
        }

    }
    public void addHandleToFile(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("/Users/alexamg/IdeaProjects/QuickTest/src/main/resources/UserHandsleFile");
            for(int i = 0; i < userNames.size(); i ++){
                fileWriter.write(" "+userNames.get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Resource was not closed");
            }
        }
    }

    public void readHandlesFile(){
        File file = new File("/Users/alexamg/IdeaProjects/QuickTest/src/main/resources/UserHandsleFile");
        try(Scanner scanFile = new Scanner(file)){
            while (scanFile.hasNext()){
                System.out.println(scanFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    }

//    Create a method to add @@socialmediahandles to a file without duplicate handles
//    Create  a method to print all the contents of a file (@socialmediahandles) to the console one after the other


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





