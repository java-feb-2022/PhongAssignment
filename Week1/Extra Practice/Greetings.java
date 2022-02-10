import java.util.Date;

class Greetings {

    // greetEnglish("Jon");

    public String getCurrenDate() {
        Date date = new Date();
        return "Current date is " + date;

    }

    public String greetEnglish(String name) {
        return "Hello " + name;
    }

    public String greetSpanish(String name) {
        return "Hola " + name;
    }
}
