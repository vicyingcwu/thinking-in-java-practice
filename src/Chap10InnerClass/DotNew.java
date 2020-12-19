package Chap10InnerClass;

public class DotNew {
    public class Inner {

    }

    public static class Inner1 {

    }



    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
        DotNew.Inner1 dn1 = new DotNew.Inner1();
    }
}
