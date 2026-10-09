package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ActionCodeSettingsCreator")
/* loaded from: classes6.dex */
public class ActionCodeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = null;

    @SafeParcelable.Field(getter = "getUrl", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getIOSBundle", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getIOSAppStoreId", id = 3)
    private final String zzc;

    @SafeParcelable.Field(getter = "getAndroidPackageName", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getAndroidInstallApp", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getAndroidMinimumVersion", id = 6)
    private final String zzf;

    @SafeParcelable.Field(getter = "canHandleCodeInApp", id = 7)
    private final boolean zzg;

    @SafeParcelable.Field(getter = "getLocaleHeader", id = 8)
    private String zzh;

    @SafeParcelable.Field(getter = "getRequestType", id = 9)
    private int zzi;

    @SafeParcelable.Field(getter = "getDynamicLinkDomain", id = 10)
    private String zzj;

    @SafeParcelable.Field(getter = "getLinkDomain", id = 11)
    private final String zzk;

    public static class Builder {
        private String zza;
        private String zzb;
        private String zzc;
        private boolean zzd;
        private String zze;
        private boolean zzf;
        private String zzg;
        private String zzh;

        public /* synthetic */ Builder(zza r1) {
            this();
        }

        public static /* bridge */ /* synthetic */ String zza(Builder r02) {
            return r02.zze;
        }

        public static /* bridge */ /* synthetic */ String zzb(Builder r02) {
            return r02.zzc;
        }

        public static /* bridge */ /* synthetic */ String zzc(Builder r02) {
            return r02.zzg;
        }

        public static /* bridge */ /* synthetic */ String zzd(Builder r02) {
            return r02.zzb;
        }

        public static /* bridge */ /* synthetic */ String zze(Builder r02) {
            return r02.zzh;
        }

        public static /* bridge */ /* synthetic */ String zzf(Builder r02) {
            return r02.zza;
        }

        public static /* bridge */ /* synthetic */ boolean zzg(Builder r02) {
            return r02.zzd;
        }

        public static /* bridge */ /* synthetic */ boolean zzh(Builder r02) {
            return r02.zzf;
        }

        public ActionCodeSettings build() {
            if (this.zza == null) goto L7;
            return new ActionCodeSettings(this, null);
        L7:
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        @Deprecated
        public String getDynamicLinkDomain() {
            return this.zzg;
        }

        public boolean getHandleCodeInApp() {
            return this.zzf;
        }

        public String getIOSBundleId() {
            return this.zzb;
        }

        public String getLinkDomain() {
            return this.zzh;
        }

        public String getUrl() {
            return this.zza;
        }

        public Builder setAndroidPackageName(String r1, boolean r2, String r3) {
            this.zzc = r1;
            this.zzd = r2;
            this.zze = r3;
            return this;
        }

        @Deprecated
        public Builder setDynamicLinkDomain(String r1) {
            this.zzg = r1;
            return this;
        }

        public Builder setHandleCodeInApp(boolean r1) {
            this.zzf = r1;
            return this;
        }

        public Builder setIOSBundleId(String r1) {
            this.zzb = r1;
            return this;
        }

        public Builder setLinkDomain(String r1) {
            this.zzh = r1;
            return this;
        }

        public Builder setUrl(String r1) {
            this.zza = r1;
            return this;
        }

        private Builder() {
            this.zzf = false;
        }
    }

    static {
        CREATOR = new zzb();
    }

    public /* synthetic */ ActionCodeSettings(Builder r1, zza r2) {
        this(r1);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public static ActionCodeSettings zzb() {
        return new ActionCodeSettings(new Builder(null));
    }

    public boolean canHandleCodeInApp() {
        return this.zzg;
    }

    public boolean getAndroidInstallApp() {
        return this.zze;
    }

    public String getAndroidMinimumVersion() {
        return this.zzf;
    }

    public String getAndroidPackageName() {
        return this.zzd;
    }

    public String getIOSBundle() {
        return this.zzb;
    }

    public String getLinkDomain() {
        return this.zzk;
    }

    public String getUrl() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, getUrl(), false);
        SafeParcelWriter.writeString(r4, 2, getIOSBundle(), false);
        SafeParcelWriter.writeString(r4, 3, this.zzc, false);
        SafeParcelWriter.writeString(r4, 4, getAndroidPackageName(), false);
        SafeParcelWriter.writeBoolean(r4, 5, getAndroidInstallApp());
        SafeParcelWriter.writeString(r4, 6, getAndroidMinimumVersion(), false);
        SafeParcelWriter.writeBoolean(r4, 7, canHandleCodeInApp());
        SafeParcelWriter.writeString(r4, 8, this.zzh, false);
        SafeParcelWriter.writeInt(r4, 9, this.zzi);
        SafeParcelWriter.writeString(r4, 10, this.zzj, false);
        SafeParcelWriter.writeString(r4, 11, getLinkDomain(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final int zza() {
        return this.zzi;
    }

    @Deprecated
    public final String zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzh;
    }

    private ActionCodeSettings(Builder r2) {
        this.zza = Builder.zzf(r2);
        this.zzb = Builder.zzd(r2);
        this.zzc = null;
        this.zzd = Builder.zzb(r2);
        this.zze = Builder.zzg(r2);
        this.zzf = Builder.zza(r2);
        this.zzg = Builder.zzh(r2);
        this.zzj = Builder.zzc(r2);
        this.zzk = Builder.zze(r2);
    }

    public final void zza(String r1) {
        this.zzh = r1;
    }

    public final void zza(int r1) {
        this.zzi = r1;
    }

    @SafeParcelable.Constructor
    public ActionCodeSettings(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) String r3, @SafeParcelable.Param(id = 4) String r4, @SafeParcelable.Param(id = 5) boolean r5, @SafeParcelable.Param(id = 6) String r6, @SafeParcelable.Param(id = 7) boolean r7, @SafeParcelable.Param(id = 8) String r8, @SafeParcelable.Param(id = 9) int r9, @SafeParcelable.Param(id = 10) String r10, @SafeParcelable.Param(id = 11) String r11) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        this.zzf = r6;
        this.zzg = r7;
        this.zzh = r8;
        this.zzi = r9;
        this.zzj = r10;
        this.zzk = r11;
    }
}
