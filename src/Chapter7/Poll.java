package Chapter7;

    public class Poll {
        private String[] topics = {"Financial issues", "Psychological issues", "Gender Inequality", "Hunger", "Breakfast"};
        private int[][] responses = new int[5][10];

        private double averageRating;

        public String[] getTopics() {
            return topics;
        }

        public void setTopics(String[] topics) {
            this.topics = topics;
        }

        public int[][] getResponses() {
            return responses;
        }

        public void setResponses(int[][] responses) {
            this.responses = responses;
        }

        public double getAverageRating() {
            return averageRating;
        }

        public void setAverageRating(double averageRating) {
            this.averageRating = averageRating;
        }

        public double calculateAverage(int[] pollNumbers) {
            int totalOfRatings = 0;

            for (int pollNumber : pollNumbers) {
                totalOfRatings += pollNumber;
            }

            double average = totalOfRatings / pollNumbers.length;
            return average;
        }

        public int getHighestPoint(int[] pollNumbers) {
            int highestNumber = pollNumbers[0];

            for (int index = 0; index < pollNumbers.length; index++) {
                if (pollNumbers[index] > highestNumber) {
                    highestNumber = pollNumbers[index];
                }
            }

            return highestNumber;
        }

        public int getLowestPoint(int[] pollNumbers) {
            int lowestNumber = pollNumbers[0];

            for (int index = 0; index < pollNumbers.length; index++) {
                if (pollNumbers[index] < lowestNumber) {
                    lowestNumber = pollNumbers[index];
                }
            }

            return lowestNumber;
        }

        public void displayTabularReport() {
            String header = String.format("\t\t\t\t\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            System.out.println(header);
            for (String topic : getTopics()) {
                System.out.println(topic);
                System.out.println();
            }
            for (int index = 0; index < getResponses().length; index++) {
                System.out.printf("%s", getTopics()[index]);
                for (int secondIndex = 0; secondIndex < getResponses()[index].length; secondIndex++) {

                }

                //}


            }
        }
    }