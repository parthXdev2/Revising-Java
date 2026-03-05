public class vargars {
    public static void main(String[] args) {
        
        // vargargs = allows a method to accept a varying of arguments make method more flexible , no need of overloaded methods , java will pack the argument into array . ( ellipssis )

        
        // System.out.println(add(1 , 5 , 4));
        System.out.println(findAverage(1,3,5,7,9));
    }
        static int add(int... numbers){
            int sum = 0;
            for(int num : numbers){
                sum += num;

            }
            return sum;
        
        }

        static double findAverage(double... numb){

            double sum = 0;

            for(double num : numb){
                sum += num;
            }
            return sum/numb.length;
        }   



}
