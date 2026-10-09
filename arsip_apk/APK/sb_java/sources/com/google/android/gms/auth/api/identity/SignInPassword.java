package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInPasswordCreator")
/* loaded from: classes5.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = null;

    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String zba;

    @SafeParcelable.Field(getter = "getPassword", id = 2)
    private final String zbb;

    static {
        CREATOR = new zbv();
    }

    @SafeParcelable.Constructor
    public SignInPassword(@SafeParcelable.Param(id = 1) String r2, @SafeParcelable.Param(id = 2) String r3) {
        this.zba = Preconditions.checkNotEmpty(((String) Preconditions.checkNotNull(r2, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.zbb = Preconditions.checkNotEmpty(r3);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof SignInPassword) == true) goto L5;
        return false;
    L5:
        SignInPassword r42 = (SignInPassword) r4;
        if (Objects.equal(this.zba, r42.zba) == true) goto L8;
    L11:
        return false;
    L8:
        if (Objects.equal(this.zbb, r42.zbb) == false) goto L11;
        return true;
    }

    public String getId() {
        return this.zba;
    }

    public String getPassword() {
        return this.zbb;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zba, this.zbb});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, getId(), false);
        SafeParcelWriter.writeString(r4, 2, getPassword(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
