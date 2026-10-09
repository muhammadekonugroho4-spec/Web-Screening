package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class WebServerPicCreator implements Parcelable.Creator<WebServerPic> {
    public WebServerPicCreator() {
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ WebServerPic createFromParcel(Parcel r1) {
        return createFromParcel(r1);
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ WebServerPic[] newArray(int r1) {
        return newArray(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public WebServerPic createFromParcel(Parcel r4) {
        return new WebServerPic((Uri) r4.readParcelable(Uri.class.getClassLoader()), r4.readInt(), r4.readInt());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public WebServerPic[] newArray(int r1) {
        return new WebServerPic[r1];
    }
}
