package kotlin.reflect.jvm.internal.impl.name;

/* loaded from: classes3.dex */
enum State extends Enum<State> {
    public static final State AFTER_DOT = null;
    public static final State BEGINNING = null;
    public static final State MIDDLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ State[] f179254a = null;

    static {
        BEGINNING = new State("BEGINNING", 0);
        MIDDLE = new State("MIDDLE", 1);
        AFTER_DOT = new State("AFTER_DOT", 2);
        f179254a = a();
    }

    State(String r1, int r2) {
    }

    public static final /* synthetic */ State[] a() {
        return new State[]{BEGINNING, MIDDLE, AFTER_DOT};
    }

    public static State valueOf(String r1) {
        return (State) Enum.valueOf(State.class, r1);
    }

    public static State[] values() {
        return (State[]) f179254a.clone();
    }
}
