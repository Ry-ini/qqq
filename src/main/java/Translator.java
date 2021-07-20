import java.util.Scanner;

public class Translator {

    public static void main(String[] args) {
        int process = getVersion();

        if (process == 1) {
            getRuWord();
        } else if (process == 2) {
            getEngWord();
        } else {
            System.out.println("Такого варіанту перекладу немає!");
        }
    }

    public static int getVersion() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть варіант перекладу:\n" +
                "1) ENG->RU\n" +
                "2) RU->ENG");
        int version = input.nextInt();
        return version;
    }

    public static void getRuWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть слово: ");
        String word = input.next();

        switch (word) {
            case "sunny":
                System.out.println("солнечно");
                break;
            case "cloudy":
                System.out.println("облачно");
                break;
            case "rainy":
                System.out.println("дождливо");
                break;
            case "windy":
                System.out.println("ветрено");
                break;
            case "foggy":
                System.out.println("туманно");
                break;
            case "cold":
                System.out.println("холодно");
                break;
            case "warm":
                System.out.println("тепло");
                break;
            case "chilly":
                System.out.println("прохладно");
                break;
            case "freezing":
                System.out.println("очень холодно");
                break;
            case "hot":
                System.out.println("жарко");
                break;
            default:
                System.out.println("Такого слова наш перекладач не знає!");
        }
    }

    public static void getEngWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть слово: ");
        String word = input.next();

        switch (word) {
            case "солнечно":
                System.out.println("sunny");
                break;
            case "облачно":
                System.out.println("cloudy");
                break;
            case "дождливо":
                System.out.println("rainy");
                break;
            case "ветрено":
                System.out.println("windy");
                break;
            case "туманно":
                System.out.println("foggy");
                break;
            case "холодно":
                System.out.println("cold");
                break;
            case "тепло":
                System.out.println("warm");
                break;
            case "прохладно":
                System.out.println("chilly");
                break;
            case "очень холодно":
                System.out.println("freezing");
                break;
            case "жарко":
                System.out.println("hot");
                break;
            default:
                System.out.println("Такого слова наш перекладач не знає!");
        }
    }

}
