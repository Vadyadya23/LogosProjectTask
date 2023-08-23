package resources;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Componen
public class MessageService {

    private final MessageSource messageSource;

    @resources.Autowire
    public MessageService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getMessage(String key, Locale locale) {
        return messageSource.getMessage(key, null, locale);
    }
}

