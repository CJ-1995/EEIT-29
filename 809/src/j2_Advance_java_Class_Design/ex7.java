package j2_Advance_java_Class_Design;

public class ex7 {

}
/*
Given the code format:

class DBConfiguration {
 
    String user;
    String password;
}

And,

public class DBHandler {
    DBConfiguration configureDB(String uname, String password) {
        // insert code here
    }
    public static void main(String[] args) {
        DBHandler r = new DBHandler();
        DBConfiguration dbConf = r.configureDB("manager", "manager");
    }
}

Which code fragment must be inserted at line 6 to enable the code to compile?

A.
DBConfiguration f;
return f;

B.
return DBConfiguration;

C.
return new DBConfiguration();

D.
retutn 0;

*/