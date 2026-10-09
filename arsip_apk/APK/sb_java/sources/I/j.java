package I;

import android.os.Parcel;
import android.os.Parcelable;
import com.iab.digitalidentity.sdk.consent.ConsentDataUiModel;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    public j() {
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r8) {
        kotlin.jvm.internal.p.l(r8, "parcel");
        return new ConsentDataUiModel(r8.readString(), r8.readString(), r8.readString(), r8.readString(), r8.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new ConsentDataUiModel[r1];
    }
}
