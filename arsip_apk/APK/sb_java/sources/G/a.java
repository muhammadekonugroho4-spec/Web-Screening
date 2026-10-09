package G;

import android.os.Parcel;
import android.os.Parcelable;
import com.iab.digitalidentity.sdk.challenge.confirmation.MaskedIdentityDataUiModel;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public a() {
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r4) {
        kotlin.jvm.internal.p.l(r4, "parcel");
        return new MaskedIdentityDataUiModel(r4.readString(), r4.readString(), r4.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new MaskedIdentityDataUiModel[r1];
    }
}
