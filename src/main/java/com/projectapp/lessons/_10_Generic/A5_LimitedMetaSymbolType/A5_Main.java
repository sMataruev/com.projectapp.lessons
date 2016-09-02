package com.projectapp.lessons._10_Generic.A5_LimitedMetaSymbolType;


public class A5_Main {

    public static void main(String[] args) {

        A5_TwoCor[] twoCors = {
                new A5_TwoCor(0, 0),
                new A5_TwoCor(1, 1),
                new A5_TwoCor(2, 2),
                new A5_TwoCor(3, 3)};

        A5_Coords<A5_TwoCor> obCor = new A5_Coords<>(twoCors);

        obCor.showXY(obCor);
//        obCor.showXYZ(obCor);
//        obCor.showAll(obCor);
        System.out.println("*******************************");
//-------------------------------------------------------

        A5_ThreeCor[] threeCors = {
                new A5_ThreeCor(0, 0, 0),
                new A5_ThreeCor(1, 1, 1),
                new A5_ThreeCor(2, 2, 2),
                new A5_ThreeCor(3, 3, 3)
        };

        A5_Coords<A5_ThreeCor> obCorThree = new A5_Coords<>(threeCors);

        obCorThree.showXY(obCorThree);
        obCorThree.showXYZ(obCorThree);
//        obCorThree.showAll(obCorThree);
        System.out.println("*******************************");
//---------------------------------------------------------

        A5_FourCor[] fourCors = {
                new A5_FourCor(0, 0, 0, 0),
                new A5_FourCor(1, 1, 1, 1),
                new A5_FourCor(2, 2, 2, 2),
                new A5_FourCor(3, 3, 3, 3)
        };

        A5_Coords<A5_FourCor> obCorFour = new A5_Coords<>(fourCors);

        obCorFour.showXY(obCorFour);
        obCorFour.showXYZ(obCorFour);
        obCorFour.showAll(obCorFour);
        System.out.println("*******************************");





















    }
}
