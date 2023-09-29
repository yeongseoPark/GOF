package FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "keesum@email.com");
        client.print(new BlackShipFactory(), "blackship", "keesum@email.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
