package com.huawei.hms.support.api.entity.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes6.dex */
public class PermissionInfo implements IMessageEntity, Parcelable {
    public static final Parcelable.Creator<PermissionInfo> CREATOR = null;

    @Packed
    private String appID;

    @Packed
    private String packageName;

    @Packed
    private String permission;

    public static class a implements Parcelable.Creator<PermissionInfo> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PermissionInfo createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PermissionInfo[] newArray(int r1) {
            return newArray(r1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PermissionInfo createFromParcel(Parcel r2) {
            return new PermissionInfo(r2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PermissionInfo[] newArray(int r1) {
            return new PermissionInfo[r1];
        }
    }

    static {
        CREATOR = new a();
    }

    public PermissionInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppID() {
        return this.appID;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setAppID(String r1) {
        this.appID = r1;
    }

    public void setPackageName(String r1) {
        this.packageName = r1;
    }

    public void setPermission(String r1) {
        this.permission = r1;
    }

    public PermissionInfo setPermissionUri(String r1) {
        this.permission = r1;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.appID);
        r1.writeString(this.packageName);
        r1.writeString(this.permission);
    }

    public PermissionInfo(String r1, String r2, String r3) {
        this.appID = r1;
        this.packageName = r2;
        this.permission = r3;
    }

    public PermissionInfo(Parcel r2) {
        this.appID = r2.readString();
        this.packageName = r2.readString();
        this.permission = r2.readString();
    }
}
