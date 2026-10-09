package android.support.v4.graphics.drawable;

import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer {
    public IconCompatParcelizer() {
    }

    public static IconCompat read(VersionedParcel r02) {
        return androidx.core.graphics.drawable.IconCompatParcelizer.read(r02);
    }

    public static void write(IconCompat r02, VersionedParcel r1) {
        androidx.core.graphics.drawable.IconCompatParcelizer.write(r02, r1);
    }
}
