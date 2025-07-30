package designpattern.PrototypeRegistry;

public interface Shape extends Cloneable{
    Shape clone();
    void draw();
}
