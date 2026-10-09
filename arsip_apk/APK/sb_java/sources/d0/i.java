package d0;

import android.os.Parcel;
import android.os.Parcelable;
import com.iab.digitalidentity.sdk.core.network.model.UnifiedKycResponse$ErrorDetails;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator {
    public i() {
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r2) {
        p.l(r2, "parcel");
        return new UnifiedKycResponse$ErrorDetails(r2.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new UnifiedKycResponse$ErrorDetails[r1];
    }
}
