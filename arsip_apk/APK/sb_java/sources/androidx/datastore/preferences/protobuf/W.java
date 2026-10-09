package androidx.datastore.preferences.protobuf;

/* loaded from: classes4.dex */
public interface W {
    void a(Object r1, Writer r2);

    void b(Object r1, V r2, C3923m r3);

    boolean equals(Object r1, Object r2);

    int getSerializedSize(Object r1);

    int hashCode(Object r1);

    boolean isInitialized(Object r1);

    void makeImmutable(Object r1);

    void mergeFrom(Object r1, Object r2);

    Object newInstance();
}
