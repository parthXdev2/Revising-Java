public class multidimensional {
    public static void main(String[] args) {

        String[][] groceries = {{"apple","bananas","oranges"},
                                {"onion","capsicum","raddish"}};


        // This code of line shows the rows and colums 
        System.out.println(groceries[0][0]);
        System.out.println(groceries[0][1]);
        System.out.println(groceries[0][2]);
        System.out.println(groceries[1][0]);
        System.out.println(groceries[1][1]);
        System.out.println(groceries[1][2]);


        // for(String[] foods : groceries)
        //     for(String food :foods){
        // System.out.print(food + " ");}
    }
}
