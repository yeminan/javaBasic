package Structural.Facade;

public class FacadeEx {
    public static void main(String[] args) {
        Facade facade = new Facade("콜라","어벤져스");
        facade.view_Movie();
    }
}