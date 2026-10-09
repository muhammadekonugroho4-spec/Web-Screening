package L;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public enum f extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final f f925a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final f f926b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final f f927c = null;
    public static final f d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final f f928e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f929f = null;

    static {
        f r02 = new f("SUCCESS", 0);
        f925a = r02;
        f r1 = new f("FAILURE", 1);
        f926b = r1;
        f r2 = new f("CHALLENGE_IN_PROGRESS", 2);
        f927c = r2;
        f r3 = new f("USER_CANCELLED", 3);
        d = r3;
        f r4 = new f(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        f928e = r4;
        f929f = new f[]{r02, r1, r2, r3, r4};
    }

    f(String r1, int r2) {
    }

    public static f valueOf(String r1) {
        return (f) Enum.valueOf(f.class, r1);
    }

    public static f[] values() {
        return (f[]) f929f.clone();
    }
}
