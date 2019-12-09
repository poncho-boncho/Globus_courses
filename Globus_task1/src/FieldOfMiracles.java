import java.io.*;

public class FieldOfMiracles {

    public static class WordSelec {


        String key[] = new String[10];
        String line;

        public WordSelec() throws FileNotFoundException {
        }

        public String getAnswer(BufferedReader br, int rand) throws IOException {
            int a = (int) (Math.random() * 10);
            for (int i = 0; i < key.length; i++) {
                line = br.readLine();
                key[i] = line;
            }
            return key[rand];
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader brAnswer = new BufferedReader(new FileReader("answer.txt"));
        BufferedReader brQuest = new BufferedReader(new FileReader("questions.txt"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int random = (int) (Math.random() * 10);
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        WordSelec qq = new WordSelec();

        String word = qq.getAnswer(brAnswer, random);
        String currWord;
        System.out.println("Добро пожаловать в игру поле чудес!! \n" +
                "Всё что тебе нужно сделать это просто отгадать слово по буквам \n" +
                "т.е водишь буквы пока те наберёшь нужное слово (слова на Русском) \n"+
                "Поехали! \n" +
                qq.getAnswer(brQuest, random));
        for (int i =0; i<=word.length();i++){
            System.out.print('-');
        }
        System.out.println();
     do {
         char letter = reader.readLine().toLowerCase().charAt(0);
         alphabet = alphabet.replace(letter, '*');
         currWord = word;
         for (char ch : alphabet.toCharArray()){
             currWord = currWord.replace(ch, '-');
             currWord = currWord.replace(Character.toUpperCase(ch), '-');
         }
         System.out.println(currWord);
     } while (currWord.contains("-"));
     reader.close();
     System.out.println("вы выиграли!!!");
 }
}
