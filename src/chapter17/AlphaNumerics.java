package chapter17;

    import java.util.ArrayList;
import java.util.List;

    public class AlphaNumerics {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("uijhy7654erfds");
            list.add("[]987poiPU4$#-");

            System.out.println(getIntegerCount( list));
        }
        private static int getIntegerCount(List<String> list){
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).length(); j++) {
                    if(Character.isDigit(list.get(i).charAt(j))) count += 1;
                }
            }
            return count;
        }
    }

