package UT5_POOII.Ej3ESDLA;

import java.util.Arrays;

public class Carcaj {
    private String material;
    private Flecha [] flechas;

    public Carcaj(String material) {
        this.flechas =  new Flecha[20];
        this.material = material;
    }
    public Carcaj(String material, Flecha[] arrayFlechas) {
        this.flechas =  new Flecha[20];

            this.flechas =  arrayFlechas;
            this.material = material;


    }

    @Override
    public String toString() {
        return "Carcaj{" +
                "material='" + material + '\'' +
                ", flechas=" + Arrays.toString(flechas) +
                '}';
    }
}
