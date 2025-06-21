package StreamsAndLambdas;

import java.util.Arrays;
import java.util.List;

public class SentenceProcessor {
    public static int processSentences(List<String> sentences) {
        //Filter out sentences that contain the word "Java".
        //Map each filtered sentences to its length.
        //Find the average length of the sentences.
        //Convert the average length to an integer by rounding down.
        //Return the rounded average length.

        return (int) sentences.stream()
                .filter(sentence -> sentence.contains("Java"))
                .mapToInt(sentence -> sentence.length())
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is a programming language.",
                "Python is also a good language.",
                "Java stream processing is powerful.",
                "C++ is not as popular as Java."
        );

        int averageLength = SentenceProcessor.processSentences(sentences);
        System.out.println(averageLength);

        sentences = Arrays.asList(
                "Python is a programming language.",
                "JS is used for web development.",
                "Ruby is known for its simplicity.",
                "java is good"
        );

        averageLength = SentenceProcessor.processSentences(sentences);
        System.out.println(averageLength);
    }
}