package HomeWork2_4;
import java.util.*;
import static java.util.Arrays.asList;

       //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся)
       //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
       //Посчитать, сколько раз встречается каждое слово.
public class Main {

    public static void main(String[] args) {

        String[] arr = {"стол", "стул", "диван", "стул", "шкаф", "тумба", "кровать", "диван", "комод", "этажерка",
                "полка", "зеркало", "стол"};
        System.out.println("Исходный массив слов");
        System.out.println(Arrays.toString(arr));
        Set<String> uniqElems = new HashSet<>(asList(arr));
        System.out.println("Массив уникальных слов");
        System.out.println(uniqElems);
        counter(arr);
        System.out.println();
        //2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
        //телефонных номеров. В этот телефонный справочник с помощью метода add() можно
        //добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
        //учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        //тогда при запросе такой фамилии должны выводиться все телефоны.


        startPhonebook();
    }

    private static void counter(String[] arr) {
    }

    private static void startPhonebook() {
        Phonebook phonebook = new Phonebook();
        phonebook.addPhonebook("Екатеринова", " +7 912 123-44-55");
        phonebook.addPhonebook("Андреева", " +7 912 234-56-78");
        phonebook.addPhonebook("Натальева", " +7 912 345-67-89");
        phonebook.addPhonebook("Екатеринова", " +7 912 456-78-90");
        phonebook.addPhonebook("Анастасиева", " +7 912 567-89-14");
        phonebook.addPhonebook("Мариева", " +7 912 678-90-12");
        phonebook.addPhonebook("Натальева", " +7 912 789-01-23");
        phonebook.addPhonebook("Денисова", " +7 912 890-12-34");
        phonebook.addPhonebook("Богданова", " +7 912 901-23-45");
        phonebook.addPhonebook("Денисова", " +7 912 012-34-56");

        System.out.println("Екатеринова: " + phonebook.getPhonebook("Екатеринова"));
        System.out.println("Натальева: " + phonebook.getPhonebook("Натальева"));
        System.out.println("Денисова: " + phonebook.getPhonebook("Денисова"));
    }
}
