package d0;

import android.os.Parcel;
import android.os.Parcelable;
import com.iab.digitalidentity.sdk.core.network.model.KycSdkErrorResponse;
import kotlin.jvm.internal.p;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11370a implements Parcelable.Creator {
    public C11370a() {
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r8) {
        p.l(r8, "parcel");
        return new KycSdkErrorResponse(r8.readString(), r8.readString(), r8.readString(), r8.readString(), r8.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new KycSdkErrorResponse[r1];
    }
}
