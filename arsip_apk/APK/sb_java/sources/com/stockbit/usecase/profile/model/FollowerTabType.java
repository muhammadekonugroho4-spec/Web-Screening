package com.stockbit.usecase.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/usecase/profile/model/FollowerTabType;", "Landroid/os/Parcelable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MUTUAL", "FOLLOWER", "FOLLOWING", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "usecase-profile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum FollowerTabType extends Enum<FollowerTabType> implements Parcelable {
    public static final Parcelable.Creator<FollowerTabType> CREATOR = null;
    public static final FollowerTabType FOLLOWER = null;
    public static final FollowerTabType FOLLOWING = null;
    public static final FollowerTabType MUTUAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FollowerTabType[] f159381a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159382b = null;
    private final String value;

    static {
        MUTUAL = new FollowerTabType("MUTUAL", 0, "Mutual");
        FOLLOWER = new FollowerTabType("FOLLOWER", 1, "Followers");
        FOLLOWING = new FollowerTabType("FOLLOWING", 2, "Following");
        FollowerTabType[] r02 = a();
        f159381a = r02;
        f159382b = kotlin.enums.b.a(r02);
        CREATOR = new a();
    }

    FollowerTabType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ FollowerTabType[] a() {
        return new FollowerTabType[]{MUTUAL, FOLLOWER, FOLLOWING};
    }

    public static kotlin.enums.a getEntries() {
        return f159382b;
    }

    public static FollowerTabType valueOf(String r1) {
        return (FollowerTabType) Enum.valueOf(FollowerTabType.class, r1);
    }

    public static FollowerTabType[] values() {
        return (FollowerTabType[]) f159381a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(name());
    }
}
