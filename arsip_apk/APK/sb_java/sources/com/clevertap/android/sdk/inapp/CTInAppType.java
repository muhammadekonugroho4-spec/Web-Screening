package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppType;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "CTInAppTypeHTML", "CTInAppTypeCoverHTML", "CTInAppTypeInterstitialHTML", "CTInAppTypeHeaderHTML", "CTInAppTypeFooterHTML", "CTInAppTypeHalfInterstitialHTML", "CTInAppTypeCover", "CTInAppTypeInterstitial", "CTInAppTypeHalfInterstitial", "CTInAppTypeHeader", "CTInAppTypeFooter", "CTInAppTypeAlert", "CTInAppTypeCoverImageOnly", "CTInAppTypeInterstitialImageOnly", "CTInAppTypeHalfInterstitialImageOnly", "CTInAppTypeCustomCodeTemplate", GrsBaseInfo.CountryCodeSource.UNKNOWN, "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum CTInAppType extends Enum<CTInAppType> {
    public static final CTInAppType CTInAppTypeAlert = null;
    public static final CTInAppType CTInAppTypeCover = null;
    public static final CTInAppType CTInAppTypeCoverHTML = null;
    public static final CTInAppType CTInAppTypeCoverImageOnly = null;
    public static final CTInAppType CTInAppTypeCustomCodeTemplate = null;
    public static final CTInAppType CTInAppTypeFooter = null;
    public static final CTInAppType CTInAppTypeFooterHTML = null;
    public static final CTInAppType CTInAppTypeHTML = null;
    public static final CTInAppType CTInAppTypeHalfInterstitial = null;
    public static final CTInAppType CTInAppTypeHalfInterstitialHTML = null;
    public static final CTInAppType CTInAppTypeHalfInterstitialImageOnly = null;
    public static final CTInAppType CTInAppTypeHeader = null;
    public static final CTInAppType CTInAppTypeHeaderHTML = null;
    public static final CTInAppType CTInAppTypeInterstitial = null;
    public static final CTInAppType CTInAppTypeInterstitialHTML = null;
    public static final CTInAppType CTInAppTypeInterstitialImageOnly = null;
    public static final a Companion = null;
    public static final CTInAppType UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CTInAppType[] f34030a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f34031b = null;
    private final String type;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final CTInAppType a(String r2) {
            if (r2 == null) goto L87;
            switch(r2.hashCode()) {
                case -1824210231: goto L82;
                case -1698613420: goto L77;
                case -1258935355: goto L72;
                case -1160074422: goto L67;
                case -1141304454: goto L62;
                case -728863497: goto L57;
                case -334055316: goto L52;
                case -37253685: goto L47;
                case 3213227: goto L42;
                case 94852023: goto L37;
                case 604727084: goto L32;
                case 894039686: goto L27;
                case 1189018554: goto L22;
                case 1420225510: goto L17;
                case 1977176024: goto L12;
                case 1979390978: goto L7;
                default: goto L87;
            };
        L7:
            if (r2.equals("coverHtml") == false) goto L87;
            return CTInAppType.CTInAppTypeCoverHTML;
        L12:
            if (r2.equals("headerHtml") == false) goto L87;
            return CTInAppType.CTInAppTypeHeaderHTML;
        L17:
            if (r2.equals("footerHtml") == false) goto L87;
            return CTInAppType.CTInAppTypeFooterHTML;
        L22:
            if (r2.equals("header-template") == false) goto L87;
            return CTInAppType.CTInAppTypeHeader;
        L27:
            if (r2.equals("half-interstitial") == false) goto L87;
            return CTInAppType.CTInAppTypeHalfInterstitial;
        L32:
            if (r2.equals("interstitial") == false) goto L87;
            return CTInAppType.CTInAppTypeInterstitial;
        L37:
            if (r2.equals("cover") == false) goto L87;
            return CTInAppType.CTInAppTypeCover;
        L42:
            if (r2.equals(Constants.INAPP_HTML_TAG) == false) goto L87;
            return CTInAppType.CTInAppTypeHTML;
        L47:
            if (r2.equals("alert-template") == false) goto L87;
            return CTInAppType.CTInAppTypeAlert;
        L52:
            if (r2.equals("footer-template") == false) goto L87;
            return CTInAppType.CTInAppTypeFooter;
        L57:
            if (r2.equals("interstitialHtml") == false) goto L87;
            return CTInAppType.CTInAppTypeInterstitialHTML;
        L62:
            if (r2.equals("interstitial-image") == false) goto L87;
            return CTInAppType.CTInAppTypeInterstitialImageOnly;
        L67:
            if (r2.equals("halfInterstitialHtml") == false) goto L87;
            return CTInAppType.CTInAppTypeHalfInterstitialHTML;
        L72:
            if (r2.equals("cover-image") == false) goto L87;
            return CTInAppType.CTInAppTypeCoverImageOnly;
        L77:
            if (r2.equals("half-interstitial-image") == false) goto L87;
            return CTInAppType.CTInAppTypeHalfInterstitialImageOnly;
        L82:
            if (r2.equals("custom-code") == false) goto L87;
            return CTInAppType.CTInAppTypeCustomCodeTemplate;
        L87:
            return CTInAppType.UNKNOWN;
        }

        public a() {
        }
    }

    static {
        CTInAppTypeHTML = new CTInAppType("CTInAppTypeHTML", 0, Constants.INAPP_HTML_TAG);
        CTInAppTypeCoverHTML = new CTInAppType("CTInAppTypeCoverHTML", 1, "coverHtml");
        CTInAppTypeInterstitialHTML = new CTInAppType("CTInAppTypeInterstitialHTML", 2, "interstitialHtml");
        CTInAppTypeHeaderHTML = new CTInAppType("CTInAppTypeHeaderHTML", 3, "headerHtml");
        CTInAppTypeFooterHTML = new CTInAppType("CTInAppTypeFooterHTML", 4, "footerHtml");
        CTInAppTypeHalfInterstitialHTML = new CTInAppType("CTInAppTypeHalfInterstitialHTML", 5, "halfInterstitialHtml");
        CTInAppTypeCover = new CTInAppType("CTInAppTypeCover", 6, "cover");
        CTInAppTypeInterstitial = new CTInAppType("CTInAppTypeInterstitial", 7, "interstitial");
        CTInAppTypeHalfInterstitial = new CTInAppType("CTInAppTypeHalfInterstitial", 8, "half-interstitial");
        CTInAppTypeHeader = new CTInAppType("CTInAppTypeHeader", 9, "header-template");
        CTInAppTypeFooter = new CTInAppType("CTInAppTypeFooter", 10, "footer-template");
        CTInAppTypeAlert = new CTInAppType("CTInAppTypeAlert", 11, "alert-template");
        CTInAppTypeCoverImageOnly = new CTInAppType("CTInAppTypeCoverImageOnly", 12, "cover-image");
        CTInAppTypeInterstitialImageOnly = new CTInAppType("CTInAppTypeInterstitialImageOnly", 13, "interstitial-image");
        CTInAppTypeHalfInterstitialImageOnly = new CTInAppType("CTInAppTypeHalfInterstitialImageOnly", 14, "half-interstitial-image");
        CTInAppTypeCustomCodeTemplate = new CTInAppType("CTInAppTypeCustomCodeTemplate", 15, "custom-code");
        UNKNOWN = new CTInAppType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 16, "");
        CTInAppType[] r02 = a();
        f34030a = r02;
        f34031b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CTInAppType(String r1, int r2, String r3) {
        this.type = r3;
    }

    public static final /* synthetic */ CTInAppType[] a() {
        return new CTInAppType[]{CTInAppTypeHTML, CTInAppTypeCoverHTML, CTInAppTypeInterstitialHTML, CTInAppTypeHeaderHTML, CTInAppTypeFooterHTML, CTInAppTypeHalfInterstitialHTML, CTInAppTypeCover, CTInAppTypeInterstitial, CTInAppTypeHalfInterstitial, CTInAppTypeHeader, CTInAppTypeFooter, CTInAppTypeAlert, CTInAppTypeCoverImageOnly, CTInAppTypeInterstitialImageOnly, CTInAppTypeHalfInterstitialImageOnly, CTInAppTypeCustomCodeTemplate, UNKNOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f34031b;
    }

    public static CTInAppType valueOf(String r1) {
        return (CTInAppType) Enum.valueOf(CTInAppType.class, r1);
    }

    public static CTInAppType[] values() {
        return (CTInAppType[]) f34030a.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
