package com.projectapp.lessons._10_Generic.A5_LimitedMetaSymbolType;


public class A5_Coords<T extends A5_TwoCor>{ // ------

    private T[] coords;

    public A5_Coords(T[] coords) {
        this.coords = coords;
    }

    public void showXY(A5_Coords<?> obCoords) {
        System.out.println("Координаты XY: ");
        for (int i = 0; i < coords.length; i++) {
            System.out.print(obCoords.coords[i].x
                    + " " + obCoords.coords[i].y); // Что нужно сделать чтобы дописать сюда вот это? = + " " + obCoords.coords[i].z
            System.out.println();
        }
    }

    public void showXYZ(A5_Coords<? extends A5_ThreeCor> obCoords) {
        System.out.println("Координаты XYZ: ");
        for (int i = 0; i < coords.length; i++) {
            System.out.print(obCoords.coords[i].x
                    + " " + obCoords.coords[i].y
                    + " " + obCoords.coords[i].z);
            System.out.println();

        }
    }

    public void showAll(A5_Coords<? extends A5_FourCor> obCoords) {
        System.out.println("Координаты ALL: ");
        for (int i = 0; i < coords.length; i++) {
            System.out.print(obCoords.coords[i].x
                    + " " + obCoords.coords[i].y
                    + " " + obCoords.coords[i].z
                    + " " + obCoords.coords[i].t);
            System.out.println();

        }
    }
}
