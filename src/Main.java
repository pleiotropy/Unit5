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
        /* Test CodeWordChecker
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
        */
        /* Test Dog
        Dog myDog = new Dog("Toby", 10);
        System.out.println(myDog);
        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        System.out.println(myDog.getIsSleeping());

        myDog.setName("Tobias");
        myDog.setAge(11);
        myDog.setIsSleeping(true);
        System.out.println(myDog);
        */
        /* Test Student4 from U5L4
        Student4 student = new Student4("Benny", "Gudman", 2020, 94.5, true);
        System.out.println(student);
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getGradYear());
        System.out.println(student.getGpa());
        System.out.println(student.isInClub());
        student.setFirstName("Benjamin");
        student.setLastName("Goodman");
        student.setGradYear(2021);
        student.setGpa(64.5);
        student.setInClub(false);
        System.out.println(student);
        */
        /* Test Dragon
        Dragon dragon = new Dragon();
        System.out.println(dragon);
        int attackAmt = dragon.attack();
        dragon.takeDamage(20);
        dragon.powerUp(1);
        dragon.powerUp(2);
        dragon.powerUp(2);
        dragon.powerUp(2);
        int attackAmt2 = dragon.attack();
        System.out.println(dragon);
        dragon.takeDamage(70);
        dragon.powerUp(2);
        int attackAmt3 = dragon.attack();
        dragon.powerUp(2);
        System.out.println(dragon);
        int attackAmt4 = dragon.attack();
        System.out.println(dragon);
        dragon.takeDamage(65);
        dragon.takeDamage(40);
        dragon.takeDamage(10);
        System.out.println(dragon);
        //Testing the getter methods
        System.out.println(dragon.getStrength());
        System.out.println(dragon.getHealth());
        System.out.println(dragon.getLevel());
        System.out.println(dragon.isDead());
         */
        /* Test StepTracker */
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}
