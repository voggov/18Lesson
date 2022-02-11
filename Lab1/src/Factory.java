import java.util.Scanner;

public class Factory {
    public Coffe create(){
        Scanner scanner = new Scanner(System.in);
        for (var i : TypeCoffe.values()){
            System.out.print(i.ordinal() + 1 + ")");
            System.out.println(i.getName());
        }
        String name = scanner.nextLine();
        MyCoffe myCoffe = new MyCoffe();
        return myCoffe.give(name);
    }

}
