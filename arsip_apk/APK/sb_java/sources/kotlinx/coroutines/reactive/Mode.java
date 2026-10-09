package kotlinx.coroutines.reactive;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/reactive/Mode;", "", "s", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getS", "()Ljava/lang/String;", "FIRST", "FIRST_OR_DEFAULT", "LAST", "SINGLE", "SINGLE_OR_DEFAULT", "toString", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
enum Mode extends Enum<Mode> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ Mode[] $VALUES = null;
    public static final Mode FIRST = null;
    public static final Mode FIRST_OR_DEFAULT = null;
    public static final Mode LAST = null;
    public static final Mode SINGLE = null;
    public static final Mode SINGLE_OR_DEFAULT = null;

    /* renamed from: s, reason: collision with root package name */
    private final String f180493s;

    private static final /* synthetic */ Mode[] $values() {
        return new Mode[]{FIRST, FIRST_OR_DEFAULT, LAST, SINGLE, SINGLE_OR_DEFAULT};
    }

    static {
        FIRST = new Mode("FIRST", 0, "awaitFirst");
        FIRST_OR_DEFAULT = new Mode("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
        LAST = new Mode("LAST", 2, "awaitLast");
        SINGLE = new Mode("SINGLE", 3, "awaitSingle");
        SINGLE_OR_DEFAULT = new Mode("SINGLE_OR_DEFAULT", 4, "awaitSingleOrDefault");
        Mode[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = kotlin.enums.b.a(r02);
    }

    Mode(String r1, int r2, String r3) {
        this.f180493s = r3;
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static Mode valueOf(String r1) {
        return (Mode) Enum.valueOf(Mode.class, r1);
    }

    public static Mode[] values() {
        return (Mode[]) $VALUES.clone();
    }

    public final String getS() {
        return this.f180493s;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f180493s;
    }
}
