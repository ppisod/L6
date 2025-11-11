public class Cube {

    private int _sideLength;

    public Cube (int sideLength) {
        if (sideLength <= 0) throw new IllegalArgumentException("side length must be above 0");
        _sideLength = sideLength;
    }

    public Cube () {
        _sideLength = 1;
    }

    public int getSide () {return _sideLength;}

    public void setSide (int v) {
        if (v <= 0) {
            throw new IllegalArgumentException("side length must be above 0");
        }
        _sideLength = v;
    }

    public int calculateVolume () {
        return _sideLength * _sideLength * _sideLength;
    }

    public int calculateSurfaceArea () {
        return (_sideLength * _sideLength) * 6;
    }


}
