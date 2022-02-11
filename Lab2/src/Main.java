public class Main {
    public static void main(String[] args) {
        Form form = new Rectangle(5,17);
        Form form1 =  new Square(form.clone());
        form.printInfo();
        form1.printInfo();
    }


}
