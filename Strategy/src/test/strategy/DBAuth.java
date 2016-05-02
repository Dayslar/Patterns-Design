package test.strategy;

public class DBAuth implements AuthStrategy {

    private Object dbRef;
    private String dbUrl;

    public DBAuth(Object dbRef) {
        this.dbRef = dbRef;
    }

    private void createConnection(String dbUrl){
        System.out.println(dbUrl);
    }

    @Override
    public boolean checkLogin(String name, String password) {

        System.out.println("Checking with DB.....");

        String userHash = getHash(name);
        String passHash = getHash(password);

        return checkUser(userHash, passHash);
    }

    private boolean checkUser(String userHash, String passHash) {
        return true;
    }

    private String getHash(String name) {
        return String.valueOf(31 * name.hashCode());
    }
}
