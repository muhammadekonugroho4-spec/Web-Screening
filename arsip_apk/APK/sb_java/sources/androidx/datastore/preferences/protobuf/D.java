package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.B;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class D implements C {
    public D() {
    }

    public static int a(int r3, Object r4, Object r5) {
        MapFieldLite r42 = (MapFieldLite) r4;
        B r52 = (B) r5;
        int r1 = 0;
        if (r42.isEmpty() == false) goto L5;
        return 0;
    L5:
        Iterator r43 = r42.entrySet().iterator();
    L7:
        if (r43.hasNext() == false) goto L9;
        Map.Entry r02 = (Map.Entry) r43.next();
        r1 = r1 + r52.a(r3, r02.getKey(), r02.getValue());
        goto L7
    L9:
        return r1;
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

    @Override // androidx.datastore.preferences.protobuf.C
    public Map forMapData(Object r1) {
        return (MapFieldLite) r1;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public B.a forMapMetadata(Object r1) {
        return ((B) r1).c();
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public Map forMutableMapData(Object r1) {
        return (MapFieldLite) r1;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public int getSerializedSize(int r1, Object r2, Object r3) {
        return a(r1, r2, r3);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public boolean isImmutable(Object r1) {
        return !((MapFieldLite) r1).m();
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public Object mergeFrom(Object r1, Object r2) {
        return b(r1, r2);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public Object newMapField(Object r1) {
        return MapFieldLite.g().q();
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public Object toImmutable(Object r2) {
        ((MapFieldLite) r2).o();
        return r2;
    }
}
