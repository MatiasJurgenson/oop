class TestIsik {
    public static void main (String[] argv) {
        Isik a = new Isik("Juhan Juurikas", 1.99, "2", 100);
        System.out.println("Isik a on " + a);

        System.out.println(a.toString());
        System.out.println(a.newton(9.81));
    }
}
