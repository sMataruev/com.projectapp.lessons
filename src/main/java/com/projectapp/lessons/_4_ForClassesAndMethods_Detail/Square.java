package com.projectapp.lessons._4_ForClassesAndMethods_Detail;

/** *
 * Разница if от equals
 */

public class Square {

    private int a;

    Square(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Square other = (Square) obj;
        if (a != other.a)
            return false;
        return true;
    }

    public static void main(String[] args) throws Exception {

        Square s1 = new Square(5);
        Square s2 = new Square(6);

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));
    }

}
