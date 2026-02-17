package UT5_POOII.Ej3ESDLA;

    public class Flecha{
        private String color;
        private double velocidad;
        private boolean venenosa;

        public Flecha(String color, double velocidad, boolean venenosa) {

            this.color = color;
            this.velocidad = velocidad;
            this.venenosa = venenosa;
        }


        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getVelocidad() {
            return velocidad;
        }

        public void setVelocidad(double velocidad) {
            this.velocidad = velocidad;
        }

        public boolean isVenenosa() {
            return venenosa;
        }

        public void setVenenosa(boolean venenosa) {
            this.venenosa = venenosa;
        }

        @Override
        public String toString() {
            return "Flecha{" +
                    "color='" + color + '\'' +
                    ", velocidad=" + velocidad +
                    ", venenosa=" + venenosa +
                    '}';
        }
    }
