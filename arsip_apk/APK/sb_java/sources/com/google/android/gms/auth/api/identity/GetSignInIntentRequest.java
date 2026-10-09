package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetSignInIntentRequestCreator")
/* loaded from: classes5.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = null;

    @SafeParcelable.Field(getter = "getServerClientId", id = 1)
    private final String zba;

    @SafeParcelable.Field(getter = "getHostedDomainFilter", id = 2)
    private final String zbb;

    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final String zbc;

    @SafeParcelable.Field(getter = "getNonce", id = 4)
    private final String zbd;

    @SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", id = 5)
    private final boolean zbe;

    @SafeParcelable.Field(getter = "getTheme", id = 6)
    private final int zbf;

    public static final class Builder {
        private String zba;
        private String zbb;
        private String zbc;
        private String zbd;
        private boolean zbe;
        private int zbf;

        public Builder() {
        }

        public GetSignInIntentRequest build() {
            return new GetSignInIntentRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf);
        }

        public Builder filterByHostedDomain(String r1) {
            this.zbb = r1;
            return this;
        }

        public Builder setNonce(String r1) {
            this.zbd = r1;
            return this;
        }

        @Deprecated
        public Builder setRequestVerifiedPhoneNumber(boolean r1) {
            this.zbe = r1;
            return this;
        }

        public Builder setServerClientId(String r1) {
            Preconditions.checkNotNull(r1);
            this.zba = r1;
            return this;
        }

        public final Builder zba(String r1) {
            this.zbc = r1;
            return this;
        }

        public final Builder zbb(int r1) {
            this.zbf = r1;
            return this;
        }
    }

    static {
        CREATOR = new zbk();
    }

    @SafeParcelable.Constructor
    public GetSignInIntentRequest(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) String r3, @SafeParcelable.Param(id = 4) String r4, @SafeParcelable.Param(id = 5) boolean r5, @SafeParcelable.Param(id = 6) int r6) {
        Preconditions.checkNotNull(r1);
        this.zba = r1;
        this.zbb = r2;
        this.zbc = r3;
        this.zbd = r4;
        this.zbe = r5;
        this.zbf = r6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zba(GetSignInIntentRequest r2) {
        Preconditions.checkNotNull(r2);
        Builder r02 = builder();
        r02.setServerClientId(r2.getServerClientId());
        r02.setNonce(r2.getNonce());
        r02.filterByHostedDomain(r2.getHostedDomainFilter());
        r02.setRequestVerifiedPhoneNumber(r2.zbe);
        r02.zbb(r2.zbf);
        String r22 = r2.zbc;
        if (r22 == null) goto L5;
        r02.zba(r22);
    L5:
        return r02;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof GetSignInIntentRequest) == true) goto L5;
        return false;
    L5:
        GetSignInIntentRequest r42 = (GetSignInIntentRequest) r4;
        if (Objects.equal(this.zba, r42.zba) == true) goto L8;
    L17:
        return false;
    L8:
        if (Objects.equal(this.zbd, r42.zbd) == false) goto L17;
        if (Objects.equal(this.zbb, r42.zbb) == false) goto L17;
        if (Objects.equal(Boolean.valueOf(this.zbe), Boolean.valueOf(r42.zbe)) == false) goto L17;
        if (this.zbf != r42.zbf) goto L17;
        return true;
    }

    public String getHostedDomainFilter() {
        return this.zbb;
    }

    public String getNonce() {
        return this.zbd;
    }

    public String getServerClientId() {
        return this.zba;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zba, this.zbb, this.zbd, Boolean.valueOf(this.zbe), Integer.valueOf(this.zbf)});
    }

    @Deprecated
    public boolean requestVerifiedPhoneNumber() {
        return this.zbe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, getServerClientId(), false);
        SafeParcelWriter.writeString(r4, 2, getHostedDomainFilter(), false);
        SafeParcelWriter.writeString(r4, 3, this.zbc, false);
        SafeParcelWriter.writeString(r4, 4, getNonce(), false);
        SafeParcelWriter.writeBoolean(r4, 5, requestVerifiedPhoneNumber());
        SafeParcelWriter.writeInt(r4, 6, this.zbf);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
