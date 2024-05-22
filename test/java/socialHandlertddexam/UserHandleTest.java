package socialHandlertddexam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserHandleTest {
    private UserHandle userHandle;
    private List<String> usernames;
    @BeforeEach
    void setUp(){
        userHandle = new UserHandle();
        usernames = new ArrayList<>();
    }


    @Test
    @DisplayName("To check if a social media handle was created successfully")
    void checkHandleTest() {
        userHandle.createHandle();
        Assertions.assertFalse(usernames.isEmpty());
    }


    @Test
    @DisplayName("To check if handle was created with 9 characters or less")
    void checkHandleLessThan9CharactersTest() {
         }


    @Test // This is an example of how to test an exemption
    @DisplayName("To check if social media handle input is null")
    void checkIfNullTest() {
        //UserHandle userHandle = new UserHandle();
       // assertThrows(NullPointerException.class, ()-> userHandle.checkHandle(null));
    }


    @Test
    @DisplayName("To check if social media handle is empty or blank")
    void checkEmptyOrBlankCharactersTest(){

    }

}