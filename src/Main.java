public class Main {
    public static void main(String[] args) {
        String string = "Курсовая работа «Введение в профессию и синтаксис языка»";
        int i = string.length();
        System.out.println("Первая часть- " + string.substring(0, i / 2));
        System.out.println("Вторая часть- " + string.substring(i / 2, i));
    }
}