public class a {
    public static void main(String[] args) {
        String Best = "sndasdjRCDFTVGHBJNiansd";

        System.out.println(Best.length());
        System.out.println(Best.toLowerCase());
        System.out.println(Best.toUpperCase());
        System.out.println(Best);
        System.out.println(Best.indexOf('a'));


        String s = "Hello";
        int a = (int) 7.1561f;
        String txt = "Hello guys my name is \"Dima\"";
        System.out.println(txt);

        System.out.println(Math.random());
        int random_number = (int) (Math.random() * 11);
        System.out.println(random_number);
        long long_number = 1564L;

        boolean isPrime = 7 % 2 == 1 ? true : false;
        System.out.println(isPrime);

//
//        while (true){
//            System.out.println(1);
//        }

        for (int i = 0; i < 15; i++){
            if (i == 5){
                continue;
            } else if (i == 13) {
                break;
            }
            System.out.print(i + " ");
        }
    }
//    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//    for (String i : cars) {
//        System.out.println(i);
//    }
    System.out.println("1");
}
