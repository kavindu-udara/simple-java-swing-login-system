import java.util.HashMap;

public class IDandPassword {
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPassword(){
        loginInfo.put("user1", "Kavindu");
        loginInfo.put("user2", "pwd2003");
        loginInfo.put("user3", "147abspwd123");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
