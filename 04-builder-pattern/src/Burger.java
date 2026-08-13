/**
 * Builder Pattern — an immutable Burger assembled step by step.
 * Two required fields (bun, patty), everything else optional.
 * The private constructor means the ONLY way to build one is via Builder.
 */
public class Burger {
    // All fields final → the finished burger is immutable.
    private final String bun;      // required
    private final String patty;    // required
    private final boolean cheese;  // optional
    private final boolean lettuce; // optional
    private final boolean tomato;  // optional
    private final String sauce;    // optional

    private Burger(Builder b) {
        this.bun = b.bun;
        this.patty = b.patty;
        this.cheese = b.cheese;
        this.lettuce = b.lettuce;
        this.tomato = b.tomato;
        this.sauce = b.sauce;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bun).append(" bun + ").append(patty).append(" patty");
        if (cheese)  sb.append(" + cheese");
        if (lettuce) sb.append(" + lettuce");
        if (tomato)  sb.append(" + tomato");
        if (sauce != null) sb.append(" + ").append(sauce).append(" sauce");
        return sb.toString();
    }

    /** The static nested Builder. Fluent setters return `this` so calls chain. */
    public static class Builder {
        private final String bun;    // required → constructor arg
        private final String patty;  // required → constructor arg
        private boolean cheese;
        private boolean lettuce;
        private boolean tomato;
        private String sauce;

        public Builder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        public Builder cheese(boolean v)  { this.cheese = v;  return this; }
        public Builder lettuce(boolean v) { this.lettuce = v; return this; }
        public Builder tomato(boolean v)  { this.tomato = v;  return this; }
        public Builder sauce(String v)    { this.sauce = v;   return this; }

        public Burger build() {
            // Validation belongs here — fail before the object exists.
            if (bun == null || patty == null) {
                throw new IllegalStateException("bun and patty are required");
            }
            return new Burger(this);
        }
    }
}
