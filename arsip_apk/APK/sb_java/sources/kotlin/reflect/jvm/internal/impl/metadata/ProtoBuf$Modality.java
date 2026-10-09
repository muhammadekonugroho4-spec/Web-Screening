package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes3.dex */
public enum ProtoBuf$Modality extends Enum<ProtoBuf$Modality> implements h.a {
    public static final ProtoBuf$Modality ABSTRACT = null;
    public static final ProtoBuf$Modality FINAL = null;
    public static final ProtoBuf$Modality OPEN = null;
    public static final ProtoBuf$Modality SEALED = null;

    /* renamed from: a, reason: collision with root package name */
    public static h.b f178997a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ProtoBuf$Modality[] f178998b = null;
    private final int value;

    static {
        ProtoBuf$Modality r02 = new ProtoBuf$Modality("FINAL", 0, 0, 0);
        FINAL = r02;
        ProtoBuf$Modality r1 = new ProtoBuf$Modality("OPEN", 1, 1, 1);
        OPEN = r1;
        ProtoBuf$Modality r2 = new ProtoBuf$Modality("ABSTRACT", 2, 2, 2);
        ABSTRACT = r2;
        ProtoBuf$Modality r3 = new ProtoBuf$Modality("SEALED", 3, 3, 3);
        SEALED = r3;
        f178998b = new ProtoBuf$Modality[]{r02, r1, r2, r3};
        f178997a = new a();
    }

    ProtoBuf$Modality(String r1, int r2, int r3, int r4) {
        this.value = r4;
    }

    public static ProtoBuf$Modality valueOf(String r1) {
        return (ProtoBuf$Modality) Enum.valueOf(ProtoBuf$Modality.class, r1);
    }

    public static ProtoBuf$Modality[] values() {
        return (ProtoBuf$Modality[]) f178998b.clone();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$Modality valueOf(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return SEALED;
    L14:
        return ABSTRACT;
    L16:
        return OPEN;
    L18:
        return FINAL;
    }
}
