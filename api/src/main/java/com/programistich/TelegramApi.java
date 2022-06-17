package com.programistich;

public class TelegramApi {
    private String token;

    TelegramApi(String token){
        this.token = token;
    }

    public void sendMessage(String message, String chatID){
        String pathBuilder = "https://api.telegram.org/bot" + token +
                "/sendMessage?chat_id=" +
                chatID +
                "&text=" +
                message;

        String command = "curl -X POST " + pathBuilder;
        Logging.info("Command " + command);

        try {
            Process process = Runtime.getRuntime().exec(command);
            process.getInputStream();

            Logging.info("Result: " + process.info());
        } catch (Exception exception){
            Logging.error(exception);
        }
    }

    public static void main(String[] args) {
        TelegramApi api = new TelegramApi("5537535925:AAFCVz1TmQlVCNnOzHBY4S3kuPpd4LYjmbM");
        api.sendMessage("Hi", "2107708834");
    }
}