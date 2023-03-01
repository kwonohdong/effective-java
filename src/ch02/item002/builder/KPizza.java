package ch02.item002.builder;

public class KPizza extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public KPizza build() {
            return new KPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private KPizza(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return super.toppings.toString() + " / sauceInside=" + this.sauceInside;
    }
}
