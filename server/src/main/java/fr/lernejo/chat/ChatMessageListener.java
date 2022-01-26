package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {
    ChatMessageRepository repository = ChatMessageRepository.getInstance();

    public void onMessage(String message) {
        repository.addChatMessage(message);
    }
}
