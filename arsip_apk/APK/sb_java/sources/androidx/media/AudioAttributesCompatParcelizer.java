package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes4.dex */
public final class AudioAttributesCompatParcelizer {
    public AudioAttributesCompatParcelizer() {
    }

    public static AudioAttributesCompat read(VersionedParcel r3) {
        AudioAttributesCompat r02 = new AudioAttributesCompat();
        r02.f25814a = (AudioAttributesImpl) r3.v(r02.f25814a, 1);
        return r02;
    }

    public static void write(AudioAttributesCompat r1, VersionedParcel r2) {
        r2.x(false, false);
        r2.M(r1.f25814a, 1);
    }
}
