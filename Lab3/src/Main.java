public class Main {
    public static void main(String[] args) {
        Director director = new Director(new MyCupsProduct());
        Director director1 = new Director(new StozleProduct());
        Wineglass wineglass = director.buildWineglass();
        Wineglass wineglass1 = director1.buildWineglass();
        wineglass.printInfo();
        System.out.println("//////////////////////////////////");
        wineglass1.printInfo();

    }
}
