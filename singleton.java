class DatabaseConnection {


    private static DatabaseConnection data;

    private DatabaseConnection()
    {
        // here we are creating private constructor to prevent instantiation
    }

    public static  DatabaseConnection getInstance() //here we are creating a static method to create instance
    {
        if (data == null) {
            data = new DatabaseConnection();         //it checks if the data object is null. If it's null, it creates a new instance of DatabaseConnection.
        }                                       //If an instance already exists, it returns the existing one

        return data;
    }

    public void display() {

        System.out.println("Connected to database.");
    }
}

// Usage
public class singleton {
    public static void main(String[] args) {
        DatabaseConnection data1 = DatabaseConnection.getInstance();
        DatabaseConnection data2 = DatabaseConnection.getInstance();
        DatabaseConnection data3= DatabaseConnection.getInstance();
        DatabaseConnection data4= DatabaseConnection.getInstance();
        data1.display();
        data2.display();
        data3.display();
        data4.display();
    }
}
