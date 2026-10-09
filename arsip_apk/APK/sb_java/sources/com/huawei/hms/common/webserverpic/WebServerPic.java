package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

/* loaded from: classes6.dex */
public class WebServerPic {
    public static final Parcelable.Creator<WebServerPic> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    private final Uri f39137a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39138b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39139c;

    static {
        CREATOR = new WebServerPicCreator();
    }

    public WebServerPic(Uri r1, int r2, int r3) throws IllegalArgumentException {
        this.f39137a = r1;
        this.f39138b = r2;
        this.f39139c = r3;
        if (r1 == null) goto L10;
        if (r2 < 0) goto L8;
        if (r3 < 0) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("width and height should be positive or 0");
    L10:
        throw new IllegalArgumentException("url is not able to be null");
    }

    public final int getHeight() {
        return this.f39139c;
    }

    public final Uri getUrl() {
        return this.f39137a;
    }

    public final int getWidth() {
        return this.f39138b;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f39138b), Integer.valueOf(this.f39139c), this.f39137a.toString()});
    }

    public final void writeToParcel(Parcel r5, int r6) {
        Preconditions.checkNotNull(r5);
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeParcelable(r5, 1, getUrl(), r6, false);
        SafeParcelWriter.writeInt(r5, 2, getWidth());
        SafeParcelWriter.writeInt(r5, 3, getHeight());
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }

    public WebServerPic(Uri r2) throws IllegalArgumentException {
        this(r2, 0, 0);
    }
}
