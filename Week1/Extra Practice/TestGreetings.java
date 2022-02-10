public class TestGreetings {
    public static void main(String[] args) {
        Greetings greeterApp = new Greetings();
        String dateMessage = greeterApp.getCurrenDate();
        System.out.println(dateMessage);

        String englishGreeting = greeterApp.greetEnglish("John");
        System.out.println(englishGreeting);

        String spanishGreeting = greeterApp.greetSpanish("Hector");
        System.out.println(spanishGreeting);

    }
}
