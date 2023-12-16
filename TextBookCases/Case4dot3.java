package TextBookCases;

public class Case4dot3 {

    public static void main(String[] args) {
        Round round = new Round();
        round.r = 20;
        float r = 20;
        float area = round.getArea();
        System.out.println(area);
        float circumference = round.getCircumference(r);
        System.out.println(circumference);
    }

    public static class Round {
        final float PI = 3.14159f;
        public float r = 0.0f;
        public float getArea() {
            return PI * r * r;
        }
        public float getCircumference(float r){
            return 2 * PI * r;
        }
    }

}
