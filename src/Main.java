class CalculateG{
    public static void main(String[] arguments){
        double gravity =-9.81; // Earth's gravity in m/s^2
        int fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;


        //Add the formulas for position and velocity
        finalVelocity=((gravity*fallingTime)+initialVelocity)/fallingTime;
        finalPosition=0.5*gravity*fallingTime+initialVelocity*finalVelocity+initialPosition;

        System.out.println("The object's position after" + fallingTime + "secons is" + finalPosition + "m");
        //Add output line for velocity (similar to position)
        System.out.println("The object's velocity after" + fallingTime + "second is" + finalVelocity + "m");
    }
}