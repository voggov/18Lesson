public class Main {
    public static void main(String[] args) {
        Publishing publishing = new Publishing();
        publishing.addInfo("выалщла");
        publishing.addInfo("sdasdasdweq");
        Subscriber subscriber1 = new Subscriber("Ilya");
        Subscriber subscriber2 = new Subscriber("NotIlya");
        Subscriber subscriber3 = new Subscriber("dfsdf");
        publishing.addObserver(subscriber1);
        publishing.addObserver(subscriber2);
        publishing.addObserver(subscriber3);
        publishing.addInfo("Salam vsem");

    }
}
