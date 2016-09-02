package com.projectapp.lessons._4_ForClassesAndMethods_Detail;

/** *
 * Разница if от equals
 */

public class IfandEquals {

    private int a;
    IfandEquals(int a) {
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
        IfandEquals other = (IfandEquals) obj;
        if (a != other.a)
            return false;
        return true;
    }
    public static void main(String[] args) throws Exception {

        IfandEquals s1 = new IfandEquals(5);
        IfandEquals s2 = new IfandEquals(6);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

}
