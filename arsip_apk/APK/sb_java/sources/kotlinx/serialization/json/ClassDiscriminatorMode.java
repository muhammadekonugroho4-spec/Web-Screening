package kotlinx.serialization.json;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/ClassDiscriminatorMode;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ALL_JSON_OBJECTS", "POLYMORPHIC", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum ClassDiscriminatorMode extends Enum<ClassDiscriminatorMode> {
    public static final ClassDiscriminatorMode ALL_JSON_OBJECTS = null;
    public static final ClassDiscriminatorMode NONE = null;
    public static final ClassDiscriminatorMode POLYMORPHIC = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ClassDiscriminatorMode[] f180750a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f180751b = null;

    static {
        NONE = new ClassDiscriminatorMode("NONE", 0);
        ALL_JSON_OBJECTS = new ClassDiscriminatorMode("ALL_JSON_OBJECTS", 1);
        POLYMORPHIC = new ClassDiscriminatorMode("POLYMORPHIC", 2);
        ClassDiscriminatorMode[] r02 = a();
        f180750a = r02;
        f180751b = kotlin.enums.b.a(r02);
    }

    ClassDiscriminatorMode(String r1, int r2) {
    }

    public static final /* synthetic */ ClassDiscriminatorMode[] a() {
        return new ClassDiscriminatorMode[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    public static kotlin.enums.a getEntries() {
        return f180751b;
    }

    public static ClassDiscriminatorMode valueOf(String r1) {
        return (ClassDiscriminatorMode) Enum.valueOf(ClassDiscriminatorMode.class, r1);
    }

    public static ClassDiscriminatorMode[] values() {
        return (ClassDiscriminatorMode[]) f180750a.clone();
    }
}
