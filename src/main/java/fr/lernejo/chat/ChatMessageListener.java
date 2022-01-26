package fr.lernejo.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {
    ChatMessageRepository repository = ChatMessageRepository.getInstance();

    public void onMessage(String message) {
        repository.addChatMessage(message);
    }
}
