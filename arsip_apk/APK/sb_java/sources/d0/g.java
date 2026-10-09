package d0;

import android.os.Parcel;
import android.os.Parcelable;
import com.iab.digitalidentity.sdk.core.network.model.UnifiedKycResponse$Choice;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    public g() {
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r4) {
        p.l(r4, "parcel");
        return new UnifiedKycResponse$Choice(r4.readString(), r4.readString(), r4.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new UnifiedKycResponse$Choice[r1];
    }
}
