/*
Есть входной файл с набором слов, написанных через пробел
Необходимо: Прочитать слова из файла.
Отсортировать в алфавитном порядке.
Посчитать сколько раз каждое слово встречается в файле.
Вывести статистику на консоль
Найти слово с максимальным количеством повторений.
Вывести на консоль это слово и сколько раз оно встречается в файле
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WordsCollection {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.defaultCharset());
        System.out.println(lines);


    }
}