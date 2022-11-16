package ClassWork;

import java.util.Arrays;

public class GodmanThriftsMain {
    public static void main(String[] args) {
        GodmanThrifts godmanThrifts = new GodmanThrifts(5,10000);
       // godmanThrifts.getParticipantList()[0] = ""
        String [] list = godmanThrifts.getParticipantList();
        list[0] = " Funmi";
        list[1] = "Godman";
        list[2] = " Ubuntu";
        list[3] = " Alex";
        list[4] = " Isi";
        System.out.println(Arrays.toString(list));
        String [] newParticipantList = {"Godman","Ubuntu","Funmi","Alex","Isi"};
        godmanThrifts.setParticipantList(newParticipantList);
        String [] newList = godmanThrifts.getParticipantList();
        System.out.println(Arrays.toString(newList));

    }
}
