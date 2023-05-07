public class Main
{
    public static void main(String[] args)
    {
        LogMessage test1 = new LogMessage("CLIENT3:security alert - repeated login failures");
        LogMessage test2 = new LogMessage("Webserver:disk offline");
        LogMessage test3 = new LogMessage("SERVER1:file not found");
        LogMessage test4 = new LogMessage("SERVER2:read error on disk DSK1");
        LogMessage test5 = new LogMessage("SERVER1:write error on disk DSK2");
        LogMessage test6 = new LogMessage("Webserver:error on /dev/disk");
        LogMessage test7 = new LogMessage("7:disk");
        LogMessage test8 = new LogMessage("8:error on disk");
        LogMessage test9 = new LogMessage("9:error on /dev/disk disk");
        LogMessage test10 = new LogMessage("10:error on disk DSK1");
        LogMessage test11 = new LogMessage("11:DISK");
        LogMessage test12 = new LogMessage("12:error on disk3");
        LogMessage test13 = new LogMessage("13:error on /dev/disk");
        LogMessage test14 = new LogMessage("14:diskette");

        System.out.println("1: " + test1.containsWord("disk"));
        System.out.println("2: " + test2.containsWord("disk"));
        System.out.println("3: " + test3.containsWord("disk"));
        System.out.println("4: " + test4.containsWord("disk"));
        System.out.println("5: " + test5.containsWord("disk"));
        System.out.println("6: " + test6.containsWord("disk"));
        System.out.println("7: " + test7.containsWord("disk"));
        System.out.println("8: " + test8.containsWord("disk"));
        System.out.println("9: " + test9.containsWord("disk"));
        System.out.println("10: " + test10.containsWord("disk"));
        System.out.println("11: " + test11.containsWord("disk"));
        System.out.println("12: " + test12.containsWord("disk"));
        System.out.println("13: " + test13.containsWord("disk"));
        System.out.println("14: " + test14.containsWord("disk"));
    }
}
