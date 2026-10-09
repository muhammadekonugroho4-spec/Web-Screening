package com.huawei.hms.support.api.entity.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.core.aidl.IMessageEntity;

/* loaded from: classes6.dex */
public class Scope implements IMessageEntity, Parcelable {
    public static final Parcelable.Creator<Scope> CREATOR = null;
    private String mScopeUri;

    public static class a implements Parcelable.Creator<Scope> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Scope createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Scope[] newArray(int r1) {
            return newArray(r1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Scope createFromParcel(Parcel r2) {
            return new Scope(r2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Scope[] newArray(int r1) {
            return new Scope[r1];
        }
    }

    static {
        CREATOR = new a();
    }

    public Scope() {
        this.mScopeUri = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof Scope) == true) goto L10;
        return false;
    L10:
        return Objects.equal(this.mScopeUri, ((Scope) r2).mScopeUri);
    }

    @Deprecated
    public boolean equeals(Object r1) {
        return equals(r1);
    }

    public String getScopeUri() {
        return this.mScopeUri;
    }

    public final int hashCode() {
        String r02 = this.mScopeUri;
        if (r02 != null) goto L7;
        return super.hashCode();
    L7:
        return r02.hashCode();
    }

    public final String toString() {
        return this.mScopeUri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.mScopeUri);
    }

    public Scope(String r1) {
        this.mScopeUri = r1;
    }

    public Scope(Parcel r1) {
        this.mScopeUri = r1.readString();
    }
}
