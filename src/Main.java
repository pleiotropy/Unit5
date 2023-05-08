public class Main
{
    public static void main(String[] args)
    {
        Soil s = new Soil (10, 3);
        System.out.println(s.treatmentsNeeded());
        System.out.println(s.isDangerous());
        s.treat(7);
        System.out.println(s.treatmentsNeeded());
        s.treat(11);
        System.out.println(s.treatmentsNeeded());
        s.treat(10);
        System.out.println(s.treatmentsNeeded());
        System.out.println(s.isDangerous());
        s.treat(8);
        s.treat(4);
        System.out.println(s.treatmentsNeeded());
        System.out.println(s.isDangerous());
        s.treat(4);
        System.out.println(s.treatmentsNeeded());
        System.out.println(s.isDangerous());
        s.treat(11);
        System.out.println(s.treatmentsNeeded());
        System.out.println(s.isDangerous());
        s.treat(12);
        System.out.println(s.treatmentsNeeded());
        System.out.println(s.isDangerous());
    }
}
