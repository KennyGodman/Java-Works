package Nokia_App;

import java.util.Scanner;
public class Nokia {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {


        System.out.println("""
                      Menu\s
                1 PhoneBook\s
                2 Messages\s
                3 Chat\s
                4 Call Register\s
                5 Tones\s
                6 Settings\s
                7 Call Divert\s
                8 Games\s
                9 Calculator\s
                10 Reminders\s
                11 Clock\s
                12 Profile\s
                13 Sim Services\s
                Enter any number
                \s""");

        int input = scanner.nextInt();

        switch (input) {
            case 1 -> phoneBook();
            case 2 -> message();
            case 3 -> chat();
            case 4 -> callRegister();
            case 5 -> Tones();
            case 6 -> settings();
            case 7 -> callDivert();
            case 8 -> Games();
            case 9 -> Calculator();
            case 10 -> Reminders();
            case 11 -> Clock();
            case 12 -> Profile();
            case 13 -> simServices();
        }
    }

    /* Phone Book*/
    public static void phoneBook() {
        System.out.println("""
                Phonebook\s
                 1. Search\s
                 2. Service Nos.\s
                 3. Add Name\s
                 4. Erase\s
                 5. Edit\s
                 6. Assign Tone\s
                 7. Send Business card\s
                 8. Options\s
                 9. Speed Dials\s
                 10. Voice Tags\s
                0 Back""");
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Search");
            case 2 -> System.out.println("Service Nos");
            case 3 -> System.out.println("Add Name");
            case 4 -> System.out.println("Erase");
            case 5 -> System.out.println("Edit");
            case 6 -> System.out.println("Assign Tone");
            case 7 -> System.out.println("Send BusinessCard");
            case 8 -> option();
            case 9 -> System.out.println("Speed Dial");
            case 10 -> System.out.println("Voice   Tags");
            case 0 -> menu();
        }

    }

    public static void option() {
        System.out.println("""
                 Options\s
                1 Type of view\s
                2 Memory status\s
                0 Back""");
        System.out.println();
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Type of View");
            case 2 -> System.out.println("Memory Status");
            default -> phoneBook();
        }

    }

    /* Message*/
    public static void message() {
        System.out.println("""
                       Messages\s
                 1 Write Message\s
                 2 Inbox\s
                 3 Outbox\s
                 4 Picture Message\s
                 5 Templates\s
                 6 Smileys\s
                 7 Message Settings\s
                 8 Info Service\s
                 9 Voice Mailbox Number\s
                 10 Service Command Editor\s
                 0 Back\s
                \s""");

        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Write Messages");
            case 2 -> System.out.println("Inbox");
            case 3 -> System.out.println("Outbox");
            case 4 -> System.out.println("Picture Messages");
            case 5 -> System.out.println("Templates");
            case 6 -> System.out.println("Smileys");
            case 7 -> messageSetting();
            case 8 -> System.out.println("Info service");
            case 9 -> System.out.println("Voice Mailbox Number");
            case 10 -> System.out.println("Service Command Editor");
            case 0 -> menu();

        }
    }

    public static void messageSetting() {
        System.out.println("""
                Message Settings
                 1 Set\s
                 2 Common\s
                 0 Back\s
                """);
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> set();
            case 2 -> common();
            case 3 -> System.out.println("Message Validity");
            case 0 -> message();
        }
    }

    public static void set() {
        System.out.printf("""
                  Set\s
                1 Messages Center Number\s
                2. Messages Sent as\s
                3. Message Validity\s
                0. Back
                """);
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Message Center Number");
            case 2 -> System.out.println("Message Sent As");
            case 3 -> System.out.println("Message Validity");
            default -> messageSetting();
        }

    }

    public static void common() {

        System.out.println("""
                Common\s
                1 Delivery Reports\s
                2 Reply via same character\s
                3 Character Support\s
                0 Back\s""");

        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Delivery Reports");
            case 2 -> System.out.println("Reply via same character");
            case 3 -> System.out.println("Character Support");
            case 0 -> messageSetting();
        }
    }

    /*  Chat*/
    public static void chat() {
        System.out.println("No information here\n" +
                "O Back");
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                menu();
        }
    }

    /*  Call Register*/
    public static void callRegister() {
        System.out.println("""
                 Call Register\s
                 1 Missed Calls\s
                 2 Received Calls\s
                 3 Dialed Calls \s
                 4 Erase recent call list\s
                 5 Show call duration\s
                 6 Show call costs\s
                 7 Call cost Settings\s
                 8 Prepaid credit\s
                 0 Back\s
                \s""");

        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Missed Calls");
            case 2 -> System.out.println("Received Calls");
            case 3 -> System.out.println("Dialed Calls");
            case 4 -> System.out.println("Erase recent call list");
            case 5 -> showDuration();
            case 6 -> showCallCost();
            case 8 -> System.out.println("Prepaid credit");
            case 0 -> menu();

        }
    }

    public static void showDuration() {
        System.out.println("""
                Show Duration
                 1 Last call duration\s
                 2 All calls duration\s
                 3 Received calls duration\s
                 4 Dialed calls duration
                 5 Clear timers
                 0 Back\s
                """);
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Last call duration");
            case 2 -> System.out.println("All calls duration");
            case 3 -> System.out.println("Received calls duration");
            case 4 -> System.out.println(" Dialed calls duration");
            case 5 -> System.out.println("Clear timers");
            case 0 -> callRegister();
        }
    }

    public static void showCallCost() {
        System.out.println("""
                Show Duration
                 1 Last call cost\s
                 2 All calls\s
                 3 Clear counter\s
                 0 Back\s
                """);
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Last call cost");
            case 2 -> System.out.println("All call cost");
            case 5 -> System.out.println("Clear timers");
            case 0 -> callRegister();

        }
    }

    /* Tones*/
    public static void Tones() {
        System.out.println("""
                 Tones\s
                 1 Ringing tone\s
                 2 Ringing volume\s
                 3 Incoming call alert \s
                 4 Composer\s
                 5 Message alert tone\s
                 6 Keypad tones\s
                 7 Warning and games tones\s
                 8 Vibrating alert\s
                 9 Screen saver
                 0 Back\s
                \s""");

        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Ringing tone");
            case 2 -> System.out.println("Ringing volume");
            case 3 -> System.out.println("Incoming call alert");
            case 4 -> System.out.println("Composer");
            case 5 -> System.out.println("Message alert tone");
            case 6 -> System.out.println("Keypad tones");
            case 7 -> System.out.println("Warning and games tones");
            case 8 -> System.out.println("Vibrating alert");
            case 9 -> System.out.println("Screen saver");
            case 0 -> menu();

        }
    }

    /*  Settings*/
    public static void settings() {
        System.out.println("""
                 Settings\s
                 1 Call settings\s
                 2 Phone settings\s
                 3 Security settings \s
                 4 Restore factory settings\s
                         
                 0 Back\s
                \s""");

        int input = scanner.nextInt();
        switch (input) {
            case 1 -> callSettings();
            case 2 -> phoneSettings();
            case 3 -> securitySettings();
            case 4 -> System.out.println("Restore factory settings");
            case 0 -> menu();
        }
    }

    public static void callSettings() {
        System.out.println("""
                Call settings
                 1 Automatic redial\s
                 2 Speed dialing\s
                 3 Call waiting options\s
                 4 Own number sending\s
                 5 Phone line in use\s
                 6 Automatic answer\s
                 0 Back\s
                """);
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Automatic redial");
            case 2 -> System.out.println("Speed dialing");
            case 3 -> System.out.println("Call waiting options");
            case 4 -> System.out.println(" Own number sending ");
            case 5 -> System.out.println(" Phone line in use");
            case 6 -> System.out.println(" Automatic answer");
            case 0 -> settings();
        }
    }

    public static void phoneSettings() {
        System.out.println("""
                Phone settings
                 1 Language\s
                 2 Cell info display\s
                 3 Welcome note\s
                 4 Network selection\s
                 5 Lights\s
                 6 Confirm SIM service actions\s
                 0 Back\s
                """);
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Language");
            case 2 -> System.out.println(" Cell info display");
            case 3 -> System.out.println(" Welcome note");
            case 4 -> System.out.println(" Network selection ");
            case 5 -> System.out.println("Lights");
            case 6 -> System.out.println(" Confirm SIM service actions");
            case 0 -> settings();
        }
    }

    public static void securitySettings() {
        System.out.println("""
                Security settings
                 1 Pin code request\s
                 2 Call barring service\s
                 3 Fixed dialing\s
                 4 Closed user group\s
                 5 Phone security\s
                 6 Change access codes\s
                 0 Back\s
                """);
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println(" Pin code request");
            case 2 -> System.out.println(" Call barring service");
            case 3 -> System.out.println(" Fixed dialing");
            case 4 -> System.out.println(" Closed user group ");
            case 5 -> System.out.println(" Phone security");
            case 6 -> System.out.println("Change access codes");
            case 0 -> settings();
        }
    }

    /*  Call divert*/
    public static void callDivert() {
        System.out.println("No information here\n" +
                "O Back");
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                menu();
        }
    }

    public static void Games() {
        System.out.println("No information here\n" +
                "O Back");
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                menu();
        }
    }

    public static void Calculator() {
        System.out.println("No information here\n" +
                "O Back");
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                menu();
        }
    }

    public static void Reminders() {
        System.out.println("No information here\n" +
                "O Back");
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                menu();
        }
    }

    /* Clock*/
    public static void Clock() {
        System.out.println("""
                 Clock\s
                 1 Alarm clock\s
                 2 Clock settings\s
                 3 Date setting \s
                 4 Stopwatch\s
                 5 Countdown timer\s
                 6 Auto update of date and time\s
                 0 Back\s
                \s""");

        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("Alarm clock");
            case 2 -> System.out.println("Clock settings");
            case 3 -> System.out.println("Date setting ");
            case 4 -> System.out.println("Composer");
            case 5 -> System.out.println("Stopwatch");
            case 6 -> System.out.println("Countdown timer");
            case 7 -> System.out.println("Auto update of date and time");
            case 0 -> menu();

        }
    }

    /* Profile*/
    public static void Profile() {
        System.out.println("No information here\n" +
                "O Back");
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                menu();
        }
    }

    /* SIM Services*/
    public static void simServices() {
        System.out.println("No information here\n" +
                "O Back");
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                menu();
        }
    }
}







