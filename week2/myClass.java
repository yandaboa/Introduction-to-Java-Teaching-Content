public class myClass {
    public static void main(String[] args){
        int parameter = 12;
        int result = addTogether(parameter);
        System.out.println(result);
    }

    static int addTogether(int value){
        return value + 10;
    }
}