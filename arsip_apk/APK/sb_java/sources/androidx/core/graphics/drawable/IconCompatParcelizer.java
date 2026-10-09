package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
    }

    public static IconCompat read(VersionedParcel r3) {
        IconCompat r02 = new IconCompat();
        r02.f22868a = r3.p(r02.f22868a, 1);
        r02.f22870c = r3.j(r02.f22870c, 2);
        r02.d = r3.r(r02.d, 3);
        r02.f22871e = r3.p(r02.f22871e, 4);
        r02.f22872f = r3.p(r02.f22872f, 5);
        r02.f22873g = (ColorStateList) r3.r(r02.f22873g, 6);
        r02.f22875i = r3.t(r02.f22875i, 7);
        r02.f22876j = r3.t(r02.f22876j, 8);
        r02.u();
        return r02;
    }

    public static void write(IconCompat r3, VersionedParcel r4) {
        r4.x(true, true);
        r3.v(r4.f());
        int r1 = r3.f22868a;
        if ((-1) == r1) goto L5;
        r4.F(r1, 1);
    L5:
        byte[] r02 = r3.f22870c;
        if (r02 == null) goto L8;
        r4.B(r02, 2);
    L8:
        Parcelable r03 = r3.d;
        if (r03 == null) goto L11;
        r4.H(r03, 3);
    L11:
        int r04 = r3.f22871e;
        if (r04 == 0) goto L14;
        r4.F(r04, 4);
    L14:
        int r05 = r3.f22872f;
        if (r05 == 0) goto L17;
        r4.F(r05, 5);
    L17:
        ColorStateList r06 = r3.f22873g;
        if (r06 == null) goto L20;
        r4.H(r06, 6);
    L20:
        String r07 = r3.f22875i;
        if (r07 == null) goto L23;
        r4.J(r07, 7);
    L23:
        String r32 = r3.f22876j;
        if (r32 == null) goto L27;
        r4.J(r32, 8);
        return;
    }
}
