import java.util.Scanner;

 class DisplayType {
    public static void main(String[] args) {
        int number = 10;
        Scanner input = new Scanner(System.in);
        while (number!=0){
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            number = input.nextInt();
            if (number == 1){
                for (int i =1; i<=3;i++){
                    System.out.println("*******");

                }
            }
            else if (number == 2){
                for (int i = 5; i>=1;i--){
                    for (int j = 1; j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();

                }
            }
            else if (number== 3){
                for (int i =1;i<6;i++){
                    for (int j = 6;j>i;j--){
                        System.out.print(" ");
                    }
                    for (int l = 0;l<i;l++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            else if (number==4){
                System.exit(4);
            }
            else {
                System.out.println("No choice");
            }


        }

    }
}
