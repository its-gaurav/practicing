package builder;

public class House {

    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    private House(Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.interior = builder.interior;

    }

    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        public Builder buildFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder buildStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder buildRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder buildInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House :: " +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}
