/**
 * 
 */
package application;

import java.util.Set;

/**
 * @author ateam120
 *
 */
public class Graph implements GraphADT {

    public boolean addEdge(String Person1,String Person2) {
        return false;
    }

    @Override
    public boolean addEdge(Person person1, Person person2) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeEdge(Person person1, Person person2) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addNode(Person person) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeNode(Person person) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Set<Person> getNeighbors(Person person) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Person getNode(String personName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<Person> getAllNodes() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
