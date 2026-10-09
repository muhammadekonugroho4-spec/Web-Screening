package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.S;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f179862a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtoBuf$Class f179863b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f179864c;
    public final S d;

    public e(kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r2, ProtoBuf$Class r3, kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r4, S r5) {
        kotlin.jvm.internal.p.l(r2, "nameResolver");
        kotlin.jvm.internal.p.l(r3, "classProto");
        kotlin.jvm.internal.p.l(r4, "metadataVersion");
        kotlin.jvm.internal.p.l(r5, "sourceElement");
        this.f179862a = r2;
        this.f179863b = r3;
        this.f179864c = r4;
        this.d = r5;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c a() {
        return this.f179862a;
    }

    public final ProtoBuf$Class b() {
        return this.f179863b;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c() {
        return this.f179864c;
    }

    public final S d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f179862a, r52.f179862a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f179863b, r52.f179863b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f179864c, r52.f179864c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f179862a.hashCode() * 31) + this.f179863b.hashCode()) * 31) + this.f179864c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f179862a + ", classProto=" + this.f179863b + ", metadataVersion=" + this.f179864c + ", sourceElement=" + this.d + ')';
    }
}
