package HW_6.HW_6_1;


//https://www.codewars.com/kata/building-blocks/train/java
public class Block {
    int Width;
    int Length;
    int Height;
    int Volume;
    int SurfaceArea;

    public Block(int[] params) {
        Width = params[0] ;
        Length = params[1];
        Height = params[2] ;
    }

    public int getWidth() {
        return Width;
    }

    public int getLength() {
        return Length;
    }

    public int getHeight() {
        return Height;
    }

    public int getVolume() {
        Volume = Width * Length * Height;
        return Volume;
    }

    public int getSurfaceArea() {
        SurfaceArea = 2*(Width*Length + Length*Height + Width*Height);
        return SurfaceArea;
    }

    public static void main(String[] args) {
        Block block = new Block(new int[]{2,4,6});
        System.out.println(block.getVolume());
        System.out.println(block.getSurfaceArea());
    }
}
