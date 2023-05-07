public class LogMessage {
    // instance variables
    private String machineId;
    private String description;

    // constructor
    public LogMessage(String message) {
        machineId = message.substring(0,message.indexOf(":"));
        description = message.substring(message.indexOf(":")+1);
    }
    public boolean containsWord(String keyword) {
        // description is exactly the keyword
        if (description.indexOf(keyword) != -1) {
            if (description.equals(keyword)) {
                System.out.print("exactly the keyword: ");
                return true;
            }
            // at beginning and followed by space
            else if (description.indexOf(keyword + " ") == 0) {
                System.out.print("at beginning and followed by a space: ");
                return true;
            }
            // at end and preceded by a space
            else if (description.indexOf(" " + keyword) == description.length() - (keyword.length() + 1)) {
                System.out.print("at end and preceded by a space: ");
                return true;
            }
            // in the middle and surrounded by spaces
            else if (description.indexOf(" " + keyword + " ") != -1) {
                System.out.print("in the middle surrounded by spaces: ");
                return true;
            }
            else {
                System.out.print("keyword not found: ");
                return false;
            }
        }
        System.out.print("keyword not found. didnt even check: ");
        return false;
    }

    public String getMachineId() {
        return machineId;
    }
    public String getDescription() {
        return description;
    }

}
