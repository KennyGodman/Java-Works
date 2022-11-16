package ClassWork;

public class Native {
    private int scvId;
    private String firstname;
    private String lastname;
    private int cohortId;

    public String getScvId() {
        if (cohortId == 12){
            return "SCV-UNICORNS" + scvId;
    }
     return "SCV"+cohortId  +scvId;
}

    public void setScvId(int scvId) {

        this.scvId = scvId;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCohortId() {
        return cohortId;
    }

    public void setCohortId(int cohortId) {
        if (cohortId != 12) {
            // do nothing
        } else {
            this.cohortId = cohortId;
        }


    }
}