package kotlin.reflect.jvm.internal.impl.descriptors.java;

import kotlin.jvm.internal.p;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

/* loaded from: classes3.dex */
public final class a extends e0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f178296c = null;

    static {
        f178296c = new a();
    }

    public a() {
        super("package", false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e0
    public Integer a(e0 r2) {
        p.l(r2, "visibility");
        if (this != r2) goto L7;
        return 0;
    L7:
        if (d0.f178062a.b(r2) == false) goto L11;
        return 1;
    L11:
        return -1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e0
    public String b() {
        return "public/*package*/";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e0
    public e0 d() {
        return d0.g.f178071c;
    }
}
