package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "IdTokenCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
/* loaded from: classes5.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = null;

    @SafeParcelable.Field(getter = "getAccountType", id = 1)
    private final String zba;

    @SafeParcelable.Field(getter = "getIdToken", id = 2)
    private final String zbb;

    static {
        CREATOR = new zbf();
    }

    @SafeParcelable.Constructor
    public IdToken(@SafeParcelable.Param(id = 1) String r3, @SafeParcelable.Param(id = 2) String r4) {
        Preconditions.checkArgument(!TextUtils.isEmpty(r3), "account type string cannot be null or empty");
        Preconditions.checkArgument(!TextUtils.isEmpty(r4), "id token string cannot be null or empty");
        this.zba = r3;
        this.zbb = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof IdToken) == true) goto L8;
        return false;
    L8:
        IdToken r52 = (IdToken) r5;
        if (Objects.equal(this.zba, r52.zba) == true) goto L11;
    L13:
        return false;
    L11:
        if (Objects.equal(this.zbb, r52.zbb) == false) goto L13;
        return true;
    }

    public String getAccountType() {
        return this.zba;
    }

    public String getIdToken() {
        return this.zbb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, getAccountType(), false);
        SafeParcelWriter.writeString(r4, 2, getIdToken(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
