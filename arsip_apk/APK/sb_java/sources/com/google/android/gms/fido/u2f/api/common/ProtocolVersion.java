package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

@Deprecated
/* loaded from: classes5.dex */
public enum ProtocolVersion extends Enum<ProtocolVersion> implements Parcelable {
    public static final Parcelable.Creator<ProtocolVersion> CREATOR = null;
    public static final ProtocolVersion UNKNOWN = null;
    public static final ProtocolVersion V1 = null;
    public static final ProtocolVersion V2 = null;
    private static final /* synthetic */ ProtocolVersion[] zza = null;
    private final String zzb;

    public static class UnsupportedProtocolException extends Exception {
        public UnsupportedProtocolException(String r2) {
            super(String.format("Protocol version %s not supported", new Object[]{r2}));
        }
    }

    static {
        ProtocolVersion r02 = new ProtocolVersion(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        UNKNOWN = r02;
        ProtocolVersion r1 = new ProtocolVersion("V1", 1, "U2F_V1");
        V1 = r1;
        ProtocolVersion r2 = new ProtocolVersion("V2", 2, "U2F_V2");
        V2 = r2;
        zza = new ProtocolVersion[]{r02, r1, r2};
        CREATOR = new zzf();
    }

    ProtocolVersion(String r1, int r2, String r3) {
        this.zzb = r3;
    }

    public static ProtocolVersion fromBytes(byte[] r2) throws UnsupportedProtocolException {
        return fromString(new String(r2, "UTF-8"));
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public static ProtocolVersion fromString(String r5) throws UnsupportedProtocolException {
        if (r5 == null) goto L4;
        ProtocolVersion[] r02 = values();
        int r1 = r02.length;
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L12;
        ProtocolVersion r3 = r02[r2];
        if (r5.equals(r3.zzb) == true) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return r3;
    L12:
        throw new UnsupportedProtocolException(r5);
    L4:
        return UNKNOWN;
    }

    public static ProtocolVersion valueOf(String r1) {
        return (ProtocolVersion) Enum.valueOf(ProtocolVersion.class, r1);
    }

    public static ProtocolVersion[] values() {
        return (ProtocolVersion[]) zza.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isCompatible(ProtocolVersion r3) {
        ProtocolVersion r02 = UNKNOWN;
        if (equals(r02) == false) goto L5;
        return true;
    L5:
        if (r3.equals(r02) == false) goto L8;
        return true;
    L8:
        return equals(r3);
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
