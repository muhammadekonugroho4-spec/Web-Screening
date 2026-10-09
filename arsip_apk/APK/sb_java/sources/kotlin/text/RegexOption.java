package kotlin.text;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\bB\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0003\u001a\u00020\u0004X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u00020\u0004X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/text/RegexOption;", "Lkotlin/text/FlagEnum;", "", "value", "", "mask", "<init>", "(Ljava/lang/String;III)V", "getValue", "()I", "getMask", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum RegexOption extends Enum<RegexOption> {
    public static final RegexOption CANON_EQ = null;
    public static final RegexOption COMMENTS = null;
    public static final RegexOption DOT_MATCHES_ALL = null;
    public static final RegexOption IGNORE_CASE = null;
    public static final RegexOption LITERAL = null;
    public static final RegexOption MULTILINE = null;
    public static final RegexOption UNIX_LINES = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RegexOption[] f180359a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f180360b = null;
    private final int mask;
    private final int value;

    static {
        String r1 = "IGNORE_CASE";
        int r2 = 0;
        int r3 = 2;
        int r4 = 0;
        IGNORE_CASE = new RegexOption(r1, r2, r3, r4, 2, null);
        String r22 = "MULTILINE";
        int r32 = 1;
        int r42 = 8;
        int r5 = 0;
        MULTILINE = new RegexOption(r22, r32, r42, r5, 2, null);
        String r33 = "LITERAL";
        int r43 = 2;
        int r52 = 16;
        int r6 = 0;
        LITERAL = new RegexOption(r33, r43, r52, r6, 2, null);
        String r44 = "UNIX_LINES";
        int r53 = 3;
        int r62 = 1;
        int r7 = 0;
        UNIX_LINES = new RegexOption(r44, r53, r62, r7, 2, null);
        String r54 = "COMMENTS";
        int r63 = 4;
        int r72 = 4;
        int r8 = 0;
        COMMENTS = new RegexOption(r54, r63, r72, r8, 2, null);
        String r64 = "DOT_MATCHES_ALL";
        int r73 = 5;
        int r82 = 32;
        int r9 = 0;
        DOT_MATCHES_ALL = new RegexOption(r64, r73, r82, r9, 2, null);
        String r74 = "CANON_EQ";
        int r83 = 6;
        int r92 = 128;
        int r10 = 0;
        CANON_EQ = new RegexOption(r74, r83, r92, r10, 2, null);
        RegexOption[] r02 = a();
        f180359a = r02;
        f180360b = kotlin.enums.b.a(r02);
    }

    RegexOption(String r1, int r2, int r3, int r4) {
        this.value = r3;
        this.mask = r4;
    }

    public static final /* synthetic */ RegexOption[] a() {
        return new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    public static kotlin.enums.a getEntries() {
        return f180360b;
    }

    public static RegexOption valueOf(String r1) {
        return (RegexOption) Enum.valueOf(RegexOption.class, r1);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) f180359a.clone();
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    /* synthetic */ RegexOption(String r1, int r2, int r3, int r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 2) == 0) goto L5;
        r4 = r3;
    L5:
        this(r1, r2, r3, r4);
    }
}
