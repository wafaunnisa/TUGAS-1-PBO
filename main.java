public class main {

    // Konversi Reamur ke Celcius
    public static double reamurToCelsius(double reamur) {
        return reamur *  5 /  4;
    }

    // Konversi Reamur ke Fahrenheit
    public static double reamurToFahrenheit(double reamur) {
        return reamur *  9 /  4 +  32;
    }

    // Konversi Reamur ke Kelvin
    public static double reamurToKelvin(double reamur) {
        return reamur *  5 /  4 +  273.15;
    }

    // Menghitung umur berdasarkan tahun lahir
    public static int calculateAge(int birthYear) {
        int currentYear =  2024; // Tahun saat ini
        return currentYear - birthYear;
    }

    // Menghitung luas segitiga
    public static double calculateTriangleArea(double base, double height) {
        return  0.5 * base * height;
    }

    // Menghitung keliling segitiga
    public static double calculateTrianglePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    public static void main(String[] args) {
        double reamur =  80;
        int birthYear =  1990;
        double base =  5;
        double height =  3;
        double sideA =  4;
        double sideB =  5;
        double sideC =  3;

        System.out.println("Reamur: " + reamur);
        System.out.println("Celsius: " + reamurToCelsius(reamur));
        System.out.println("Fahrenheit: " + reamurToFahrenheit(reamur));
        System.out.println("Kelvin: " + reamurToKelvin(reamur));
        System.out.println("Umur: " + calculateAge(birthYear));
        System.out.println("Luas Segitiga: " + calculateTriangleArea(base, height));
        System.out.println("Keliling Segitiga: " + calculateTrianglePerimeter(sideA, sideB, sideC));
    }
}