public class Main {
    public static void main(String[] args) {
        Context context=new Context();
        Expression expression=context.eveluate("1-2+3");
        System.out.println(expression.interpret());
    }
}
