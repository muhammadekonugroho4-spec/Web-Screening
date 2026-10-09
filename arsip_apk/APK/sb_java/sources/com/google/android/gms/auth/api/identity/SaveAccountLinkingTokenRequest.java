package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "SaveAccountLinkingTokenRequestCreator")
/* loaded from: classes5.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = null;
    public static final String EXTRA_TOKEN = "extra_token";
    public static final String TOKEN_TYPE_AUTH_CODE = "auth_code";

    @SafeParcelable.Field(getter = "getConsentPendingIntent", id = 1)
    private final PendingIntent zba;

    @SafeParcelable.Field(getter = "getTokenType", id = 2)
    private final String zbb;

    @SafeParcelable.Field(getter = "getServiceId", id = 3)
    private final String zbc;

    @SafeParcelable.Field(getter = "getScopes", id = 4)
    private final List zbd;

    @SafeParcelable.Field(getter = "getSessionId", id = 5)
    private final String zbe;

    @SafeParcelable.Field(getter = "getTheme", id = 6)
    private final int zbf;

    public static final class Builder {
        private PendingIntent zba;
        private String zbb;
        private String zbc;
        private List zbd;
        private String zbe;
        private int zbf;

        public Builder() {
            this.zbd = new ArrayList();
        }

        public SaveAccountLinkingTokenRequest build() {
            boolean r1 = false;
            if (this.zba == null) goto L5;
            boolean r02 = true;
        L6:
            Preconditions.checkArgument(r02, "Consent PendingIntent cannot be null");
            Preconditions.checkArgument(SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE.equals(this.zbb), "Invalid tokenType");
            Preconditions.checkArgument(!TextUtils.isEmpty(this.zbc), "serviceId cannot be null or empty");
            if (this.zbd == null) goto L9;
            r1 = true;
        L9:
            Preconditions.checkArgument(r1, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf);
        L5:
            r02 = false;
            goto L6
        }

        public Builder setConsentPendingIntent(PendingIntent r1) {
            this.zba = r1;
            return this;
        }

        public Builder setScopes(List<String> r1) {
            this.zbd = r1;
            return this;
        }

        public Builder setServiceId(String r1) {
            this.zbc = r1;
            return this;
        }

        public Builder setTokenType(String r1) {
            this.zbb = r1;
            return this;
        }

        public final Builder zba(String r1) {
            this.zbe = r1;
            return this;
        }

        public final Builder zbb(int r1) {
            this.zbf = r1;
            return this;
        }
    }

    static {
        CREATOR = new zbp();
    }

    @SafeParcelable.Constructor
    public SaveAccountLinkingTokenRequest(@SafeParcelable.Param(id = 1) PendingIntent r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) String r3, @SafeParcelable.Param(id = 4) List r4, @SafeParcelable.Param(id = 5) String r5, @SafeParcelable.Param(id = 6) int r6) {
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

    public static Builder zba(SaveAccountLinkingTokenRequest r2) {
        Preconditions.checkNotNull(r2);
        Builder r02 = builder();
        r02.setScopes(r2.getScopes());
        r02.setServiceId(r2.getServiceId());
        r02.setConsentPendingIntent(r2.getConsentPendingIntent());
        r02.setTokenType(r2.getTokenType());
        r02.zbb(r2.zbf);
        String r22 = r2.zbe;
        if (TextUtils.isEmpty(r22) == true) goto L5;
        r02.zba(r22);
    L5:
        return r02;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof SaveAccountLinkingTokenRequest) == true) goto L5;
        return false;
    L5:
        SaveAccountLinkingTokenRequest r42 = (SaveAccountLinkingTokenRequest) r4;
        if (this.zbd.size() == r42.zbd.size()) goto L8;
    L22:
        return false;
    L8:
        if (this.zbd.containsAll(r42.zbd) == false) goto L22;
        if (Objects.equal(this.zba, r42.zba) == false) goto L22;
        if (Objects.equal(this.zbb, r42.zbb) == false) goto L22;
        if (Objects.equal(this.zbc, r42.zbc) == false) goto L22;
        if (Objects.equal(this.zbe, r42.zbe) == false) goto L22;
        if (this.zbf != r42.zbf) goto L22;
        return true;
    }

    public PendingIntent getConsentPendingIntent() {
        return this.zba;
    }

    public List<String> getScopes() {
        return this.zbd;
    }

    public String getServiceId() {
        return this.zbc;
    }

    public String getTokenType() {
        return this.zbb;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zba, this.zbb, this.zbc, this.zbd, this.zbe});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeParcelable(r5, 1, getConsentPendingIntent(), r6, false);
        SafeParcelWriter.writeString(r5, 2, getTokenType(), false);
        SafeParcelWriter.writeString(r5, 3, getServiceId(), false);
        SafeParcelWriter.writeStringList(r5, 4, getScopes(), false);
        SafeParcelWriter.writeString(r5, 5, this.zbe, false);
        SafeParcelWriter.writeInt(r5, 6, this.zbf);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }
}
