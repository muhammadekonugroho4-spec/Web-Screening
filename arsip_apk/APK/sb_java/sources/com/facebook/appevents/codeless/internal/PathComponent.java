package com.facebook.appevents.codeless.internal;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PathComponent {

    /* renamed from: i, reason: collision with root package name */
    public static final a f35862i = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f35863a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35864b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35865c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35866e;

    /* renamed from: f, reason: collision with root package name */
    public final String f35867f;

    /* renamed from: g, reason: collision with root package name */
    public final String f35868g;

    /* renamed from: h, reason: collision with root package name */
    public final int f35869h;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent$MatchBitmaskType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ID", "TEXT", "TAG", "DESCRIPTION", "HINT", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum MatchBitmaskType extends Enum<MatchBitmaskType> {
        public static final MatchBitmaskType DESCRIPTION = null;
        public static final MatchBitmaskType HINT = null;
        public static final MatchBitmaskType ID = null;
        public static final MatchBitmaskType TAG = null;
        public static final MatchBitmaskType TEXT = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ MatchBitmaskType[] f35870a = null;
        private final int value;

        static {
            ID = new MatchBitmaskType("ID", 0, 1);
            TEXT = new MatchBitmaskType("TEXT", 1, 2);
            TAG = new MatchBitmaskType("TAG", 2, 4);
            DESCRIPTION = new MatchBitmaskType("DESCRIPTION", 3, 8);
            HINT = new MatchBitmaskType("HINT", 4, 16);
            f35870a = a();
        }

        MatchBitmaskType(String r1, int r2, int r3) {
            this.value = r3;
        }

        public static final /* synthetic */ MatchBitmaskType[] a() {
            return new MatchBitmaskType[]{ID, TEXT, TAG, DESCRIPTION, HINT};
        }

        public static MatchBitmaskType valueOf(String r1) {
            return (MatchBitmaskType) Enum.valueOf(MatchBitmaskType.class, r1);
        }

        public static MatchBitmaskType[] values() {
            return (MatchBitmaskType[]) f35870a.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f35862i = new a(null);
    }

    public PathComponent(JSONObject r3) {
        p.l(r3, "component");
        String r02 = r3.getString("class_name");
        p.k(r02, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f35863a = r02;
        this.f35864b = r3.optInt(FirebaseAnalytics.Param.INDEX, -1);
        this.f35865c = r3.optInt(Constants.KEY_ID);
        String r03 = r3.optString(Constants.KEY_TEXT);
        p.k(r03, "component.optString(PATH_TEXT_KEY)");
        this.d = r03;
        String r04 = r3.optString("tag");
        p.k(r04, "component.optString(PATH_TAG_KEY)");
        this.f35866e = r04;
        String r05 = r3.optString("description");
        p.k(r05, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f35867f = r05;
        String r06 = r3.optString("hint");
        p.k(r06, "component.optString(PATH_HINT_KEY)");
        this.f35868g = r06;
        this.f35869h = r3.optInt("match_bitmask");
    }

    public final String a() {
        return this.f35863a;
    }

    public final String b() {
        return this.f35867f;
    }

    public final String c() {
        return this.f35868g;
    }

    public final int d() {
        return this.f35865c;
    }

    public final int e() {
        return this.f35864b;
    }

    public final int f() {
        return this.f35869h;
    }

    public final String g() {
        return this.f35866e;
    }

    public final String h() {
        return this.d;
    }
}
