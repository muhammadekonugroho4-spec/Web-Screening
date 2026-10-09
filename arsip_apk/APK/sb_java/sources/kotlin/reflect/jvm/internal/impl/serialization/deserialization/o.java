package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f179901a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f179902b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f179903c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final String f179904e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.name.b f179905f;

    public o(Object r2, Object r3, Object r4, Object r5, String r6, kotlin.reflect.jvm.internal.impl.name.b r7) {
        kotlin.jvm.internal.p.l(r6, "filePath");
        kotlin.jvm.internal.p.l(r7, "classId");
        this.f179901a = r2;
        this.f179902b = r3;
        this.f179903c = r4;
        this.d = r5;
        this.f179904e = r6;
        this.f179905f = r7;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f179901a, r52.f179901a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f179902b, r52.f179902b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f179903c, r52.f179903c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f179904e, r52.f179904e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f179905f, r52.f179905f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f179901a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Object r2 = this.f179902b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Object r23 = this.f179903c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Object r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return ((((r06 + r1) * 31) + this.f179904e.hashCode()) * 31) + this.f179905f.hashCode();
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f179901a + ", compilerVersion=" + this.f179902b + ", languageVersion=" + this.f179903c + ", expectedVersion=" + this.d + ", filePath=" + this.f179904e + ", classId=" + this.f179905f + ')';
    }
}
