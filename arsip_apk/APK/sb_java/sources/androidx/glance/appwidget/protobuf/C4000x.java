package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.AbstractC3997u;
import java.util.List;

/* renamed from: androidx.glance.appwidget.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4000x implements InterfaceC3999w {
    public C4000x() {
    }

    public static AbstractC3997u.d d(Object r02, long r1) {
        return (AbstractC3997u.d) e0.z(r02, r1);
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC3999w
    public void a(Object r5, Object r6, long r7) {
        AbstractC3997u.d r02 = d(r5, r7);
        AbstractC3997u.d r62 = d(r6, r7);
        int r1 = r02.size();
        int r2 = r62.size();
        if (r1 <= 0) goto L9;
        if (r2 <= 0) goto L9;
        if (r02.isModifiable() == true) goto L8;
        r02 = r02.mutableCopyWithCapacity(r2 + r1);
    L8:
        r02.addAll(r62);
    L9:
        if (r1 <= 0) goto L11;
        r62 = r02;
    L11:
        e0.O(r5, r7, r62);
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC3999w
    public void b(Object r1, long r2) {
        d(r1, r2).makeImmutable();
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC3999w
    public List c(Object r3, long r4) {
        AbstractC3997u.d r02 = d(r3, r4);
        if (r02.isModifiable() == true) goto L10;
        int r1 = r02.size();
        if (r1 != 0) goto L7;
        int r12 = 10;
    L8:
        AbstractC3997u.d r03 = r02.mutableCopyWithCapacity(r12);
        e0.O(r3, r4, r03);
        return r03;
    L7:
        r12 = r1 * 2;
        goto L8
    L10:
        return r02;
    }
}
