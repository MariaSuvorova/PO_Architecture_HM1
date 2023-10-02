package ModelElements;

public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public java.awt.Color Color;
    public float Power;

    public Flash(Point3D location, Angle3D angle, java.awt.Color color, float power) {
        Location = location;
        Angle = angle;
        Color = color;
        Power = power;
    }
    public void Rotate(Angle3D Angle){}
    public void Move(Point3D Location){}

}
