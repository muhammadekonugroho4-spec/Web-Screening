package com.stockbit.component.sharecontent.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.stockbit.common.h;
import com.stockbit.uikit.f;
import com.stockbit.usecase.sharecontent.model.e;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0018\u001a\u00020\bJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u001e"}, d2 = {"Lcom/stockbit/component/sharecontent/model/SocialMediaType;", "Landroid/os/Parcelable;", "Lcom/stockbit/usecase/sharecontent/model/ShareType;", "", "appName", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "iconDrawableRes", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getAppName", "()Ljava/lang/String;", "getPackageName", "getIconDrawableRes", "()I", "WHATSAPP", "TELEGRAM", "TWITTER", "INSTAGRAM", "INSTAGRAM_STORY", "OTHER", "COPY_LINK", "STREAM", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sharecontent_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SocialMediaType extends Enum<SocialMediaType> implements Parcelable, e {
    public static final SocialMediaType COPY_LINK = null;
    public static final Parcelable.Creator<SocialMediaType> CREATOR = null;
    public static final SocialMediaType INSTAGRAM = null;
    public static final SocialMediaType INSTAGRAM_STORY = null;
    public static final SocialMediaType OTHER = null;
    public static final SocialMediaType STREAM = null;
    public static final SocialMediaType TELEGRAM = null;
    public static final SocialMediaType TWITTER = null;
    public static final SocialMediaType WHATSAPP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SocialMediaType[] f77079a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f77080b = null;
    private final String appName;
    private final int iconDrawableRes;
    private final String packageName;

    static {
        WHATSAPP = new SocialMediaType("WHATSAPP", 0, "WhatsApp", "com.whatsapp", h.v4);
        TELEGRAM = new SocialMediaType("TELEGRAM", 1, "Telegram", "org.telegram.messenger", h.b4);
        TWITTER = new SocialMediaType("TWITTER", 2, "X", "com.twitter.android", h.m4);
        INSTAGRAM = new SocialMediaType("INSTAGRAM", 3, "Instagram", "com.instagram.android", h.j2);
        INSTAGRAM_STORY = new SocialMediaType("INSTAGRAM_STORY", 4, "IG Story", "com.instagram.share.ADD_TO_STORY", h.k2);
        OTHER = new SocialMediaType("OTHER", 5, "Share Via", "", f.f152957G);
        COPY_LINK = new SocialMediaType("COPY_LINK", 6, "Copy Link", "", f.f153025u0);
        STREAM = new SocialMediaType("STREAM", 7, "Stream", "", f.f153031x0);
        SocialMediaType[] r02 = g();
        f77079a = r02;
        f77080b = b.a(r02);
        CREATOR = new a();
    }

    SocialMediaType(String r1, int r2, String r3, String r4, int r5) {
        this.appName = r3;
        this.packageName = r4;
        this.iconDrawableRes = r5;
    }

    public static final /* synthetic */ SocialMediaType[] g() {
        return new SocialMediaType[]{WHATSAPP, TELEGRAM, TWITTER, INSTAGRAM, INSTAGRAM_STORY, OTHER, COPY_LINK, STREAM};
    }

    public static kotlin.enums.a getEntries() {
        return f77080b;
    }

    public static SocialMediaType valueOf(String r1) {
        return (SocialMediaType) Enum.valueOf(SocialMediaType.class, r1);
    }

    public static SocialMediaType[] values() {
        return (SocialMediaType[]) f77079a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final int getIconDrawableRes() {
        return this.iconDrawableRes;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(name());
    }
}
