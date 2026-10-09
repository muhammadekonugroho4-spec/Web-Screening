package kotlinx.serialization.json;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* renamed from: kotlinx.serialization.json.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11971f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f180784a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f180785b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f180786c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f180787e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f180788f;

    /* renamed from: g, reason: collision with root package name */
    public final String f180789g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f180790h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f180791i;

    /* renamed from: j, reason: collision with root package name */
    public final String f180792j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f180793k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f180794l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f180795m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f180796n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f180797o;

    /* renamed from: p, reason: collision with root package name */
    public ClassDiscriminatorMode f180798p;

    public C11971f(boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, String r9, boolean r10, boolean r11, String r12, boolean r13, boolean r14, y r15, boolean r16, boolean r17, boolean r18, ClassDiscriminatorMode r19) {
        kotlin.jvm.internal.p.l(r9, "prettyPrintIndent");
        kotlin.jvm.internal.p.l(r12, "classDiscriminator");
        kotlin.jvm.internal.p.l(r19, "classDiscriminatorMode");
        this.f180784a = r3;
        this.f180785b = r4;
        this.f180786c = r5;
        this.d = r6;
        this.f180787e = r7;
        this.f180788f = r8;
        this.f180789g = r9;
        this.f180790h = r10;
        this.f180791i = r11;
        this.f180792j = r12;
        this.f180793k = r13;
        this.f180794l = r14;
        this.f180795m = r16;
        this.f180796n = r17;
        this.f180797o = r18;
        this.f180798p = r19;
    }

    public final boolean a() {
        return this.f180797o;
    }

    public final boolean b() {
        return this.f180793k;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f180796n;
    }

    public final String e() {
        return this.f180792j;
    }

    public final ClassDiscriminatorMode f() {
        return this.f180798p;
    }

    public final boolean g() {
        return this.f180790h;
    }

    public final boolean h() {
        return this.f180795m;
    }

    public final boolean i() {
        return this.f180784a;
    }

    public final boolean j() {
        return this.f180788f;
    }

    public final boolean k() {
        return this.f180785b;
    }

    public final y l() {
        return null;
    }

    public final boolean m() {
        return this.f180787e;
    }

    public final String n() {
        return this.f180789g;
    }

    public final boolean o() {
        return this.f180794l;
    }

    public final boolean p() {
        return this.f180791i;
    }

    public final boolean q() {
        return this.f180786c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f180784a + ", ignoreUnknownKeys=" + this.f180785b + ", isLenient=" + this.f180786c + ", allowStructuredMapKeys=" + this.d + ", prettyPrint=" + this.f180787e + ", explicitNulls=" + this.f180788f + ", prettyPrintIndent='" + this.f180789g + "', coerceInputValues=" + this.f180790h + ", useArrayPolymorphism=" + this.f180791i + ", classDiscriminator='" + this.f180792j + "', allowSpecialFloatingPointValues=" + this.f180793k + ", useAlternativeNames=" + this.f180794l + ", namingStrategy=null, decodeEnumsCaseInsensitive=" + this.f180795m + ", allowTrailingComma=" + this.f180796n + ", allowComments=" + this.f180797o + ", classDiscriminatorMode=" + this.f180798p + ')';
    }

    public /* synthetic */ C11971f(boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, String r25, boolean r26, boolean r27, String r28, boolean r29, boolean r30, y r31, boolean r32, boolean r33, boolean r34, ClassDiscriminatorMode r35, int r36, kotlin.jvm.internal.i r37) {
        if ((r36 & 1) == 0) goto L5;
        boolean r1 = false;
    L7:
        if ((r36 & 2) == 0) goto L9;
        boolean r3 = false;
    L11:
        if ((r36 & 4) == 0) goto L13;
        boolean r4 = false;
    L15:
        if ((r36 & 8) == 0) goto L17;
        boolean r5 = false;
    L19:
        if ((r36 & 16) == 0) goto L21;
        boolean r6 = false;
    L22:
        boolean r8 = true;
        if ((r36 & 32) == 0) goto L25;
        boolean r7 = true;
    L27:
        if ((r36 & 64) == 0) goto L29;
        String r9 = "    ";
    L31:
        if ((r36 & 128) == 0) goto L33;
        boolean r10 = false;
    L35:
        if ((r36 & 256) == 0) goto L37;
        boolean r11 = false;
    L39:
        if ((r36 & 512) == 0) goto L41;
        String r12 = "type";
    L43:
        if ((r36 & 1024) == 0) goto L45;
        boolean r13 = false;
    L47:
        if ((r36 & 2048) != 0) goto L51;
        r8 = r30;
    L51:
        if ((r36 & 4096) == 0) goto L53;
        y r14 = null;
    L55:
        if ((r36 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        boolean r15 = false;
    L59:
        if ((r36 & 16384) == 0) goto L61;
        boolean r2 = false;
    L63:
        if ((r36 & 32768) == 0) goto L65;
        boolean r16 = false;
    L67:
        if ((r36 & 65536) == 0) goto L70;
        ClassDiscriminatorMode r362 = ClassDiscriminatorMode.POLYMORPHIC;
    L71:
        this(r1, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r8, r14, r15, r2, r16, r362);
        return;
    L70:
        r362 = r35;
        goto L71
    L65:
        r16 = r34;
        goto L67
    L61:
        r2 = r33;
        goto L63
    L57:
        r15 = r32;
        goto L59
    L53:
        r14 = r31;
        goto L55
    L45:
        r13 = r29;
        goto L47
    L41:
        r12 = r28;
        goto L43
    L37:
        r11 = r27;
        goto L39
    L33:
        r10 = r26;
        goto L35
    L29:
        r9 = r25;
        goto L31
    L25:
        r7 = r24;
        goto L27
    L21:
        r6 = r23;
        goto L22
    L17:
        r5 = r22;
        goto L19
    L13:
        r4 = r21;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }
}
