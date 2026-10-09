package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.B;
import java.util.Map;

/* loaded from: classes4.dex */
public interface C {
    Map forMapData(Object r1);

    B.a forMapMetadata(Object r1);

    Map forMutableMapData(Object r1);

    int getSerializedSize(int r1, Object r2, Object r3);

    boolean isImmutable(Object r1);

    Object mergeFrom(Object r1, Object r2);

    Object newMapField(Object r1);

    Object toImmutable(Object r1);
}
