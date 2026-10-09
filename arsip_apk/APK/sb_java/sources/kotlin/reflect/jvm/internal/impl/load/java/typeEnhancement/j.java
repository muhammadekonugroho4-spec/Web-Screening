package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class j {
    public static final boolean a(TypeComponentPosition r1) {
        p.l(r1, "<this>");
        if (r1 == TypeComponentPosition.INFLEXIBLE) goto L6;
        return true;
    L6:
        return false;
    }
}
