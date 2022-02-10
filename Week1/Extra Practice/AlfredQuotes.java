import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        String greeting = String.format("Hello, %s. Lovely to see you.", name);
        return greeting;
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "The current date is " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        // System.out.println(conversation.indexOf("Alexis") > -1);

        if (conversation.indexOf("Alexis!") > -1) {

            return "I'm Alexis!!!";
        }
        // System.out.println(conversation.indexOf("Alfred") > -1);
        if (conversation.indexOf("Alfred") > -1) {
            return "At your service";
        }
        if (conversation.indexOf("Batman") > -1) {
            return "POW.  The Joker has escaped!!!";
        }

        return "Keyword not there";

    }

    // String alexisTest = alfredBot.respondBeforeAlexis(
    // "Alexis! Play some low-fi beats.");
    // String alfredTest = alfredBot.respondBeforeAlexis(
    // "I can't find my yo-yo. Maybe Alfred will know where it is.");
    // String notRelevantTest = alfredBot.respondBeforeAlexis(
    // "Maybe that's what Batman is about. Not winning. But failing..");

    // public String respondBeforeAlexis(String conversation) {
    // // YOUR CODE HERE
    // return "I can't find my yo-yo. Maybe Alfred will know where it is.";
    // }

    // public String respondBeforeAlexis(String conversation) {
    // // YOUR CODE HERE
    // return "Maybe that's what Batman is about. Not winning. But failing..";
    // }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}
