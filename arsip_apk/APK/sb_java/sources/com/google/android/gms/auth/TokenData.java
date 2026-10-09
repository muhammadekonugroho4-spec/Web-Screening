package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@ShowFirstParty
@SafeParcelable.Class(creator = "TokenDataCreator")
/* loaded from: classes5.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getToken", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 3)
    private final Long zzc;

    @SafeParcelable.Field(getter = "isCached", id = 4)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "isSnowballed", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getGrantedScopes", id = 6)
    private final List zzf;

    @SafeParcelable.Field(getter = "getScopeData", id = 7)
    private final String zzg;

    static {
        CREATOR = new zzm();
    }

    @SafeParcelable.Constructor
    public TokenData(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) Long r3, @SafeParcelable.Param(id = 4) boolean r4, @SafeParcelable.Param(id = 5) boolean r5, @SafeParcelable.Param(id = 6) List r6, @SafeParcelable.Param(id = 7) String r7) {
        this.zza = r1;
        this.zzb = Preconditions.checkNotEmpty(r2);
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        this.zzf = r6;
        this.zzg = r7;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof TokenData) == true) goto L5;
        return false;
    L5:
        TokenData r42 = (TokenData) r4;
        if (TextUtils.equals(this.zzb, r42.zzb) == true) goto L8;
    L19:
        return false;
    L8:
        if (Objects.equal(this.zzc, r42.zzc) == false) goto L19;
        if (this.zzd != r42.zzd) goto L19;
        if (this.zze != r42.zze) goto L19;
        if (Objects.equal(this.zzf, r42.zzf) == false) goto L19;
        if (Objects.equal(this.zzg, r42.zzg) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzb, this.zzc, Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, this.zzg});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zza);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.writeLongObject(r4, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(r4, 4, this.zzd);
        SafeParcelWriter.writeBoolean(r4, 5, this.zze);
        SafeParcelWriter.writeStringList(r4, 6, this.zzf, false);
        SafeParcelWriter.writeString(r4, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final String zza() {
        return this.zzb;
    }
}
