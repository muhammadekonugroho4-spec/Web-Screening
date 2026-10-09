package com.stockbit.profile.edit.changeprofilepicturedialog;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/profile/edit/changeprofilepicturedialog/ImagePickSource;", "", "<init>", "(Ljava/lang/String;I)V", "CAMERA", "GALLERY", "profile_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum ImagePickSource extends Enum<ImagePickSource> {
    public static final ImagePickSource CAMERA = null;
    public static final ImagePickSource GALLERY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ImagePickSource[] f127376a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f127377b = null;

    static {
        CAMERA = new ImagePickSource("CAMERA", 0);
        GALLERY = new ImagePickSource("GALLERY", 1);
        ImagePickSource[] r02 = a();
        f127376a = r02;
        f127377b = kotlin.enums.b.a(r02);
    }

    ImagePickSource(String r1, int r2) {
    }

    public static final /* synthetic */ ImagePickSource[] a() {
        return new ImagePickSource[]{CAMERA, GALLERY};
    }

    public static kotlin.enums.a getEntries() {
        return f127377b;
    }

    public static ImagePickSource valueOf(String r1) {
        return (ImagePickSource) Enum.valueOf(ImagePickSource.class, r1);
    }

    public static ImagePickSource[] values() {
        return (ImagePickSource[]) f127376a.clone();
    }
}
