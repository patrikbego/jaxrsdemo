package eu.europa.ema.res;

import java.util.Collection;

public class Violation {

    private String fieldPath;
    private Collection<String> messages;

    public Violation() {
    }

    public Violation(String fieldPath, Collection<String> messages) {
        this.fieldPath = fieldPath;
        this.messages = messages;
    }

    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    public Collection<String> getMessages() {
        return messages;
    }

    public void setMessages(Collection<String> messages) {
        this.messages = messages;
    }
}
