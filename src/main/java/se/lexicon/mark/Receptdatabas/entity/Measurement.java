package se.lexicon.mark.Receptdatabas.entity;

public enum Measurement {
    kg, hg, g,
    l, dl, cl, ml, msk, tsk;

    private int measure;
    private Measurement(int measure){
        this.measure = measure;
    }

    Measurement() {

    }

    public int getMeasure() {
        return measure;
    }
}
