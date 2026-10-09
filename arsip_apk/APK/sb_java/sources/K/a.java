package K;

import a.AbstractC2049c;
import b.AbstractC4230a;
import b.AbstractC4231b;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f911a;

    /* renamed from: b, reason: collision with root package name */
    public final String f912b;

    /* renamed from: c, reason: collision with root package name */
    public final int f913c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final String f914e;

    /* renamed from: f, reason: collision with root package name */
    public final String f915f;

    /* renamed from: g, reason: collision with root package name */
    public final String f916g;

    /* renamed from: h, reason: collision with root package name */
    public final String f917h;

    /* renamed from: i, reason: collision with root package name */
    public final String f918i;

    public a(String r2, String r3, int r4, long r5, String r7, String r8, String r9, String r10, String r11) {
        p.l(r2, "source");
        p.l(r3, "type");
        p.l(r7, "captureMode");
        p.l(r8, "preferredCamera");
        p.l(r9, "cameraUsed");
        p.l(r10, "variantName");
        p.l(r11, "flowType");
        this.f911a = r2;
        this.f912b = r3;
        this.f913c = r4;
        this.d = r5;
        this.f914e = r7;
        this.f915f = r8;
        this.f916g = r9;
        this.f917h = r10;
        this.f918i = r11;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f911a, r82.f911a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f912b, r82.f912b) == true) goto L15;
        return false;
    L15:
        if (this.f913c == r82.f913c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (p.g(this.f914e, r82.f914e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f915f, r82.f915f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f916g, r82.f916g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f917h, r82.f917h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f918i, r82.f918i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f911a.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.f912b, r02, 31);
        int r04 = AbstractC4230a.a(-1, AbstractC4230a.a(-1, AbstractC4230a.a(this.f913c, r03, 31), 31), 31);
        int r05 = AbstractC4231b.a(this.d, r04, 31);
        int r06 = AbstractC2049c.a(this.f914e, r05, 31);
        int r07 = AbstractC2049c.a(this.f915f, r06, 31);
        int r08 = AbstractC2049c.a(this.f916g, r07, 31);
        int r09 = AbstractC2049c.a(this.f917h, r08, 31);
        return this.f918i.hashCode() + r09;
    }

    public final String toString() {
        return "GeneralDocSubmittedEventModel(source=" + this.f911a + ", type=" + this.f912b + ", retakeCount=" + this.f913c + ", originalImageSize=-1, compressedImageSize=-1, timeToCapture=" + this.d + ", captureMode=" + this.f914e + ", preferredCamera=" + this.f915f + ", cameraUsed=" + this.f916g + ", variantName=" + this.f917h + ", flowType=" + this.f918i + ")";
    }
}
