package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@ShowFirstParty
@KeepForSdkWithMembers
@SafeParcelable.Class(creator = "ProxyRequestCreator")
/* loaded from: classes5.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = null;
    public static final int HTTP_METHOD_DELETE = 0;
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_HEAD = 0;
    public static final int HTTP_METHOD_OPTIONS = 0;
    public static final int HTTP_METHOD_PATCH = 0;
    public static final int HTTP_METHOD_POST = 0;
    public static final int HTTP_METHOD_PUT = 0;
    public static final int HTTP_METHOD_TRACE = 0;
    public static final int LAST_CODE = 0;
    public static final int VERSION_CODE = 2;

    @SafeParcelable.Field(id = 4)
    public final byte[] body;

    @SafeParcelable.Field(id = 2)
    public final int httpMethod;

    @SafeParcelable.Field(id = 3)
    public final long timeoutMillis;

    @SafeParcelable.Field(id = 1)
    public final String url;

    @SafeParcelable.VersionField(id = 1000)
    final int zza;

    @SafeParcelable.Field(id = 5)
    Bundle zzb;

    @ShowFirstParty
    @KeepForSdkWithMembers
    public static class Builder {
        private final String zza;
        private int zzb;
        private long zzc;
        private byte[] zzd;
        private final Bundle zze;

        public Builder(String r4) {
            this.zzb = ProxyRequest.HTTP_METHOD_GET;
            this.zzc = 3000;
            this.zzd = new byte[0];
            this.zze = new Bundle();
            Preconditions.checkNotEmpty(r4);
            if (Patterns.WEB_URL.matcher(r4).matches() == false) goto L7;
            this.zza = r4;
            return;
        L7:
            throw new IllegalArgumentException("The supplied url [ " + r4 + "] is not match Patterns.WEB_URL!");
        }

        public ProxyRequest build() {
            if (this.zzd != null) goto L6;
            this.zzd = new byte[0];
        L6:
            return new ProxyRequest(2, this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public Builder putHeader(String r2, String r3) {
            Preconditions.checkNotEmpty(r2, "Header name cannot be null or empty!");
            Bundle r02 = this.zze;
            if (r3 != null) goto L5;
            r3 = "";
        L5:
            r02.putString(r2, r3);
            return this;
        }

        public Builder setBody(byte[] r1) {
            this.zzd = r1;
            return this;
        }

        public Builder setHttpMethod(int r3) {
            boolean r02 = false;
            if (r3 >= 0) goto L5;
        L7:
            Preconditions.checkArgument(r02, "Unrecognized http method code.");
            this.zzb = r3;
            return this;
        L5:
            if (r3 > ProxyRequest.LAST_CODE) goto L7;
            r02 = true;
            goto L7
        }

        public Builder setTimeoutMillis(long r3) {
            if (r3 < 0) goto L5;
            boolean r02 = true;
        L6:
            Preconditions.checkArgument(r02, "The specified timeout must be non-negative.");
            this.zzc = r3;
            return this;
        L5:
            r02 = false;
            goto L6
        }
    }

    static {
        CREATOR = new zza();
        HTTP_METHOD_GET = 0;
        HTTP_METHOD_POST = 1;
        HTTP_METHOD_PUT = 2;
        HTTP_METHOD_DELETE = 3;
        HTTP_METHOD_HEAD = 4;
        HTTP_METHOD_OPTIONS = 5;
        HTTP_METHOD_TRACE = 6;
        HTTP_METHOD_PATCH = 7;
        LAST_CODE = 7;
    }

    @SafeParcelable.Constructor
    public ProxyRequest(@SafeParcelable.Param(id = 1000) int r1, @SafeParcelable.Param(id = 1) String r2, @SafeParcelable.Param(id = 2) int r3, @SafeParcelable.Param(id = 3) long r4, @SafeParcelable.Param(id = 4) byte[] r6, @SafeParcelable.Param(id = 5) Bundle r7) {
        this.zza = r1;
        this.url = r2;
        this.httpMethod = r3;
        this.timeoutMillis = r4;
        this.body = r6;
        this.zzb = r7;
    }

    public Map<String, String> getHeaderMap() {
        LinkedHashMap r02 = new LinkedHashMap(this.zzb.size());
        Iterator<String> r1 = this.zzb.keySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L10;
        String r2 = r1.next();
        String r3 = this.zzb.getString(r2);
        if (r3 != null) goto L8;
        r3 = "";
    L8:
        r02.put(r2, r3);
        goto L4
    L10:
        return Collections.unmodifiableMap(r02);
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.url + ", method: " + this.httpMethod + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r6, int r7) {
        int r72 = SafeParcelWriter.beginObjectHeader(r6);
        SafeParcelWriter.writeString(r6, 1, this.url, false);
        SafeParcelWriter.writeInt(r6, 2, this.httpMethod);
        SafeParcelWriter.writeLong(r6, 3, this.timeoutMillis);
        SafeParcelWriter.writeByteArray(r6, 4, this.body, false);
        SafeParcelWriter.writeBundle(r6, 5, this.zzb, false);
        SafeParcelWriter.writeInt(r6, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(r6, r72);
    }
}
