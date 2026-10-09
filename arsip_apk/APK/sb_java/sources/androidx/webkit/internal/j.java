package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.webkit.internal.a;
import androidx.webkit.internal.g;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: A, reason: collision with root package name */
    public static final a.b f28790A = null;

    /* renamed from: B, reason: collision with root package name */
    public static final a.b f28791B = null;

    /* renamed from: C, reason: collision with root package name */
    public static final a.d f28792C = null;

    /* renamed from: D, reason: collision with root package name */
    public static final a.b f28793D = null;

    /* renamed from: E, reason: collision with root package name */
    public static final a.b f28794E = null;

    /* renamed from: F, reason: collision with root package name */
    public static final a.b f28795F = null;

    /* renamed from: G, reason: collision with root package name */
    public static final a.b f28796G = null;

    /* renamed from: H, reason: collision with root package name */
    public static final a.e f28797H = null;

    /* renamed from: I, reason: collision with root package name */
    public static final a.e f28798I = null;

    /* renamed from: J, reason: collision with root package name */
    public static final a.h f28799J = null;

    /* renamed from: K, reason: collision with root package name */
    public static final a.h f28800K = null;

    /* renamed from: L, reason: collision with root package name */
    public static final a.g f28801L = null;

    /* renamed from: M, reason: collision with root package name */
    public static final g.b f28802M = null;

    /* renamed from: N, reason: collision with root package name */
    public static final g.a f28803N = null;

    /* renamed from: O, reason: collision with root package name */
    public static final g.a f28804O = null;

    /* renamed from: P, reason: collision with root package name */
    public static final a.h f28805P = null;

    /* renamed from: Q, reason: collision with root package name */
    public static final a.i f28806Q = null;

    /* renamed from: R, reason: collision with root package name */
    public static final a.d f28807R = null;

    /* renamed from: S, reason: collision with root package name */
    public static final a.d f28808S = null;

    /* renamed from: T, reason: collision with root package name */
    public static final a.h f28809T = null;

    /* renamed from: U, reason: collision with root package name */
    public static final a.d f28810U = null;

    /* renamed from: V, reason: collision with root package name */
    public static final a.d f28811V = null;

    /* renamed from: W, reason: collision with root package name */
    public static final a.d f28812W = null;

    /* renamed from: X, reason: collision with root package name */
    public static final a.d f28813X = null;

    /* renamed from: Y, reason: collision with root package name */
    public static final a.d f28814Y = null;

    /* renamed from: Z, reason: collision with root package name */
    public static final a.d f28815Z = null;

    /* renamed from: a, reason: collision with root package name */
    public static final a.b f28816a = null;

    /* renamed from: a0, reason: collision with root package name */
    public static final a.d f28817a0 = null;

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f28818b = null;

    /* renamed from: b0, reason: collision with root package name */
    public static final a.d f28819b0 = null;

    /* renamed from: c, reason: collision with root package name */
    public static final a.e f28820c = null;

    /* renamed from: c0, reason: collision with root package name */
    public static final a.d f28821c0 = null;
    public static final a.c d = null;

    /* renamed from: d0, reason: collision with root package name */
    public static final a.d f28822d0 = null;

    /* renamed from: e, reason: collision with root package name */
    public static final a.f f28823e = null;

    /* renamed from: e0, reason: collision with root package name */
    public static final a.d f28824e0 = null;

    /* renamed from: f, reason: collision with root package name */
    public static final a.f f28825f = null;

    /* renamed from: f0, reason: collision with root package name */
    public static final a.d f28826f0 = null;

    /* renamed from: g, reason: collision with root package name */
    public static final a.f f28827g = null;

    /* renamed from: g0, reason: collision with root package name */
    public static final a.d f28828g0 = null;

    /* renamed from: h, reason: collision with root package name */
    public static final a.f f28829h = null;

    /* renamed from: h0, reason: collision with root package name */
    public static final a.d f28830h0 = null;

    /* renamed from: i, reason: collision with root package name */
    public static final a.f f28831i = null;

    /* renamed from: i0, reason: collision with root package name */
    public static final a.d f28832i0 = null;

    /* renamed from: j, reason: collision with root package name */
    public static final a.f f28833j = null;

    /* renamed from: j0, reason: collision with root package name */
    public static final a.d f28834j0 = null;

    /* renamed from: k, reason: collision with root package name */
    public static final a.c f28835k = null;

    /* renamed from: k0, reason: collision with root package name */
    public static final a.d f28836k0 = null;

    /* renamed from: l, reason: collision with root package name */
    public static final a.c f28837l = null;

    /* renamed from: l0, reason: collision with root package name */
    public static final a.d f28838l0 = null;

    /* renamed from: m, reason: collision with root package name */
    public static final a.c f28839m = null;

    /* renamed from: m0, reason: collision with root package name */
    public static final a.d f28840m0 = null;

    /* renamed from: n, reason: collision with root package name */
    public static final a.c f28841n = null;

    /* renamed from: n0, reason: collision with root package name */
    public static final a.d f28842n0 = null;

    /* renamed from: o, reason: collision with root package name */
    public static final a.c f28843o = null;

    /* renamed from: o0, reason: collision with root package name */
    public static final a.d f28844o0 = null;

    /* renamed from: p, reason: collision with root package name */
    public static final a.c f28845p = null;

    /* renamed from: p0, reason: collision with root package name */
    public static final a.d f28846p0 = null;

    /* renamed from: q, reason: collision with root package name */
    public static final a.b f28847q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final a.b f28848r = null;

    /* renamed from: s, reason: collision with root package name */
    public static final a.c f28849s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final a.f f28850t = null;

    /* renamed from: u, reason: collision with root package name */
    public static final a.c f28851u = null;

    /* renamed from: v, reason: collision with root package name */
    public static final a.b f28852v = null;

    /* renamed from: w, reason: collision with root package name */
    public static final a.b f28853w = null;

    /* renamed from: x, reason: collision with root package name */
    public static final a.f f28854x = null;

    /* renamed from: y, reason: collision with root package name */
    public static final a.f f28855y = null;

    /* renamed from: z, reason: collision with root package name */
    public static final a.f f28856z = null;

    public class a extends a.i {
        public final Pattern d;

        public a(String r1, String r2) {
            super(r1, r2);
            this.d = Pattern.compile("\\A\\d+");
        }

        @Override // androidx.webkit.internal.a
        public boolean c() {
            boolean r02 = super.c();
            if (r02 == true) goto L5;
        L17:
            return r02;
        L5:
            if (Build.VERSION.SDK_INT >= 29) goto L17;
            PackageInfo r03 = androidx.webkit.b.a();
            if (r03 != null) goto L10;
            return false;
        L10:
            Matcher r2 = this.d.matcher(r03.versionName);
            if (r2.find() == true) goto L13;
        L16:
            return false;
        L13:
            if (Integer.parseInt(r03.versionName.substring(r2.start(), r2.end())) < 105) goto L16;
            return true;
        }
    }

    public class b extends a.d {
        public b(String r1, String r2) {
            super(r1, r2);
        }

        @Override // androidx.webkit.internal.a
        public boolean c() {
            if (super.c() == true) goto L6;
            return false;
        L6:
            if (androidx.webkit.c.a("MULTI_PROCESS") == true) goto L8;
            return false;
        L8:
            return androidx.webkit.b.e();
        }
    }

    public class c extends a.d {
        public c(String r1, String r2) {
            super(r1, r2);
        }

        @Override // androidx.webkit.internal.a
        public boolean c() {
            if (androidx.webkit.c.a("MULTI_PROFILE") == true) goto L7;
            return false;
        L7:
            return super.c();
        }
    }

    static {
        f28816a = new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        f28818b = new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        f28820c = new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        d = new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        f28823e = new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        f28825f = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        f28827g = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        f28829h = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        f28831i = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        f28833j = new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        f28835k = new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        f28837l = new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        f28839m = new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        f28841n = new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        f28843o = new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        f28845p = new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        f28847q = new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        f28848r = new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        f28849s = new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        f28850t = new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        f28851u = new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        f28852v = new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        f28853w = new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        f28854x = new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        f28855y = new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        f28856z = new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        f28790A = new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        f28791B = new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        f28792C = new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        f28793D = new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        f28794E = new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        f28795F = new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        f28796G = new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        f28797H = new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        f28798I = new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        f28799J = new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        f28800K = new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        f28801L = new a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        f28802M = new g.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
        f28803N = new g.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
        f28804O = new g.a("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");
        f28805P = new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        f28806Q = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        f28807R = new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        f28808S = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        f28809T = new a.h("FORCE_DARK", "FORCE_DARK");
        f28810U = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        f28811V = new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        f28812W = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        f28813X = new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        f28814Y = new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        f28815Z = new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        f28817a0 = new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        f28819b0 = new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        f28821c0 = new a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        f28822d0 = new b("MULTI_PROFILE", "MULTI_PROFILE");
        f28824e0 = new a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        f28826f0 = new a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        f28828g0 = new a.d("MUTE_AUDIO", "MUTE_AUDIO");
        f28830h0 = new a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        f28832i0 = new a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        f28834j0 = new a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
        f28836k0 = new a.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");
        f28838l0 = new c("PREFETCH_URL_V3", "PREFETCH_URL_V3");
        f28840m0 = new a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");
        f28842n0 = new a.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
        f28844o0 = new a.d("PRERENDER_URL_V2", "PRERENDER_URL_V2");
        f28846p0 = new a.d("SPECULATIVE_LOADING_CONFIG", "SPECULATIVE_LOADING_CONFIG_V2");
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String r1) {
        return c(r1, androidx.webkit.internal.a.d());
    }

    public static boolean c(String r3, Collection r4) {
        HashSet r02 = new HashSet();
        Iterator r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L9;
        e r1 = (e) r42.next();
        if (r1.a().equals(r3) == false) goto L4;
        r02.add(r1);
        goto L4
    L9:
        if (r02.isEmpty() == true) goto L20;
        Iterator r32 = r02.iterator();
    L12:
        if (r32.hasNext() == false) goto L17;
        if (((e) r32.next()).isSupported() == false) goto L12;
        return true;
    L17:
        return false;
    L20:
        throw new RuntimeException("Unknown feature " + r3);
    }
}
