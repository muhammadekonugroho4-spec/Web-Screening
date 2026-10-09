package kotlin.time;

/* loaded from: classes3.dex */
public abstract class f {
    public static final long a(long r1, DurationUnit r3, DurationUnit r4) {
        kotlin.jvm.internal.p.l(r3, "sourceUnit");
        kotlin.jvm.internal.p.l(r4, "targetUnit");
        return r4.getTimeUnit$kotlin_stdlib().convert(r1, r3.getTimeUnit$kotlin_stdlib());
    }

    public static final long b(long r1, DurationUnit r3, DurationUnit r4) {
        kotlin.jvm.internal.p.l(r3, "sourceUnit");
        kotlin.jvm.internal.p.l(r4, "targetUnit");
        return r4.getTimeUnit$kotlin_stdlib().convert(r1, r3.getTimeUnit$kotlin_stdlib());
    }
}
