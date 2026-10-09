package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes4.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f25815a;

    /* renamed from: b, reason: collision with root package name */
    public int f25816b;

    public AudioAttributesImplApi21() {
        this.f25816b = -1;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof AudioAttributesImplApi21) == true) goto L7;
        return false;
    L7:
        return this.f25815a.equals(((AudioAttributesImplApi21) r2).f25815a);
    }

    public int hashCode() {
        return this.f25815a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f25815a;
    }
}
