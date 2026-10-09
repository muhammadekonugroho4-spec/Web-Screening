package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class e {
    public static final Class a(ClassLoader r1, String r2) {
        p.l(r1, "<this>");
        p.l(r2, "fqName");
        return Class.forName(r2, false, r1);
    L5:
        return null;
    }
}
