import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        writeMethod("Вера в любовь", "Абир Касенов");
        System.out.println(read());
    }

    public static void writeMethod(String title, String autlor) throws IOException {
        FileWriter write = new FileWriter("Song.txt");
        write.write("\n" + "Назвние: " + title + "\n");
        write.write("Автор: " + autlor + "\n"+"\n");
        write.write("Я поднимаюсь на перрон, где ты?\n" +
                "Ищу тебя среди толпы, мне не хватает высоты\n" +
                "Я набираю номер твой, между небом и землей\n" +
                "Но вдруг ловлю твой взгляд, а у тебя глаза горят!\n" +
                "Где-то в дали, как странно наши мысли вновь сошлись\n" +
                "Ты посмотри, как птицы исполняют твой каприз\n" +
                "Я ведь тебя хочу, зачем мне менять судьбу\n" +
                "Сердце мое возьми, время мое забери\n" +
                "Ты не веришь в эти слова, как больно\n" +
                "Я не отпускаю тебя, так сложно\n" +
                "Просто ты мне прямо скажи\n" +
                "Я поверю в наши мечты\n" +
                "Ты не веришь в эти слова, как больно\n" +
                "Я не отпускаю тебя, так сложно\n" +
                "Просто ты мне прямо скажи\n" +
                "Я поверю в наши мечты\n" +
                "Короткий звук и телефон беру\n" +
                "Читаю сообщение с ответом вновь идет к тебе\n" +
                "Сейчас с тобой мы на краю, на тебя я вновь смотрю\n" +
                "И не могу понять, зачем же нужно улетать?\n" +
                "Где-то в дали, как странно наши мысли вновь сошлись\n" +
                "Ты посмотри, как птицы исполняют твой каприз\n" +
                "Я ведь тебя хочу, зачем мне менять судьбу\n" +
                "Сердце мое возьми, время мое забери\n" +
                "Ты не веришь в эти слова, как больно\n" +
                "Я не отпускаю тебя, так сложно\n" +
                "Просто ты мне прямо скажи\n" +
                "Я поверю в наши мечты\n" +
                "Ты не веришь в эти слова, как больно\n" +
                "Я не отпускаю тебя, так сложно\n" +
                "Просто ты мне прямо скажи\n" +
                "Я поверю в наши мечты");
        write.close();
    }

    public static Song read() throws IOException {
        FileReader reader = new FileReader("Song.txt");
        Scanner scanner = new Scanner(reader);
        Song song = new Song();
        StringBuilder stringBuilder = new StringBuilder();
        song.setAutlor(song.getAutlor());
        song.setTitle(song.getTitle());
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine() + "\n");
        }
        song.setText(stringBuilder.toString());
        reader.close();
        return song;
    }
}