package fr.lernejo.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatMessageController {
    ChatMessageRepository repository = ChatMessageRepository.getInstance();

    @GetMapping(value = "/api/message")
    public List<String> getMessages(){
        return repository.getLastTenMessages();
    }
}
