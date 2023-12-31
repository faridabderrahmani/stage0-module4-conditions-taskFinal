package school.mjc.stage0.conditions.finalTask;


public class TriangleSidesValidator {
    public static void main(String[] args) {

    }
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if(firstSide!=0 && secondSide!=0 && thirdSide!=0){
            if(Math.abs(firstSide) + Math.abs(secondSide) > Math.abs(thirdSide)
                    || Math.abs(firstSide) + Math.abs(thirdSide) > Math.abs(secondSide)
                    || Math.abs(secondSide) + Math.abs(thirdSide) > Math.abs(firstSide)){
            System.out.println("this is a valid triangle");
            }
        }else{
            System.out.println("t's not a triangle");
        }
    }
}
