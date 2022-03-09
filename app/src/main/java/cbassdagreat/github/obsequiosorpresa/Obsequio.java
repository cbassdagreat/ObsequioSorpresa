package cbassdagreat.github.obsequiosorpresa;



public class Obsequio {

    private int obs;

    public Obsequio(int obs) {
        this.obs = obs;
    }

    public int getObs() {
        return obs;
    }

    public void setObs(int obs) {
        this.obs = obs;
    }

    @Override
    public String toString() {
        return "Obsequios{" +
                "obs=" + obs +
                '}';
    }
}

