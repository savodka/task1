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
        Collections.sort(lines);
        System.out.println(lines);

        Map<String, Integer> hm = new HashMap<>();
        Integer am;
        for (String i : lines) {
            am = hm.get(i);
            if (am == null) hm.put(i, 1);
            else hm.put(i, am + 1);
        }
        System.out.println(hm);
        int maxKey = 0;
        String maxRepeat = null;
        for (String word : hm.keySet()) {
            if (hm.get(word) > maxKey) {
                maxKey = hm.get(word);
                maxRepeat = word;
            }

        }
        System.out.println("Максимально " + maxRepeat + " - " + Collections.max(hm.values()) + " раз");
    }
}

/*
Если у тебя уже есть HashMap с подсчитанными повторениями,
то проще всего пройти по нему циклом и найти максимальное значение "вручную".

int maxRepeat=0;
for (String word:hm.keySet()){
    //тут должен быть твой код)
}

Это вроде как самый наглядный способ.
Самый короткий - через вспомогательные методы класса Collections и список значений HashMap-а:

maxRepeat = Collections.max(hm.values());


А когда получил максимальную длину, то пройти ещё раз,
 и вывести слова у которых число повторов максимально.
 Бонусом получишь как раз то, что если есть несколько таких слов,
 то выведутся все они, а не только одно.
*/

/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class WordsCollection {
    public static void main(String[] args) {
        TreeMap<String, Integer> countedWords = new TreeMap<>();
        try(BufferedReader fileReader = new BufferedReader(new FileReader("input.txt"))){
            LinkedList<String> words = Arrays.stream(fileReader.lines()
                    .reduce((line, anotherLine) -> line.concat(" ".concat(anotherLine))).get()
                    .split("( )+"))
                    //Отсортировать в алфавитном порядке.
                    .sorted().collect(Collectors.toCollection(LinkedList::new));
            //Посчитать сколько раз каждое слово встречается в файле.
            for (String i:words) {
                if(countedWords.containsKey(i)){
                    countedWords.replace(i, countedWords.get(i) + 1);
                }else{
                    countedWords.put(i, 1);
                }
            }
            //Вывести статистику на консоль
            System.out.println(countedWords);
            //Найти слово с максимальным количеством повторений.
            String mostPopularWord = countedWords.entrySet().stream().reduce((a,b) -> (a.getValue() >= b.getValue())?a:b).get().getKey();
            //Вывести на консоль это слово и сколько раз оно встречается в файле
            System.out.println(mostPopularWord + " " + countedWords.get(mostPopularWord) + " раза");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
*/