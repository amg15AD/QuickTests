package socialHandlertddexam;

public class Main {
    public static void main(String[] args) {
        UserHandle myHandle = new UserHandle("SpiderManzz");
        UserHandle marioHandle = new UserHandle("BestBro_21230");
        myHandle.createSocialHandle();
        marioHandle.createSocialHandle();
        myHandle.updateUserHandle("CoolWeb420");
        String myNewHandle = myHandle.getHandleName();
        System.out.println(myNewHandle);
    }
}
