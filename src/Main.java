public class Main
{
    public static void main(String[] args)
    {
        /* Test Bus class
        Bus bus1 = new Bus(3);
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        System.out.println(bus1.getCurrentStop());
        Bus bus2 = new Bus(5);
        System.out.println(bus1.getCurrentStop());
        System.out.println(bus2.getCurrentStop());
         */
        /* Test RandomWord class
        RandomWord rand1 = new RandomWord ("zebra", "dog");
        System.out.println(rand1.getNewWord());
        System.out.println(rand1.randomLetter(1));
        System.out.println(rand1.randomLetter(2));
        System.out.println(rand1.randomLetter(1));
        System.out.println(rand1.getNewWord());
        rand1.resetWord();
        System.out.println(rand1.randomLetter(1));
        System.out.println(rand1.randomLetter(2));
        System.out.println(rand1.getNewWord());
        */
        /* Test CodeWordChecker */
        CodeWordChecker sc1 = new CodeWordChecker(5, 8, "$");
        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("happyCode"));
        CodeWordChecker sc2 = new CodeWordChecker("pass");
        System.out.println(sc2.isValid("MyPass"));
        System.out.println(sc2.isValid("Mypassport"));
        System.out.println(sc2.isValid("happy"));
        System.out.println(sc2.isValid("1,000,000,000,000,000"));

    }
}
