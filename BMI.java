import static java.lang.Math.pow;

public class BMI {

        private static final double KG_RATIO = 0.45359237;
        private static final double HEIGHT_RATIO = 0.0254;

        private double weight;
        private double height;

        public BMI() {

        }

        public BMI(double weight, double height) {

            this.weight = weight;
            this.height = height;

        }

        public double compute(double weight, double height) {

            double result;

            weight = weight * KG_RATIO;
            height = height * HEIGHT_RATIO;

            result = weight / pow(height, 2);

            return result;

        }

        public String classification(double result) {

            String tier = null;

            if (result < 18.5) {
                tier = "Underweight";
            }

            if (result >= 18.5 && result < 25) {
                tier = "Normal";
            }

            if (result >= 25 && result < 30) {
                tier = "Overweight";
            }

            if (result >= 30 ) {
                tier = "Obese";
            }

            return tier;

        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }


}


