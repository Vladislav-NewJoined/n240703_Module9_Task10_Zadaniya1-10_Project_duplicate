package task9_7_1_part4;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.generics.BotSession;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
//import task9_7_1_part4.Bot;

// Создан Telegram бот:
// botName: MyTestBot_001
// userName: @qytewqwww_Bot  или  qytewqwww_Bot
// token: 7057416920:AAEzJF-2L8i8GdyLnkqMThUyyXk6BQOdoAk

public class Task9_7_1_part4 {
    public static void main(String[] args) throws Exception {
        System.out.println("""
            Задание:\s
            Модуль 9. UI и использование готовых SDK. Задание №7:\s
                1. Продолжая работу над ботом из предыдущих уроков, реализуйте возможность вызова
                   соответствующего обработчика (класса)  в зависимости от того, прислал пользователь
                   изображение или текстовое сообщение\s

            Решение:\s""");

        System.out.println("В Telegram боте созданы кнопки и надписи к ним с использованием механизма 'рефлексия' " +
                "(reflection). \nОтредактированное изображение сохранено в файле 'cloned_image.jpg' в папке: " +
                "`src/main/java/task9_7_1`. \nА также кнопки появились под сообщением в Telegram боте. Снимок " +
                "экрана сохранён в файле 'buttonsInTelegramBot.jpg' в папке: `src/main/java/task9_7_1`.");

        TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
//        BotSession botSession = api.registerBot(new Bot());

    }
}
