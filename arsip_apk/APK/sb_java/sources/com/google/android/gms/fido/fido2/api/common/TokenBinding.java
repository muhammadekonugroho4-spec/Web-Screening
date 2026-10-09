package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "TokenBindingCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class TokenBinding extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenBinding> CREATOR = null;
    public static final TokenBinding NOT_SUPPORTED = null;
    public static final TokenBinding SUPPORTED = null;

    @SafeParcelable.Field(getter = "getTokenBindingStatusAsString", id = 2, type = "java.lang.String")
    private final TokenBindingStatus zza;

    @SafeParcelable.Field(getter = "getTokenBindingId", id = 3)
    private final String zzb;

    public enum TokenBindingStatus extends Enum<TokenBindingStatus> implements Parcelable {
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = null;
        public static final TokenBindingStatus NOT_SUPPORTED = null;
        public static final TokenBindingStatus PRESENT = null;
        public static final TokenBindingStatus SUPPORTED = null;
        private static final /* synthetic */ TokenBindingStatus[] zza = null;
        private final String zzb;

        static {
            TokenBindingStatus r02 = new TokenBindingStatus("PRESENT", 0, "present");
            PRESENT = r02;
            TokenBindingStatus r1 = new TokenBindingStatus("SUPPORTED", 1, "supported");
            SUPPORTED = r1;
            TokenBindingStatus r2 = new TokenBindingStatus("NOT_SUPPORTED", 2, "not-supported");
            NOT_SUPPORTED = r2;
            zza = new TokenBindingStatus[]{r02, r1, r2};
            CREATOR = new zzat();
        }

        TokenBindingStatus(String r1, int r2, String r3) {
            this.zzb = r3;
        }

        public static TokenBindingStatus fromString(String r5) throws UnsupportedTokenBindingStatusException {
            TokenBindingStatus[] r02 = values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L9;
            TokenBindingStatus r3 = r02[r2];
            if (r5.equals(r3.zzb) == true) goto L6;
            r2 = r2 + 1;
            goto L3
        L6:
            return r3;
        L9:
            throw new UnsupportedTokenBindingStatusException(r5);
        }

        public static TokenBindingStatus valueOf(String r1) {
            return (TokenBindingStatus) Enum.valueOf(TokenBindingStatus.class, r1);
        }

        public static TokenBindingStatus[] values() {
            return (TokenBindingStatus[]) zza.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.zzb;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel r1, int r2) {
            r1.writeString(this.zzb);
        }
    }

    public static class UnsupportedTokenBindingStatusException extends Exception {
        public UnsupportedTokenBindingStatusException(String r2) {
            super(String.format("TokenBindingStatus %s not supported", new Object[]{r2}));
        }
    }

    static {
        CREATOR = new zzau();
        SUPPORTED = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);
        NOT_SUPPORTED = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);
    }

    public TokenBinding(String r2) {
        this(TokenBindingStatus.PRESENT.toString(), (String) Preconditions.checkNotNull(r2));
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof TokenBinding) == true) goto L5;
        return false;
    L5:
        TokenBinding r42 = (TokenBinding) r4;
        if (com.google.android.gms.internal.fido.zzao.zza(this.zza, r42.zza) == true) goto L8;
    L11:
        return false;
    L8:
        if (com.google.android.gms.internal.fido.zzao.zza(this.zzb, r42.zzb) == false) goto L11;
        return true;
    }

    public String getTokenBindingId() {
        return this.zzb;
    }

    public String getTokenBindingStatusAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put(NotificationCompat.CATEGORY_STATUS, this.zza).put(Constants.KEY_ID, this.zzb);
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 2, getTokenBindingStatusAsString(), false);
        SafeParcelWriter.writeString(r4, 3, getTokenBindingId(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @SafeParcelable.Constructor
    public TokenBinding(@SafeParcelable.Param(id = 2) String r1, @SafeParcelable.Param(id = 3) String r2) {
        Preconditions.checkNotNull(r1);
        this.zza = TokenBindingStatus.fromString(r1);     // Catch: UnsupportedTokenBindingStatusException -> L6
        this.zzb = r2;
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }
}
