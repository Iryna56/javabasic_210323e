package operatops;

public class LogicOperatops {
    public static void main(String[] args) {

        int q = 10;
        int w = 20;
        int e = 30;
        int r = 40;
        //                                              true
        //                              true
        //                       true
        //                       !false                        false
        //                 false       false      true         !true
        boolean test = (!((q > w) && (w > r)) || (r > q)) || !(e < r);
        //                                                  true
        //                                             true       true
        System.out.println("(q < w) && (e < r) = " + ((q < w) && (e < r)));
        //                                                   false
        //                                              true      false
        System.out.println("(q < w) && (e > r) = " + ((q < w) && (e > r)));
        //                                                   true
        //                                              true      false
        System.out.println("(q < w) || (e > r) = " + ((q < w) || (e > r)));
        //                                                   false
        //                                             false      false
        System.out.println("(q > w) || (e > r) = " + ((q > w) || (e > r)));
        //                                                      false
        //                                                      false
        //                                                 true      false
        System.out.println("!((q < w) || (e > r)) = " + !(((q < w) || (e > r))));
        //                                                         true
        //                                                        false
        //                                                 false            false
        System.out.println("!((q < w) || (e > r)) = " + !(((q > w) || (e > r))));


    }




}
