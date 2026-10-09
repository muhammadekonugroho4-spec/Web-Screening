package androidx.media;

import java.util.Arrays;

/* loaded from: classes4.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f25817a;

    /* renamed from: b, reason: collision with root package name */
    public int f25818b;

    /* renamed from: c, reason: collision with root package name */
    public int f25819c;
    public int d;

    public AudioAttributesImplBase() {
        this.f25817a = 0;
        this.f25818b = 0;
        this.f25819c = 0;
        this.d = -1;
    }

    public int a() {
        return this.f25818b;
    }

    public int b() {
        int r02 = this.f25819c;
        int r1 = c();
        if (r1 != 6) goto L6;
        r02 = r02 | 4;
    L9:
        return r02 & 273;
    L6:
        if (r1 != 7) goto L9;
        r02 = r02 | 1;
        goto L9
    }

    public int c() {
        int r02 = this.d;
        if (r02 == (-1)) goto L6;
        return r02;
    L6:
        return AudioAttributesCompat.a(false, this.f25819c, this.f25817a);
    }

    public int d() {
        return this.f25817a;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof AudioAttributesImplBase) == true) goto L5;
        return false;
    L5:
        AudioAttributesImplBase r42 = (AudioAttributesImplBase) r4;
        if (this.f25818b == r42.a()) goto L8;
    L15:
        return false;
    L8:
        if (this.f25819c != r42.b()) goto L15;
        if (this.f25817a != r42.d()) goto L15;
        if (this.d != r42.d) goto L15;
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25818b), Integer.valueOf(this.f25819c), Integer.valueOf(this.f25817a), Integer.valueOf(this.d)});
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder("AudioAttributesCompat:");
        if (this.d == (-1)) goto L5;
        r02.append(" stream=");
        r02.append(this.d);
        r02.append(" derived");
    L5:
        r02.append(" usage=");
        r02.append(AudioAttributesCompat.b(this.f25817a));
        r02.append(" content=");
        r02.append(this.f25818b);
        r02.append(" flags=0x");
        r02.append(Integer.toHexString(this.f25819c).toUpperCase());
        return r02.toString();
    }
}
