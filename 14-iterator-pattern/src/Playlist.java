/**
 * AGGREGATE interface — a collection that can hand out an iterator over
 * itself. Clients depend on this, not on the concrete storage.
 */
public interface Playlist {
    void add(Song song);
    SongIterator iterator();
}
