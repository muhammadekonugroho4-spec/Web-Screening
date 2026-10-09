package com.stockbit.setting.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/setting/model/StockbitSocialMedia;", "", "url", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "TWITTER", "INSTAGRAM", "TIKTOK", "setting_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum StockbitSocialMedia extends Enum<StockbitSocialMedia> {
    public static final StockbitSocialMedia INSTAGRAM = null;
    public static final StockbitSocialMedia TIKTOK = null;
    public static final StockbitSocialMedia TWITTER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockbitSocialMedia[] f135672a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f135673b = null;
    private final String url;

    static {
        TWITTER = new StockbitSocialMedia("TWITTER", 0, "https://twitter.com/Stockbit");
        INSTAGRAM = new StockbitSocialMedia("INSTAGRAM", 1, "https://www.instagram.com/stockbit");
        TIKTOK = new StockbitSocialMedia("TIKTOK", 2, "https://www.tiktok.com/@stockbit.com");
        StockbitSocialMedia[] r02 = a();
        f135672a = r02;
        f135673b = b.a(r02);
    }

    StockbitSocialMedia(String r1, int r2, String r3) {
        this.url = r3;
    }

    public static final /* synthetic */ StockbitSocialMedia[] a() {
        return new StockbitSocialMedia[]{TWITTER, INSTAGRAM, TIKTOK};
    }

    public static a getEntries() {
        return f135673b;
    }

    public static StockbitSocialMedia valueOf(String r1) {
        return (StockbitSocialMedia) Enum.valueOf(StockbitSocialMedia.class, r1);
    }

    public static StockbitSocialMedia[] values() {
        return (StockbitSocialMedia[]) f135672a.clone();
    }

    public final String getUrl() {
        return this.url;
    }
}
