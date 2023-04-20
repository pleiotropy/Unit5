public class Main {
    public static void main(String[] args) {
        // Test Person class
        Person p = new Person("Angela", "Joseph", "angela@example.com");
        p.introduce();
        System.out.println("First name: " + p.getFirstName());
        System.out.println("Last name: " + p.getLastName());
        System.out.println("E-Mail address: " + p.getEMail());
        p.setNewEMail("angelajoseph@example.com");
        System.out.println("New e-Mail address: " + p.getEMail());

        // Test Prism class
        Prism rp = new Prism(1,1,1);
        System.out.println("The surface area is: " + rp.surfaceArea());
        System.out.println("The volume is: " + rp.volume());
        rp.setHeight(5);
        rp.setLength(7);
        rp.setWidth(9);
        System.out.println("The surface area is: " + rp.surfaceArea());
        System.out.println("The volume is: " + rp.volume());

        // Test Spinner class
        Spinner s = new Spinner(10);
        System.out.println("============================================");
        System.out.println("Welcome to the Spinner Thing");
        System.out.println("============================================");

        System.out.println("Spinning the spinner...");
        s.spin();
        System.out.println("Most recent spin: " + s.getMostRecentSpin());
        System.out.println("Average spin: " + s.averageSpin());
        System.out.println("============================================");

        System.out.println("Spinning the spinner...");
        s.spin();
        System.out.println("Most recent spin: " + s.getMostRecentSpin());
        System.out.println("Average spin: " + s.averageSpin());
        System.out.println("============================================");

        System.out.println("Spinning the spinner...");
        s.spin();
        System.out.println("Most recent spin: " + s.getMostRecentSpin());
        System.out.println("Average spin: " + s.averageSpin());
        System.out.println("============================================");

        System.out.println("Spinning the spinner...");
        s.spin();
        System.out.println("Most recent spin: " + s.getMostRecentSpin());
        System.out.println("Average spin: " + s.averageSpin());
        System.out.println("============================================");

        System.out.println("Spinning the spinner...");
        s.spin();
        System.out.println("Most recent spin: " + s.getMostRecentSpin());
        System.out.println("Average spin: " + s.averageSpin());
        System.out.println("============================================");
    }
}
