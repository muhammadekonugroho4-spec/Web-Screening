package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C2337a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
/* loaded from: classes5.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = null;
    private static final C2337a zzb = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", id = 2)
    private List zzc;

    @SafeParcelable.Field(getter = "getInProgressAccountTypes", id = 3)
    private List zzd;

    @SafeParcelable.Field(getter = "getSuccessAccountTypes", id = 4)
    private List zze;

    @SafeParcelable.Field(getter = "getFailedAccountTypes", id = 5)
    private List zzf;

    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", id = 6)
    private List zzg;

    static {
        CREATOR = new zzt();
        C2337a r02 = new C2337a();
        zzb = r02;
        r02.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        r02.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        r02.put("success", FastJsonResponse.Field.forStrings("success", 4));
        r02.put(TransactionResult.STATUS_FAILED, FastJsonResponse.Field.forStrings(TransactionResult.STATUS_FAILED, 5));
        r02.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzs() {
        this.zza = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return zzb;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field r4) {
        switch(r4.getSafeParcelableFieldId()) {
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            default: goto L5;
        };
    L5:
        throw new IllegalStateException("Unknown SafeParcelable id=" + r4.getSafeParcelableFieldId());
    L7:
        return this.zzg;
    L9:
        return this.zzf;
    L11:
        return this.zze;
    L13:
        return this.zzd;
    L15:
        return this.zzc;
    L17:
        return Integer.valueOf(this.zza);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field r1) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field r1, String r2, ArrayList r3) {
        int r12 = r1.getSafeParcelableFieldId();
        if (r12 != 2) goto L5;
        this.zzc = r3;
        return;
    L5:
        if (r12 != 3) goto L7;
        this.zzd = r3;
        return;
    L7:
        if (r12 != 4) goto L9;
        this.zze = r3;
        return;
    L9:
        if (r12 != 5) goto L11;
        this.zzf = r3;
        return;
    L11:
        if (r12 != 6) goto L15;
        this.zzg = r3;
        return;
    L15:
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(r12)}));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zza);
        SafeParcelWriter.writeStringList(r4, 2, this.zzc, false);
        SafeParcelWriter.writeStringList(r4, 3, this.zzd, false);
        SafeParcelWriter.writeStringList(r4, 4, this.zze, false);
        SafeParcelWriter.writeStringList(r4, 5, this.zzf, false);
        SafeParcelWriter.writeStringList(r4, 6, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) List r2, @SafeParcelable.Param(id = 3) List r3, @SafeParcelable.Param(id = 4) List r4, @SafeParcelable.Param(id = 5) List r5, @SafeParcelable.Param(id = 6) List r6) {
        this.zza = r1;
        this.zzc = r2;
        this.zzd = r3;
        this.zze = r4;
        this.zzf = r5;
        this.zzg = r6;
    }
}
