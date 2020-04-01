
package archives;

/**
 *
 * @author angel
 */
public class Key {
    
    private int key;
    private int position; //RRN

    public Key() {
        key = -1;
        position = 0;
    }

    public Key(int key, int position) {
        this.key = key;
        this.position = position;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    
    
}
