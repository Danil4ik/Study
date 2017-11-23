
public class Args_task {
    public static void main(String[] args) {
        //Отобразить в окне консоли аргументы командной строки в обратном порядке
        /*for (int i = args.length; i >=1; i--) {
            System.out.println(i);
        }*/

        //Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль
        int S = 0, P = 1;
        for (int i = 0; i < args.length; i++) {
            int a = Integer.parseInt(args[i]);
            S += a;
            P *= a;
        }
        System.out.println(S);
        System.out.println(P);
    }
}

