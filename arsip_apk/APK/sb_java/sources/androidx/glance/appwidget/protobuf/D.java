package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.B;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class D implements C {
    public D() {
    }

    public static int a(int r02, Object r1, Object r2) {
        MapFieldLite r12 = (MapFieldLite) r1;
        a.a.a.a.c.f.a(r2);
        if (r12.isEmpty() == false) goto L5;
        return 0;
    L5:
        Iterator r03 = r12.entrySet().iterator();
        if (r03.hasNext() == true) goto L8;
        return 0;
    L8:
        Map.Entry r04 = (Map.Entry) r03.next();
        r04.getKey();
        r04.getValue();
        throw null;
    }

    public static MapFieldLite b(Object r1, Object r2) {
        MapFieldLite r12 = (MapFieldLite) r1;
        MapFieldLite r22 = (MapFieldLite) r2;
        if (r22.isEmpty() == false) goto L5;
    L8:
        return r12;
    L5:
        if (r12.m() == true) goto L7;
        r12 = r12.q();
    L7:
        r12.p(r22);
        goto L8
    }

    @Override // androidx.glance.appwidget.protobuf.C
    public Map forMapData(Object r1) {
        return (MapFieldLite) r1;
    }

    @Override // androidx.glance.appwidget.protobuf.C
    public B.a forMapMetadata(Object r1) {
        a.a.a.a.c.f.a(r1);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.C
    public Map forMutableMapData(Object r1) {
        return (MapFieldLite) r1;
    }

    @Override // androidx.glance.appwidget.protobuf.C
    public int getSerializedSize(int r1, Object r2, Object r3) {
        return a(r1, r2, r3);
    }

    @Override // androidx.glance.appwidget.protobuf.C
    public boolean isImmutable(Object r1) {
        return !((MapFieldLite) r1).m();
    }

    @Override // androidx.glance.appwidget.protobuf.C
    public Object mergeFrom(Object r1, Object r2) {
        return b(r1, r2);
    }

    @Override // androidx.glance.appwidget.protobuf.C
    public Object newMapField(Object r1) {
        return MapFieldLite.g().q();
    }

    @Override // androidx.glance.appwidget.protobuf.C
    public Object toImmutable(Object r2) {
        ((MapFieldLite) r2).o();
        return r2;
    }
}
