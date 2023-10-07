package StructuralPatterns._08_Composite.Before;


public class Client {
    public static void main(String[] args) {
        Item droanBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(droanBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printItem(droanBlade);
        client.printPrice(bag);
    }

    private void printItem(Item item) {
        System.out.println(item.getPrice());
    }

    /* 클라이언트는 그룹이나, 개별 객체나 동일한 컴포넌트로 인식할 수 있어야 함 */
    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }
}
