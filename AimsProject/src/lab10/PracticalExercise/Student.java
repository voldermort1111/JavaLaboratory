package lab10.PracticalExercise;

public class Student {
    private int studentID;
    private String studentName;
    private String birthday;
    private float gpa;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthdayString) {
        try {
            isBirthday(birthdayString);
            this.birthday = birthdayString;
        } catch (IllegalBirthDayException ibde) {
            ibde.printStackTrace();
        }
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        try {
            isGpa(gpa);
            this.gpa = gpa;
        } catch (IllegalGPAException ige) {
            ige.printStackTrace();
        }

    }

    private boolean isGpa(float gpa) throws IllegalGPAException {
        if ((gpa > 4.0f) || (gpa < 0f)) {
            System.err.println("ERROR: " + gpa + " is not GPA");
            throw (new IllegalGPAException());
        }

        return true;
    }

    private boolean isBirthday(String Birthday) throws IllegalBirthDayException {
        String [] D = Birthday.split("/");

        if (D.length ==3)  {
            int dd = Integer.parseInt(D[0]);
            int MM = Integer.parseInt(D[1]);
            int yyyy = Integer.parseInt(D[2]);

            if (yyyy>0)
                if (MM>0 && MM<13)
                    if (dd>0)
                        switch (MM) {
                            case 2:
                                if ((yyyy%4 == 0) && (dd<29)) return true;
                                break;
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                                if (dd<32) return true;
                            default:
                                if (dd<31) return true;
                        }
        }

        System.err.println("ERROR: " + Birthday + " is not Birthday");
        throw (new IllegalBirthDayException());
    }

    @Override
    public String toString() {
        return getStudentID() + " " + getStudentName() + " " + getBirthday() + " " + getGpa();
    }
}
