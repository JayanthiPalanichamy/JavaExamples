package main.java.iwp.Student;

public class Mark {
    private int physics;
    private int chemistry;
    private int painting;

    public Mark(int physics, int chemistry, int painting) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.painting = painting;
    }

    public int getPhysics() {
        return physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public int getPainting() {
        return painting;
    }
}
