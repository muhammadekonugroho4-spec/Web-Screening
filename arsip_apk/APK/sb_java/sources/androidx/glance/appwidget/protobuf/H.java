package androidx.glance.appwidget.protobuf;

/* loaded from: classes4.dex */
public interface H extends I {

    public interface a extends I, Cloneable {
        H buildPartial();
    }

    void a(CodedOutputStream r1);

    int getSerializedSize();

    a newBuilderForType();
}
