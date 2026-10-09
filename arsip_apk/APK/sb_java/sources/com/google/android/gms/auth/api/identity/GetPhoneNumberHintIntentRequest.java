package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetPhoneNumberHintIntentRequestCreator")
/* loaded from: classes5.dex */
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = null;

    @SafeParcelable.Field(getter = "getTheme", id = 1)
    private final int zba;

    public static final class Builder {
        private Builder() {
        }

        public GetPhoneNumberHintIntentRequest build() {
            return new GetPhoneNumberHintIntentRequest(0);
        }

        public /* synthetic */ Builder(zbi r1) {
        }
    }

    static {
        CREATOR = new zbj();
    }

    @SafeParcelable.Constructor
    public GetPhoneNumberHintIntentRequest(@SafeParcelable.Param(id = 1) int r1) {
        this.zba = r1;
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof GetPhoneNumberHintIntentRequest) == true) goto L7;
        return false;
    L7:
        return Objects.equal(Integer.valueOf(this.zba), Integer.valueOf(((GetPhoneNumberHintIntentRequest) r2).zba));
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zba)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeInt(r3, 1, this.zba);
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
