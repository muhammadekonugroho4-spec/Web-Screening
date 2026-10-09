package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AccountChangeEventsRequestCreator")
/* loaded from: classes5.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    int zzb;

    @SafeParcelable.Field(id = 3)
    @Deprecated
    String zzc;

    @SafeParcelable.Field(id = 4)
    Account zzd;

    static {
        CREATOR = new zzb();
    }

    public AccountChangeEventsRequest() {
        this.zza = 1;
    }

    public Account getAccount() {
        return this.zzd;
    }

    @Deprecated
    public String getAccountName() {
        return this.zzc;
    }

    public int getEventIndex() {
        return this.zzb;
    }

    public AccountChangeEventsRequest setAccount(Account r1) {
        this.zzd = r1;
        return this;
    }

    @Deprecated
    public AccountChangeEventsRequest setAccountName(String r1) {
        this.zzc = r1;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int r1) {
        this.zzb = r1;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeInt(r5, 1, this.zza);
        SafeParcelWriter.writeInt(r5, 2, this.zzb);
        SafeParcelWriter.writeString(r5, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(r5, 4, this.zzd, r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }

    @SafeParcelable.Constructor
    public AccountChangeEventsRequest(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2, @SafeParcelable.Param(id = 3) String r3, @SafeParcelable.Param(id = 4) Account r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        if (r4 == null) goto L5;
    L8:
        this.zzd = r4;
        return;
    L5:
        if (TextUtils.isEmpty(r3) == true) goto L8;
        this.zzd = new Account(r3, "com.google");
    }
}
