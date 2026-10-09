package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes4.dex */
public final class AudioAttributesImplBaseParcelizer {
    public AudioAttributesImplBaseParcelizer() {
    }

    public static AudioAttributesImplBase read(VersionedParcel r3) {
        AudioAttributesImplBase r02 = new AudioAttributesImplBase();
        r02.f25817a = r3.p(r02.f25817a, 1);
        r02.f25818b = r3.p(r02.f25818b, 2);
        r02.f25819c = r3.p(r02.f25819c, 3);
        r02.d = r3.p(r02.d, 4);
        return r02;
    }

    public static void write(AudioAttributesImplBase r2, VersionedParcel r3) {
        r3.x(false, false);
        r3.F(r2.f25817a, 1);
        r3.F(r2.f25818b, 2);
        r3.F(r2.f25819c, 3);
        r3.F(r2.d, 4);
    }
}
