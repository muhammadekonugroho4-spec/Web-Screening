package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public enum UnsignedArrayType extends Enum<UnsignedArrayType> {
    public static final UnsignedArrayType UBYTEARRAY = null;
    public static final UnsignedArrayType UINTARRAY = null;
    public static final UnsignedArrayType ULONGARRAY = null;
    public static final UnsignedArrayType USHORTARRAY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UnsignedArrayType[] f177768a = null;
    private final kotlin.reflect.jvm.internal.impl.name.b classId;
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    static {
        kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UByteArray");
        p.k(r1, "fromString(\"kotlin/UByteArray\")");
        UBYTEARRAY = new UnsignedArrayType("UBYTEARRAY", 0, r1);
        kotlin.reflect.jvm.internal.impl.name.b r12 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UShortArray");
        p.k(r12, "fromString(\"kotlin/UShortArray\")");
        USHORTARRAY = new UnsignedArrayType("USHORTARRAY", 1, r12);
        kotlin.reflect.jvm.internal.impl.name.b r13 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UIntArray");
        p.k(r13, "fromString(\"kotlin/UIntArray\")");
        UINTARRAY = new UnsignedArrayType("UINTARRAY", 2, r13);
        kotlin.reflect.jvm.internal.impl.name.b r14 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/ULongArray");
        p.k(r14, "fromString(\"kotlin/ULongArray\")");
        ULONGARRAY = new UnsignedArrayType("ULONGARRAY", 3, r14);
        f177768a = a();
    }

    UnsignedArrayType(String r1, int r2, kotlin.reflect.jvm.internal.impl.name.b r3) {
        this.classId = r3;
        kotlin.reflect.jvm.internal.impl.name.f r12 = r3.j();
        p.k(r12, "classId.shortClassName");
        this.typeName = r12;
    }

    public static final /* synthetic */ UnsignedArrayType[] a() {
        return new UnsignedArrayType[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    public static UnsignedArrayType valueOf(String r1) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, r1);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) f177768a.clone();
    }

    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
