public class Square extends Form{
    public final String nameForm = "Квадрат";

    public Square(Square target) {
        super(target);
    }

    public Square(Form target) {
        super(target);
        if (target.height != target.width) {
            this.height = target.width;
        }
    }

    public Square(int w, int h) {
        super(w,h);
    }

    public void printInfo(){
        System.out.println(this.nameForm + "\nВысота:" + this.height + "\nШирина:" + this.width);
    }

    @Override
    public Form clone() {
        return new Square(this);
    }
}
