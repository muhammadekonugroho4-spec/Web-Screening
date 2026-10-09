package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public enum UnsignedType extends Enum<UnsignedType> {
    public static final UnsignedType UBYTE = null;
    public static final UnsignedType UINT = null;
    public static final UnsignedType ULONG = null;
    public static final UnsignedType USHORT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UnsignedType[] f177769a = null;
    private final kotlin.reflect.jvm.internal.impl.name.b arrayClassId;
    private final kotlin.reflect.jvm.internal.impl.name.b classId;
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    static {
        kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UByte");
        p.k(r1, "fromString(\"kotlin/UByte\")");
        UBYTE = new UnsignedType("UBYTE", 0, r1);
        kotlin.reflect.jvm.internal.impl.name.b r12 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UShort");
        p.k(r12, "fromString(\"kotlin/UShort\")");
        USHORT = new UnsignedType("USHORT", 1, r12);
        kotlin.reflect.jvm.internal.impl.name.b r13 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UInt");
        p.k(r13, "fromString(\"kotlin/UInt\")");
        UINT = new UnsignedType("UINT", 2, r13);
        kotlin.reflect.jvm.internal.impl.name.b r14 = kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/ULong");
        p.k(r14, "fromString(\"kotlin/ULong\")");
        ULONG = new UnsignedType("ULONG", 3, r14);
        f177769a = a();
    }

    UnsignedType(String r2, int r3, kotlin.reflect.jvm.internal.impl.name.b r4) {
        this.classId = r4;
        kotlin.reflect.jvm.internal.impl.name.f r22 = r4.j();
        p.k(r22, "classId.shortClassName");
        this.typeName = r22;
        this.arrayClassId = new kotlin.reflect.jvm.internal.impl.name.b(r4.h(), kotlin.reflect.jvm.internal.impl.name.f.g(r22.b() + "Array"));
    }

    public static final /* synthetic */ UnsignedType[] a() {
        return new UnsignedType[]{UBYTE, USHORT, UINT, ULONG};
    }

    public static UnsignedType valueOf(String r1) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, r1);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) f177769a.clone();
    }

    public final kotlin.reflect.jvm.internal.impl.name.b getArrayClassId() {
        return this.arrayClassId;
    }

    public final kotlin.reflect.jvm.internal.impl.name.b getClassId() {
        return this.classId;
    }

    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
