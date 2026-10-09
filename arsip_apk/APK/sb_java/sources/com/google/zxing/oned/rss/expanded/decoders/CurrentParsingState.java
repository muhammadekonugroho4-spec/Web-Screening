package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes6.dex */
final class CurrentParsingState {
    private State encoding;
    private int position;

    public enum State extends Enum<State> {
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State ALPHA = null;
        public static final State ISO_IEC_646 = null;
        public static final State NUMERIC = null;

        static {
            State r02 = new State("NUMERIC", 0);
            NUMERIC = r02;
            State r1 = new State("ALPHA", 1);
            ALPHA = r1;
            State r2 = new State("ISO_IEC_646", 2);
            ISO_IEC_646 = r2;
            $VALUES = new State[]{r02, r1, r2};
        }

        State(String r1, int r2) {
        }

        public static State valueOf(String r1) {
            return (State) Enum.valueOf(State.class, r1);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public CurrentParsingState() {
        this.position = 0;
        this.encoding = State.NUMERIC;
    }

    public int getPosition() {
        return this.position;
    }

    public void incrementPosition(int r2) {
        this.position += r2;
    }

    public boolean isAlpha() {
        if (this.encoding != State.ALPHA) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isIsoIec646() {
        if (this.encoding != State.ISO_IEC_646) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isNumeric() {
        if (this.encoding != State.NUMERIC) goto L6;
        return true;
    L6:
        return false;
    }

    public void setAlpha() {
        this.encoding = State.ALPHA;
    }

    public void setIsoIec646() {
        this.encoding = State.ISO_IEC_646;
    }

    public void setNumeric() {
        this.encoding = State.NUMERIC;
    }

    public void setPosition(int r1) {
        this.position = r1;
    }
}
