package core;

import java.util.Set;
import java.util.SortedSet;

public interface PubSubCommand {
	
	public Message execute(Message m, SortedSet<Message> log, Set<String>subscribers, boolean isPrimary, String primaryServer, int primaryPort, String sencondaryServerAddress, int secondaryServerPort);

}
