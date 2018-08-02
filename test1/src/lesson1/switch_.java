package lesson1;
// SWITCH STATEMENT

public class switch_ {
    public static void main(String[] args) {
        int score = 10;

        switch (score){
            // check multiple conditions
            case 5:
            case 10:
            case 20:
                System.out.println("score: Bad");
                break;
            case 40:
                System.out.println("score: Ok");
                break;
            case 60:
                System.out.println("score: Good");
                break;
            default:
                System.out.println("default");
                break;
        }
        System.out.println("**************************************");

        System.out.println(test2(3));
        //System.out.println(true);     // print true
        System.out.println("**************************************");
        test3();
    }

    public static int test(int value){
        int res = 0;

        switch (value){
            case 1:
                res = 111;
                break;
            case 2:
                res = 222;
                break;
            case 3:
                res = 333;
                break;
            default:
                break;
        }
        return res;
    }
    public static int test2(int value){
        int res = 0;

        switch (value){
            case 1:
                return 111;
            case 2:
                return 222;
            case 3:
                return 333;
            default:
                return 0;
        }
    }
    public static void test3(){
        for(int i=0; i<=5; i++){
            switch (i){
                case 0:
                case 1:
                    // The continue moves to the next iteration in the loop.
                    continue;
                default:
                    // This breaks the switch, not the loop.
                    break;
            }
            System.out.println(i);
        }
    }
    /*
    Output
        2
        3
        4
    */
}
