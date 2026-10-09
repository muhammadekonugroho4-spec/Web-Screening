package d0;

import android.os.Parcel;
import android.os.Parcelable;
import com.iab.digitalidentity.sdk.core.network.model.UnifiedKycResponse$ChallengeAdditionalSelfie;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    public d() {
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r3) {
        p.l(r3, "parcel");
        return new UnifiedKycResponse$ChallengeAdditionalSelfie(r3.readString(), r3.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new UnifiedKycResponse$ChallengeAdditionalSelfie[r1];
    }
}
