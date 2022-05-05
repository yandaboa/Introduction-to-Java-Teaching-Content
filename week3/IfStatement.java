public class IfStatement{
    public static void main(String[] args){
        lessThanTen(3);



    }

    public static void lessThanTen(int value){
        while(value < 10){
            System.out.println(value + " is less than 10");
            value++;
        }
    }

}