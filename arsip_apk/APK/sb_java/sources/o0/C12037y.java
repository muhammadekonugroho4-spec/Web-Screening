package o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.iab.digitalidentity.sdk.identityscan.OneKycIdentityScanFailureDetails;

/* renamed from: o0.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12037y implements Parcelable.Creator {
    public C12037y() {
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r10) {
        kotlin.jvm.internal.p.l(r10, "parcel");
        String r2 = r10.readString();
        String r3 = r10.readString();
        String r4 = r10.readString();
        if (r10.readInt() == 0) goto L6;
        boolean r02 = true;
    L5:
        boolean r5 = r02;
        if (r10.readInt() != 0) goto L11;
        Integer r03 = null;
    L10:
        Integer r6 = r03;
        return new OneKycIdentityScanFailureDetails(r2, r3, r4, r5, r6, r10.readString(), r10.readString());
    L11:
        r03 = Integer.valueOf(r10.readInt());
        goto L10
    L6:
        r02 = false;
        goto L5
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new OneKycIdentityScanFailureDetails[r1];
    }
}
