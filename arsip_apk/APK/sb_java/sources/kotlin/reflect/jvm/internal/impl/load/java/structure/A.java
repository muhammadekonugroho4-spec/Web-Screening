package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes3.dex */
public abstract class A {
    public static final boolean a(x r2) {
        if ((r2 instanceof C) == false) goto L5;
        C r22 = (C) r2;
    L7:
        if (r22 != null) goto L9;
    L14:
        return false;
    L9:
        if (r22.q() == null) goto L14;
        if (r22.M() == true) goto L14;
        return true;
    L5:
        r22 = null;
        goto L7
    }
}
