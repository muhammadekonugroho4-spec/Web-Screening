package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.stats.CodePackage;

/* loaded from: classes3.dex */
public enum TypeUsage extends Enum<TypeUsage> {
    public static final TypeUsage COMMON = null;
    public static final TypeUsage SUPERTYPE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TypeUsage[] f180028a = null;

    static {
        SUPERTYPE = new TypeUsage("SUPERTYPE", 0);
        COMMON = new TypeUsage(CodePackage.COMMON, 1);
        f180028a = a();
    }

    TypeUsage(String r1, int r2) {
    }

    public static final /* synthetic */ TypeUsage[] a() {
        return new TypeUsage[]{SUPERTYPE, COMMON};
    }

    public static TypeUsage valueOf(String r1) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, r1);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) f180028a.clone();
    }
}
