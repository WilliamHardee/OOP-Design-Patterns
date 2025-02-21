/* Singleton
 * 
 * This is a creational pattern in which only one instance of a class is allowed. 
*/

public class Singleton {

    static Singleton instance;
    int data;

    private Singleton() {}

    public static Singleton get_instance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void set_data(int data) {
        this.data = data;
    }

    public int get_data() {
        return data;
    }
}
