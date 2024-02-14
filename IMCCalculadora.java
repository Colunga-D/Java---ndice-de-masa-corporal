public class IMCCalculadora {
    public static String clasificarIMC(double imc) {
        if (imc < 16) {
            return "Delgadez Severa";
        } else if (imc >= 16 && imc < 17) {
            return "Delgadez Moderada";
        } else if (imc >= 17 && imc < 18.5) {
            return "Delgadez Leve";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidad Leve";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidad Moderada";
        } else {
            return "Obesidad Morbida";
        }
    }
}