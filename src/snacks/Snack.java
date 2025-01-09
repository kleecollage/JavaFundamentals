package snacks;

import java.io.Serializable;

public class Snack implements Serializable {
    private static int counterSnacks = 0;
    private final int idSnack;
    private String nameSnack;
    private double priceSnack;

    public Snack() {
        this.idSnack = ++counterSnacks;
    }

    public Snack(String nameSnack, double priceSnack) {
        this(); // Call empty constructor
        this.nameSnack = nameSnack;
        this.priceSnack = priceSnack;
    }

    public static int getCounterSnacks() {
        return counterSnacks;
    }

    public int getIdSnack() {
        return this.idSnack;
    }

    public String getNameSnack() {
        return this.nameSnack;
    }

    public void setNameSnack(String nameSnack) {
        this.nameSnack = nameSnack;
    }

    public double getPriceSnack() {
        return this.priceSnack;
    }

    public void setPriceSnack(double priceSnack) {
        this.priceSnack = priceSnack;
    }

    @Override
    public String toString() {
        return "Snack {" +
                "idSnack=" + idSnack +
                ", name='" + nameSnack + '\'' +
                ", price=" + priceSnack +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(priceSnack, snack.priceSnack) == 0 && nameSnack.equals(snack.nameSnack);
    }

    @Override
    public int hashCode() {
        int result = idSnack;
        result = 31 * result + nameSnack.hashCode();
        result = 31 * result + Double.hashCode(priceSnack);
        return result;
    }
}
