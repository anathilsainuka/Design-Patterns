// Target interface
interface Device {
    void charge();
}

// Adapter (the existing class)
class USASocket {
    public void plugIn() {
        System.out.println("Plugged into USA socket");
    }
}

// Adapter

/*The adapter's charge() method calls the plugIn() method of USASocket,
/thus adapting its interface to match the Device interface*/
class USASocketAdapter implements Device {
    private final USASocket usaSocket;

    public USASocketAdapter(USASocket usaSocket) {
        this.usaSocket = usaSocket;
    }

    @Override
    public void charge() {
        usaSocket.plugIn();
    }
}

// Client
public class adapter {
    public static void main(String[] args) {
       // This line creates a new instance of the USASocket class and assigns it to the variable usaSocket.
        USASocket usaSocket = new USASocket();
        // Creating an instance of Adapter and passing USASocket to its constructor
        Device device = new USASocketAdapter(usaSocket);

        // This line calls the charge method on the device instance.
        device.charge();
    }
}
