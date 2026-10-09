package d0;

import android.os.Parcel;
import android.os.Parcelable;
import com.iab.digitalidentity.sdk.core.network.model.UrlMappingData;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    public k() {
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r4) {
        p.l(r4, "parcel");
        return new UrlMappingData(r4.readString(), r4.readString(), r4.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new UrlMappingData[r1];
    }
}
