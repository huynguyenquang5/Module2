package Baitap;

public class TriangleClassifier {
    public static String reviewTriangle(int side1, int side2, int side3) {
        boolean check1 = side1 + side2 > side3;
        boolean check2 = side1 + side3 > side2;
        boolean check3 = side2 + side3 > side1;
        boolean check4 = side1 > 0 && side2 > 0 && side3 > 0;
        boolean check5 = side1 == side2 || side1 == side3 || side2 == side3;
        boolean check6 = side1 == side2 && side1 == side3;
        if (check1 && check2 && check3 && check4) {
            if (check5) {
                if (check6) {
                    return "tam giác đều";
                } else {
                    return "tam giác cân";
                }
            } else {
                return "tam giác thường";
            }
        } else {
            return "không phải là tam giác";
        }
    }
}
