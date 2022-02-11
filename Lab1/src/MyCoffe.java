import java.util.Scanner;

public class MyCoffe implements Coffe{
    private TypeCoffe typeCoffe;


    private void choice(String name) {

        for (var i : TypeCoffe.values()) {
            if (name.equals(i.getName())) {
                this.typeCoffe = i;
                break;
            }
        }
        if (this.typeCoffe == null) {
            System.out.println("Такого напитка у нас нет! Попробуйте выбрать что-то другое");
            Scanner scanner = new Scanner(System.in);
            choice(scanner.nextLine());
        }
    }

    private void mill(String name) {
        System.out.println("Начали молоть " + this.typeCoffe.getName());
    }

    private void cook(String name) {
        System.out.println("Готовим " + this.typeCoffe.getName());
    }

    private void pour(String name) {
        System.out.println("Наливаем " + this.typeCoffe.getName());
    }

    @Override
    public Coffe give(String name) {
        choice(name);
        mill(this.typeCoffe.getName());
        cook(this.typeCoffe.getName());
        pour(this.typeCoffe.getName());
        System.out.println("Ваше " + this.typeCoffe.getName() + " готово!)");
        return this;
    }
}
