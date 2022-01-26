package fr.lernejo.chat;

import java.util.LinkedList;
import java.util.List;

public class ChatMessageRepository {
    private static ChatMessageRepository instance = null;

    private final LinkedList<String> history = new LinkedList<>();

    public static ChatMessageRepository getInstance() {
        if (instance == null) {
            instance = new ChatMessageRepository();
        }
        return instance;
    }

    private ChatMessageRepository(){}

    void addChatMessage(String message) {
        if (history.size() >= 10) {
            history.removeFirst();
        }
        history.addLast(message);
    }

    List<String> getLastTenMessages() {
        return history;
    }
}
