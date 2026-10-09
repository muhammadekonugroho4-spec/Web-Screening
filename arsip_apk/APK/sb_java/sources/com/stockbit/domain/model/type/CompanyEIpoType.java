package com.stockbit.domain.model.type;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/stockbit/domain/model/type/CompanyEIpoType;", "", "value", "", Constants.KEY_TITLE, "position", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getValue", "()Ljava/lang/String;", "getTitle", "getPosition", "()I", "ONGOING", "UPCOMING", "PAST", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CompanyEIpoType extends Enum<CompanyEIpoType> {
    public static final a Companion = null;
    public static final CompanyEIpoType ONGOING = null;
    public static final CompanyEIpoType PAST = null;
    public static final CompanyEIpoType UPCOMING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompanyEIpoType[] f86176a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86177b = null;
    private final int position;
    private final String title;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CompanyEIpoType a(Integer r7) {
            CompanyEIpoType[] r02 = CompanyEIpoType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            CompanyEIpoType r3 = r02[r2];
            int r4 = r3.getPosition();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
            return r3;
        L10:
            r2 = r2 + 1;
            goto L3
        L11:
            return null;
        }

        public a() {
        }
    }

    static {
        ONGOING = new CompanyEIpoType("ONGOING", 0, "ongoing", "Ongoing", 0);
        UPCOMING = new CompanyEIpoType("UPCOMING", 1, "upcoming", "Upcoming", 1);
        PAST = new CompanyEIpoType("PAST", 2, "past", "Past", 2);
        CompanyEIpoType[] r02 = a();
        f86176a = r02;
        f86177b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CompanyEIpoType(String r1, int r2, String r3, String r4, int r5) {
        this.value = r3;
        this.title = r4;
        this.position = r5;
    }

    public static final /* synthetic */ CompanyEIpoType[] a() {
        return new CompanyEIpoType[]{ONGOING, UPCOMING, PAST};
    }

    public static kotlin.enums.a getEntries() {
        return f86177b;
    }

    public static CompanyEIpoType valueOf(String r1) {
        return (CompanyEIpoType) Enum.valueOf(CompanyEIpoType.class, r1);
    }

    public static CompanyEIpoType[] values() {
        return (CompanyEIpoType[]) f86176a.clone();
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }
}
