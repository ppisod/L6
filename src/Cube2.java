public class Cube2 {
    private final Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        this();
        basicCube.setSide(side); this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide (int Side) {
        basicCube.setSide(Side);
    }

    public int calculateVolume() {
        return basicCube.calculateVolume();
    }

    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }

    public Cube2 add(Cube2 otherCube) {
        // Check if side lengths form a Pythagorean triple.
        // This requires that C be a positive integer.
        // A^2 + B^2 = C^2
        // C = sqrt(A^2+B^2)

        int A = basicCube.calculateSurfaceArea();
        int B = otherCube.calculateSurfaceArea();
        int C = A + B;
        double sideLength = Math.sqrt(C / 6d);
        int sideLengthI = (int) sideLength;

        final double epsilon = 0.001d;
        if (Math.abs(sideLength - sideLengthI) > epsilon) throw new IllegalArgumentException("Cubes do not form an pythagorean triple");
        return new Cube2(sideLengthI, color);
    }

    public Cube2 minus(Cube2 otherCube) {
        // Surface area
        int surf = this.calculateSurfaceArea();
        int otherSurf = otherCube.calculateSurfaceArea();
        if (surf - otherSurf <= 0) throw new IllegalArgumentException("Cube surface area - Other cube surface area is less or equal to zero");
        int goalSurf = surf - otherSurf;
        // surface area = a^2 * 6
        // sqrt ( surface area / 6 ) = a
        double sideLength = Math.sqrt(goalSurf / 6d);
        int sideLengthI = (int) sideLength;

        // again, do epsilon comparison
        final double epsilon = 0.001d;
        if (Math.abs(sideLength - (double) sideLengthI) > epsilon) throw new IllegalArgumentException("Cubes do not form an pythagorean triple");
        return new Cube2(sideLengthI, color);
    }

    public boolean equals(Cube2 otherCube) {
        return (otherCube.basicCube.getSide() == basicCube.getSide() && otherCube.color.equals(this.color));
    }

    public String toString() {
        return "Cube{side=" + getSide() + ", color=\"" + color + "\"}";
    }
}
