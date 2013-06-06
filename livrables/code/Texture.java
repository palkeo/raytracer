import java.awt.Color;

public class Texture {
    public double transparency = 1.0;
    public double[] absorbance = {1.0, 1.0, 1.0};
    public double[] reflectance = {0.0, 0.0, 0.0};
    public double[] refractance = {0.0, 0.0, 0.0};
    public double[] refractiveIndex = {1.0, 1.0, 1.0};
    public java.awt.Color color;

    public Texture() {}
    public Texture(Texture other) {
        transparency = other.transparency;
        System.arraycopy(other.absorbance, 0, absorbance, 0, absorbance.length );
        System.arraycopy(other.reflectance, 0, reflectance, 0, reflectance.length );
        System.arraycopy(other.refractance, 0, refractance, 0, refractance.length );
        System.arraycopy(other.refractiveIndex, 0, refractiveIndex, 0, refractiveIndex.length );
        color = other.color;
    }
}
