package chapter7;

import Chapter7.Poll;

import java.util.Scanner;

public class Main {
    private static Poll poll = new Poll();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String [ ] topics = poll.getTopics();
        int numberOfTopics = topics.length;
        System.out.println("Welcome to Unicorns Poll");
        var  response = "yes or Yes";
        while (response.equals("yes or Yes" )){
        for (int index = 0; index < numberOfTopics; index++) {
            int userRatings = scanner.nextInt();
            if (userRatings < 1 || userRatings > 10)
                throw new InvalidUserRatingsException("Please enter a correct input");
            saveRatings(index,userRatings);
            }
            System.out.println("continue?");
            response =scanner.next();
        }
        poll.displayTabularReport();
        System.out.println();

    }
        private static void saveRatings(int issueNumber, int userRatings){
           int [][] responseDb = poll.getResponses();
           // for (int index = 0; index <poll.getResponses().length ; index++) {
             //   for (int secondIndex = 0; secondIndex <responseDb[index].length; secondIndex++) {
                    responseDb[issueNumber][userRatings] = responseDb[issueNumber][userRatings-1] + 1;

                }

            }


