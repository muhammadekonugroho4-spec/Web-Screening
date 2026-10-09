package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes4.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public AudioAttributesImplApi21Parcelizer() {
    }

    public static AudioAttributesImplApi21 read(VersionedParcel r3) {
        AudioAttributesImplApi21 r02 = new AudioAttributesImplApi21();
        r02.f25815a = (AudioAttributes) r3.r(r02.f25815a, 1);
        r02.f25816b = r3.p(r02.f25816b, 2);
        return r02;
    }

    public static void write(AudioAttributesImplApi21 r2, VersionedParcel r3) {
        r3.x(false, false);
        r3.H(r2.f25815a, 1);
        r3.F(r2.f25816b, 2);
    }
}
