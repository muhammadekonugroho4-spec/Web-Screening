package kotlin.reflect.jvm.internal.impl.descriptors.java;

import kotlin.jvm.internal.p;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

/* loaded from: classes3.dex */
public final class b extends e0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b f178297c = null;

    static {
        f178297c = new b();
    }

    public b() {
        super("protected_and_package", true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e0
    public Integer a(e0 r2) {
        p.l(r2, "visibility");
        if (p.g(this, r2) == false) goto L7;
        return 0;
    L7:
        if (r2 != d0.b.f178066c) goto L11;
        return null;
    L11:
        if (d0.f178062a.b(r2) == false) goto L15;
        return 1;
    L15:
        return -1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e0
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e0
    public e0 d() {
        return d0.g.f178071c;
    }
}
