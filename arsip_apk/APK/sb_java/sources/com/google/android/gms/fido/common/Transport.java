package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes5.dex */
public enum Transport extends Enum<Transport> implements ReflectedParcelable {
    public static final Transport BLUETOOTH_CLASSIC = null;
    public static final Transport BLUETOOTH_LOW_ENERGY = null;
    public static final Parcelable.Creator<Transport> CREATOR = null;
    public static final Transport HYBRID = null;
    public static final Transport INTERNAL = null;
    public static final Transport NFC = null;
    public static final Transport USB = null;
    private static final /* synthetic */ Transport[] zza = null;
    private final String zzb;

    public static class UnsupportedTransportException extends Exception {
        public UnsupportedTransportException(String r1) {
            super(r1);
        }
    }

    static {
        Transport r02 = new Transport("BLUETOOTH_CLASSIC", 0, "bt");
        BLUETOOTH_CLASSIC = r02;
        Transport r1 = new Transport("BLUETOOTH_LOW_ENERGY", 1, "ble");
        BLUETOOTH_LOW_ENERGY = r1;
        Transport r2 = new Transport("NFC", 2, "nfc");
        NFC = r2;
        Transport r3 = new Transport("USB", 3, "usb");
        USB = r3;
        Transport r4 = new Transport("INTERNAL", 4, "internal");
        INTERNAL = r4;
        Transport r5 = new Transport("HYBRID", 5, "cable");
        HYBRID = r5;
        zza = new Transport[]{r02, r1, r2, r3, r4, r5};
        CREATOR = new zza();
    }

    Transport(String r1, int r2, String r3) {
        this.zzb = r3;
    }

    public static Transport fromString(String r5) throws UnsupportedTransportException {
        Transport[] r02 = values();
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        Transport r3 = r02[r2];
        if (r5.equals(r3.zzb) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        if (r5.equals("hybrid") == false) goto L13;
        return HYBRID;
    L13:
        throw new UnsupportedTransportException(String.format("Transport %s not supported", new Object[]{r5}));
    }

    public static List<Transport> parseTransports(JSONArray r4) throws JSONException {
        if (r4 != null) goto L5;
        return null;
    L5:
        HashSet r02 = new HashSet(r4.length());
        int r1 = 0;
    L7:
        if (r1 >= r4.length()) goto L17;
        String r2 = r4.getString(r1);
        if (r2 == null) goto L15;
        if (r2.isEmpty() == true) goto L15;
        r02.add(fromString(r2));     // Catch: UnsupportedTransportException -> L14
    L14:
        Log.w("Transport", "Ignoring unrecognized transport ".concat(r2));
    L15:
        r1 = r1 + 1;
        goto L7
    L17:
        return new ArrayList(r02);
    }

    public static Transport valueOf(String r1) {
        return (Transport) Enum.valueOf(Transport.class, r1);
    }

    public static Transport[] values() {
        return (Transport[]) zza.clone();
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
