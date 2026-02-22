public class Absences {
    private int absences;

    public Absences(int absences) {
        this.absences = absences;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public int addAbsences(int additionalAbsences) {
        this.absences += additionalAbsences;
        return this.absences;
    }
}
