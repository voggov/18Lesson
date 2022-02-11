public class Rectangle extends Form {
    public final String nameForm = "Прямоугольник";

    public void printInfo() {
        System.out.println(this.nameForm + "\nВысота:" + this.height + "\nШирина:" + this.width);
    }

    public Rectangle(Form target) {
        super(target);


    }

    public Rectangle(int width, int height) {
        super(width, height);
    }

    public Rectangle(Rectangle target) {
        super(target);
    }


    @Override
    public Form clone() {
        return new Square(this);
    }
}
