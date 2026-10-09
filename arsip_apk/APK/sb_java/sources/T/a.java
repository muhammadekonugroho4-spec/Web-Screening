package T;

import android.os.Parcel;
import android.os.Parcelable;
import com.iab.digitalidentity.sdk.core.constants.ButtonConfig;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public a() {
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r3) {
        kotlin.jvm.internal.p.l(r3, "parcel");
        return new ButtonConfig(r3.readString(), r3.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new ButtonConfig[r1];
    }
}
