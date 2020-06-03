package se.lexicon.mark.Receptdatabas.entity;

public enum Measurement {
    kg, hg, g,
    l, dl, cl, ml, msk, tsk;

    private int size;
    private Measurement(int size){
        this.size = size;
    }

    Measurement() {

    }

    public int getSize() {
        return size;
    }
}
