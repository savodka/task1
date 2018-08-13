/*
Есть входной файл с набором слов, написанных через пробел
Необходимо: Прочитать слова из файла.
Отсортировать в алфавитном порядке.
Посчитать сколько раз каждое слово встречается в файле.
Вывести статистику на консоль
Найти слово с максимальным количеством повторений.
Вывести на консоль это слово и сколько раз оно встречается в файле
 */

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordsCollection {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());

        System.out.println(lines);
        System.out.println(lines.get(1));
        lines.add("америка");

        Collections.sort(lines);
        System.out.println(lines);
        System.out.println(lines.remove(0));
        System.out.println(lines);
        System.out.println(lines.get(2));
        HashMap<String, Integer> hm = new HashMap<>();
        Integer am;
        for (String i : lines) {
            am = hm.get(i);
            if (am == null) hm.put(i, 1);
            else hm.put(i, am + 1);
        }
        System.out.println(hm);
        final Set<Map.Entry<String, Integer>> entries = hm.entrySet();


                System.out.println();


        //System.out.println("Max val: " + Collections.nCopies(hm));

        /* maxKey = Collections.max(map.entrySet(), lines.Entry.comparingByValue()).getKey(); */
    }
}