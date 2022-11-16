package ClassWork;

public class GodmanThrifts{
    private String [] participantList ;
    private int lengthOfParticipantList;

    private double amount;
    public GodmanThrifts(int lengthOfParticipantList, double amount) {
        this.amount = amount;
        this.lengthOfParticipantList = lengthOfParticipantList;
        participantList = new String[this.lengthOfParticipantList];
    }

    public String[] getParticipantList() {
        return participantList;
    }

    public void setParticipantList(String[] participantList) {
        this.participantList = participantList;
    }

    public int getLengthOfParticipantList() {
        return lengthOfParticipantList;
    }

    public void setLengthOfParticipantList(int lengthOfParticipantList) {
        this.lengthOfParticipantList = lengthOfParticipantList;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }






}
