package week03_review;

public class IfStatemets1 {
    public static void main(String[] args) {

        int num =100;
        if (num %2 !=0){
            System.out.println("Odd number");
        }else{
            System.out.println("Even number");
        }

        System.out.println("--------------------------------------------");

        // 28,30,31 days
        int month =3;
        if(month>=1&& month >=12){
        if (month==2){
            System.out.println("28 days");
        } else if (month==4||month==6||month==9|month==11) {
            System.out.println("30 days");
        }else {
            System.out.println("31 days");
        }

        }else {
            System.out.println("NOT Valid");
        }

    }



}
