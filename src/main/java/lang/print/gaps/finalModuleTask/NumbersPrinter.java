package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        while (number > 0){
            System.out.println(true);
            break;
        }
        while (number<=0){
            System.out.println(false);
            break;
        }
    }
}
