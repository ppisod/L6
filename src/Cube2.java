public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public int getSide() {
        return basicCube.getSide();
    }

    //the following methods have been started for you, but need to be completed
    public int calculateVolume() { return 0;}
    public int calculateSurfaceArea() { return 0;}
    public Cube2 add(Cube2 otherCube) { return new Cube2(); }
    public Cube2 minus(Cube2 otherCube) { return new Cube2(); }

    public String toString() {
        return basicCube.toString();
    }
}
