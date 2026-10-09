package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "AuthenticationExtensionsCredPropsOutputsCreator")
/* loaded from: classes5.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = null;

    @SafeParcelable.Field(getter = "getIsDiscoverableCredential", id = 1)
    private final boolean zza;

    static {
        CREATOR = new zze();
    }

    @SafeParcelable.Constructor
    public AuthenticationExtensionsCredPropsOutputs(@SafeParcelable.Param(id = 1) boolean r1) {
        this.zza = r1;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof AuthenticationExtensionsCredPropsOutputs) == true) goto L6;
        return false;
    L6:
        if (this.zza != ((AuthenticationExtensionsCredPropsOutputs) r3).zza) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean getIsDiscoverableCredential() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeBoolean(r3, 1, getIsDiscoverableCredential());
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }

    public final JSONObject zza() {
        JSONObject r02 = new JSONObject();     // Catch: JSONException -> L4
        r02.put("rk", this.zza);     // Catch: JSONException -> L4
        return r02;
    L4:
        e = move-exception;
        throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
    }
}
