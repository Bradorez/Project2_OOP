public class Main
{
    public static void main(String[] args) {
        Plants plants = new Plants();
        Plants green_apple = new Apple();
        System.out.println(plants.toString());
        System.out.println(green_apple.toString());
        green_apple.print_name("a");
        Superclass instance = new extendedclass();
        instance.print();
        BaseMessage AndriisText = new FileMessage("My message");
        AndriisText.output();
        System.out.println(AndriisText.output());
    }
}