/**
 * ITERATOR interface — a uniform way to walk a collection, one element at a
 * time, WITHOUT knowing how the collection stores its data internally.
 */
public interface SongIterator {
    boolean hasNext();   // is there another element?
    Song next();         // return current element and advance
}
