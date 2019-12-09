package application;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * @author ateam120
 *
 */
public interface SocialNetworkADT {
    //add edge
    public boolean addFriends(String person1, String person2);
   // remove edge
    public boolean removeFriends(String person1, String person2);
    // add vertex
    public boolean addUser(String person);
    // remove vertex
    public boolean removeUser(String person);
    // get edge
    public Set<Person> getFriends(String person);
    //
    public Set<Person> getMutualFriends(String person1, String person2);
    //
    public List<String> getShortestPath(String person1, String person2);
    //
    public Set<Graph> getConnectedComponents();
    //
    public void loadFromFile(File file);
    //
    public void saveToFile(File file) throws IOException;
    boolean setCentral(String person);

}
