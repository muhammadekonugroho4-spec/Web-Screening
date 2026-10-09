package kotlin.text;

/* loaded from: classes3.dex */
public abstract class n {
    public static void a(Appendable r1, Object r2, kotlin.jvm.functions.l r3) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        if (r3 == null) goto L6;
        r1.append((CharSequence) r3.invoke(r2));
        return;
    L6:
        if (r2 != null) goto L8;
        boolean r32 = true;
    L9:
        if (r32 == false) goto L13;
        r1.append((CharSequence) r2);
        return;
    L13:
        if ((r2 instanceof Character) == false) goto L16;
        r1.append(((Character) r2).charValue());
        return;
    L16:
        r1.append(r2.toString());
        return;
    L8:
        r32 = r2 instanceof CharSequence;
        goto L9
    }
}
