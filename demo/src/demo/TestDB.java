package demo;

public class TestDB {
    public static void main(String[] args) {	
	DatabaseConnection connection1 = DatabaseConnection.getInstance();
	connection1.query("Thomas");
    }
}
