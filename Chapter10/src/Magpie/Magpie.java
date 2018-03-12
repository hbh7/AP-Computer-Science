package Magpie;

public class Magpie
{

    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement)
    {
        String response;
        if (statement.trim().length() == 0) {
            response = "Say something or else!";
        } else if (statement.contains("no")) {
            response = "Why so negative?";
        } else if (statement.contains("mother")
                || statement.contains("father") 
                || statement.contains("sister") 
                || statement.contains("brother")) {
            response = "Tell me more about your family.";
        } else if (statement.contains("cat")
                || statement.contains("dog")) {
            response = "Tell me more about your pets.";
        } else if (statement.contains("vargas")) {
            response = "He sounds like a good teacher.";
        } else if (statement.contains("meme")) {
            response = "I love memes!";
        } else if (statement.contains("pizza")) {
            response = "My favorite kind is cheese!";
        } else if (statement.contains("chatbot")) {
            response = "I am a human like yourself!";
        } else {
            response = getRandomResponse();
        }
        return response;
    }

    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "Let's talk about something else.";
        } else if (whichResponse == 5) {
            response = "Perhaps.";
        }
        return response;
    }
}
