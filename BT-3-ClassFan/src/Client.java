public class Client {
    public static void main(String[] args) {
        Fan Fan1 = new Fan(Fan.fast,true,10,"yellow");
        System.out.println(Fan1.toString());
        Fan Fan2 = new Fan(Fan.medium,false,5,"blue");
        System.out.println(Fan2.toString());
    }
}
