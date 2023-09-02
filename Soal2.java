package soal2;

public class Soal2{
    public static final double CM_PERINCH =2.54;
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth;
        paperWidth = 8.5;
        double paperHeight = 11;
        
        double widthInCentimeters = paperWidth * CM_PER_INCH;
        double heightInCentimeters = paperHeight * CM_PER_INCH;
        
        System.out.println("Paper size in centimeters: " + widthInCentimeters + " by " + heightInCentimeters);
    }
}