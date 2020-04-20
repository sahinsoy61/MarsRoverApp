package com.mars.generator;

public enum Direction {

    E(1,0) {
        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction left() {
            return N;
        }
    },
    


    S(0,-1) {
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }
    },


    
    N(0,1) {
        @Override
        public Direction left() {
            return W;
        }

        @Override
        public Direction right() {
            return E;
        }
    },
    

    W(-1,0) {
        @Override
        public Direction right() {
            return N;
        }

        @Override
        public Direction left() {
            return S;
        }
    };

    private final int sizeXAxis;
    private final int sizeYOrdinat;

    Direction(final int sizeXAxis, final int sizeYOrdinat) {
        this.sizeXAxis = sizeXAxis;
        this.sizeYOrdinat = sizeYOrdinat;
    }

    public abstract Direction right();
    public abstract Direction left();

    public int sizeXAxis() {
        return this.sizeXAxis;
    }

    public int sizeYOrdinat() {
        return this.sizeYOrdinat;
    }

}
