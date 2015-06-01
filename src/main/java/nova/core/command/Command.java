package nova.core.command;

import nova.core.entity.Entity;
import nova.core.util.Identifiable;

/**
 * @author halvors
 */
public class Command implements Identifiable {
    private final Entity sender;
    private final String text;

    public Command(Entity sender, String text) {
        this.sender = sender;
        this.text = text;
    }

    public Entity getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }
}
