package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.p;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes3.dex */
public abstract class h {
    public h() {
    }

    public abstract void a(CallableMemberDescriptor r1);

    public abstract void b(CallableMemberDescriptor r1, CallableMemberDescriptor r2);

    public abstract void c(CallableMemberDescriptor r1, CallableMemberDescriptor r2);

    public void d(CallableMemberDescriptor r2, Collection r3) {
        p.l(r2, "member");
        p.l(r3, "overridden");
        r2.O(r3);
    }
}
