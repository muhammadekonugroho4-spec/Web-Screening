package T;

import android.os.Parcel;
import android.os.Parcelable;
import com.iab.digitalidentity.sdk.core.constants.RetryScreenConfig;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    public n() {
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r2) {
        kotlin.jvm.internal.p.l(r2, "parcel");
        if (r2.readInt() == 0) goto L5;
        boolean r22 = true;
    L7:
        return new RetryScreenConfig(r22);
    L5:
        r22 = false;
        goto L7
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new RetryScreenConfig[r1];
    }
}
