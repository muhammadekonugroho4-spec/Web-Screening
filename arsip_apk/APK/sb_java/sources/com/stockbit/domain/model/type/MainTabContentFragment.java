package com.stockbit.domain.model.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/stockbit/domain/model/type/MainTabContentFragment;", "Landroid/os/Parcelable;", "", "trackingValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingValue", "()Ljava/lang/String;", "Watchlist", "Stream", "Search", "Chat", "Portfolio", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum MainTabContentFragment extends Enum<MainTabContentFragment> implements Parcelable {
    public static final Parcelable.Creator<MainTabContentFragment> CREATOR = null;
    public static final MainTabContentFragment Chat = null;
    public static final MainTabContentFragment Portfolio = null;
    public static final MainTabContentFragment Search = null;
    public static final MainTabContentFragment Stream = null;
    public static final MainTabContentFragment Watchlist = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MainTabContentFragment[] f86209a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86210b = null;
    private final String trackingValue;

    static {
        Watchlist = new MainTabContentFragment("Watchlist", 0, "watchlist");
        Stream = new MainTabContentFragment("Stream", 1, "Stream");
        Search = new MainTabContentFragment("Search", 2, FirebaseAnalytics.Event.SEARCH);
        Chat = new MainTabContentFragment("Chat", 3, "chat");
        Portfolio = new MainTabContentFragment("Portfolio", 4, "portfolio");
        MainTabContentFragment[] r02 = a();
        f86209a = r02;
        f86210b = kotlin.enums.b.a(r02);
        CREATOR = new a();
    }

    MainTabContentFragment(String r1, int r2, String r3) {
        this.trackingValue = r3;
    }

    public static final /* synthetic */ MainTabContentFragment[] a() {
        return new MainTabContentFragment[]{Watchlist, Stream, Search, Chat, Portfolio};
    }

    public static kotlin.enums.a getEntries() {
        return f86210b;
    }

    public static MainTabContentFragment valueOf(String r1) {
        return (MainTabContentFragment) Enum.valueOf(MainTabContentFragment.class, r1);
    }

    public static MainTabContentFragment[] values() {
        return (MainTabContentFragment[]) f86209a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getTrackingValue() {
        return this.trackingValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(name());
    }
}
