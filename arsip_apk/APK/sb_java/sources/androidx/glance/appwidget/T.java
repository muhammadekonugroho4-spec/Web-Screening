package androidx.glance.appwidget;

import androidx.glance.appwidget.proto.LayoutProto$DimensionType;
import androidx.glance.unit.d;

/* loaded from: classes4.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public static final T f24884a = null;

    static {
        f24884a = new T();
    }

    public T() {
    }

    public final LayoutProto$DimensionType a(androidx.glance.unit.d r1) {
        if ((r1 instanceof d.b) == false) goto L7;
        return LayoutProto$DimensionType.EXPAND;
    L7:
        return LayoutProto$DimensionType.WRAP;
    }
}
