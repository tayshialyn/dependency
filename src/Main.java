import service.AnotherService;
import service.Service;
import service.SoManyService;

public class Main {
    public static void main(String[] args) {
        Service service = new Service("Custom Message from Service.");   // Inject the service to be used by the client
        Client client = new Client(service);

        AnotherService anotherService = new AnotherService("Custom message from Service.");
        Client clientB = new Client(anotherService);

        SoManyService soManyService = new SoManyService();
        Client clientC = new Client(soManyService);

        client.doSomething();   // Prints "Service Info."
        clientB.doSomething();
        clientC.doSomething();

        // Client is dependent on Service.
    }
}