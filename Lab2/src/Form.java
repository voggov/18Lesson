public abstract class Form {
    public int width;
    public int height;

    public Form(Form target) {
        this.width = target.width;
        this.height = target.height;
    }

    public Form(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public abstract void printInfo();
    public abstract Form clone();

}
