package kotlin.text;

/* loaded from: classes3.dex */
public abstract class v extends u {
    public static StringBuilder q(StringBuilder r3, String... r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        kotlin.jvm.internal.p.l(r4, "value");
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        r3.append(r4[r1]);
        r1 = r1 + 1;
        goto L3
    L5:
        return r3;
    }
}
