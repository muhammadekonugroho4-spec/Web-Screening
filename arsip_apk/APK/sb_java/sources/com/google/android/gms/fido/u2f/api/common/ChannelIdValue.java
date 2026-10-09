package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "ChannelIdValueCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes5.dex */
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final ChannelIdValue ABSENT = null;
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = null;
    public static final ChannelIdValue UNAVAILABLE = null;
    public static final ChannelIdValue UNUSED = null;

    @SafeParcelable.Field(getter = "getTypeAsInt", id = 2, type = "int")
    private final ChannelIdValueType zza;

    @SafeParcelable.Field(getter = "getStringValue", id = 3)
    private final String zzb;

    @SafeParcelable.Field(getter = "getObjectValueAsString", id = 4)
    private final String zzc;

    public enum ChannelIdValueType extends Enum<ChannelIdValueType> implements Parcelable {
        public static final ChannelIdValueType ABSENT = null;
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = null;
        public static final ChannelIdValueType OBJECT = null;
        public static final ChannelIdValueType STRING = null;
        private static final /* synthetic */ ChannelIdValueType[] zza = null;
        private final int zzb;

        static {
            ChannelIdValueType r02 = new ChannelIdValueType("ABSENT", 0, 0);
            ABSENT = r02;
            ChannelIdValueType r1 = new ChannelIdValueType("STRING", 1, 1);
            STRING = r1;
            ChannelIdValueType r2 = new ChannelIdValueType("OBJECT", 2, 2);
            OBJECT = r2;
            zza = new ChannelIdValueType[]{r02, r1, r2};
            CREATOR = new zza();
        }

        ChannelIdValueType(String r1, int r2, int r3) {
            this.zzb = r3;
        }

        public static ChannelIdValueType valueOf(String r1) {
            return (ChannelIdValueType) Enum.valueOf(ChannelIdValueType.class, r1);
        }

        public static ChannelIdValueType[] values() {
            return (ChannelIdValueType[]) zza.clone();
        }

        public static /* bridge */ /* synthetic */ int zza(ChannelIdValueType r02) {
            return r02.zzb;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel r1, int r2) {
            r1.writeInt(this.zzb);
        }
    }

    public static class UnsupportedChannelIdValueTypeException extends Exception {
        public UnsupportedChannelIdValueTypeException(int r2) {
            super(String.format("ChannelIdValueType %s not supported", new Object[]{Integer.valueOf(r2)}));
        }
    }

    static {
        CREATOR = new zzb();
        ABSENT = new ChannelIdValue();
        UNAVAILABLE = new ChannelIdValue("unavailable");
        UNUSED = new ChannelIdValue("unused");
    }

    private ChannelIdValue() {
        this.zza = ChannelIdValueType.ABSENT;
        this.zzc = null;
        this.zzb = null;
    }

    public static ChannelIdValueType toChannelIdValueType(int r5) throws UnsupportedChannelIdValueTypeException {
        ChannelIdValueType[] r02 = ChannelIdValueType.values();
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        ChannelIdValueType r3 = r02[r2];
        if (r5 == ChannelIdValueType.zza(r3)) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        throw new UnsupportedChannelIdValueTypeException(r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ChannelIdValue) == true) goto L8;
        return false;
    L8:
        ChannelIdValue r52 = (ChannelIdValue) r5;
        if (this.zza.equals(r52.zza) == true) goto L11;
        return false;
    L11:
        int r1 = this.zza.ordinal();
        if (r1 == 0) goto L21;
        if (r1 == 1) goto L20;
        if (r1 == 2) goto L18;
        return false;
    L18:
        return this.zzc.equals(r52.zzc);
    L20:
        return this.zzb.equals(r52.zzb);
    L21:
        return true;
    }

    public JSONObject getObjectValue() {
        if (this.zzc != null) goto L11;
        return null;
    L11:
        return new JSONObject(this.zzc);
    L8:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public String getObjectValueAsString() {
        return this.zzc;
    }

    public String getStringValue() {
        return this.zzb;
    }

    public ChannelIdValueType getType() {
        return this.zza;
    }

    public int getTypeAsInt() {
        return ChannelIdValueType.zza(this.zza);
    }

    public int hashCode() {
        int r02 = this.zza.hashCode() + 31;
        int r1 = this.zza.ordinal();
        if (r1 != 1) goto L5;
        int r03 = r02 * 31;
        int r12 = this.zzb.hashCode();
    L9:
        return r03 + r12;
    L5:
        if (r1 == 2) goto L7;
        return r02;
    L7:
        r03 = r02 * 31;
        r12 = this.zzc.hashCode();
        goto L9
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 2, getTypeAsInt());
        SafeParcelWriter.writeString(r4, 3, getStringValue(), false);
        SafeParcelWriter.writeString(r4, 4, getObjectValueAsString(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @SafeParcelable.Constructor
    public ChannelIdValue(@SafeParcelable.Param(id = 2) int r1, @SafeParcelable.Param(id = 3) String r2, @SafeParcelable.Param(id = 4) String r3) {
        this.zza = toChannelIdValueType(r1);     // Catch: UnsupportedChannelIdValueTypeException -> L6
        this.zzb = r2;
        this.zzc = r3;
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    private ChannelIdValue(String r1) {
        this.zzb = (String) Preconditions.checkNotNull(r1);
        this.zza = ChannelIdValueType.STRING;
        this.zzc = null;
    }

    public ChannelIdValue(JSONObject r1) {
        this.zzc = (String) Preconditions.checkNotNull(r1.toString());
        this.zza = ChannelIdValueType.OBJECT;
        this.zzb = null;
    }
}
