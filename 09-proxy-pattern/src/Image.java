/** The shared interface — the real object and the proxy both implement it,
 *  so the client can't tell them apart. */
public interface Image {
    void display();
}
