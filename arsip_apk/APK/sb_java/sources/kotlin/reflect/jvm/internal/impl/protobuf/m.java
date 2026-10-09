package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes3.dex */
public interface m extends n {

    public interface a extends Cloneable, n {
        a B(e r1, f r2);

        m build();
    }

    void a(CodedOutputStream r1);

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}
