package org.example;

import static org.example.Market.orders;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human aleksandr = new Human();
        aleksandr.setName("Александр");
        Human evgeniy = new Human();
        evgeniy.setName("Евгений");
        Human nastya = new Human();
        nastya.setName("Настя");


        market.acceptToMarket(aleksandr);
        market.takeInQueue(aleksandr);
        market.update();
        market.releaseFromMarket(orders);

        market.acceptToMarket(evgeniy);
        market.acceptToMarket(nastya);

        market.takeInQueue(evgeniy);
        market.takeInQueue(nastya);

        market.update();
        market.releaseFromMarket(orders);
        market.update();
        market.releaseFromMarket(orders);

    }
}