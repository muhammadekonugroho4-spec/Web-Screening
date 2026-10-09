package io.sentry.protocol;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.InterfaceC11587f1;
import io.sentry.InterfaceC11592g1;
import io.sentry.InterfaceC11631o0;
import io.sentry.InterfaceC11696y0;
import io.sentry.Q;
import io.sentry.util.AbstractC11673b;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class Device implements InterfaceC11696y0 {

    /* renamed from: A, reason: collision with root package name */
    public String f176458A;

    /* renamed from: B, reason: collision with root package name */
    public String f176459B;

    /* renamed from: C, reason: collision with root package name */
    public String f176460C;

    /* renamed from: D, reason: collision with root package name */
    public Float f176461D;

    /* renamed from: E, reason: collision with root package name */
    public Integer f176462E;

    /* renamed from: F, reason: collision with root package name */
    public Double f176463F;

    /* renamed from: G, reason: collision with root package name */
    public String f176464G;

    /* renamed from: H, reason: collision with root package name */
    public String f176465H;

    /* renamed from: I, reason: collision with root package name */
    public Map f176466I;

    /* renamed from: a, reason: collision with root package name */
    public String f176467a;

    /* renamed from: b, reason: collision with root package name */
    public String f176468b;

    /* renamed from: c, reason: collision with root package name */
    public String f176469c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f176470e;

    /* renamed from: f, reason: collision with root package name */
    public String f176471f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f176472g;

    /* renamed from: h, reason: collision with root package name */
    public Float f176473h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f176474i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f176475j;

    /* renamed from: k, reason: collision with root package name */
    public DeviceOrientation f176476k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f176477l;

    /* renamed from: m, reason: collision with root package name */
    public Long f176478m;

    /* renamed from: n, reason: collision with root package name */
    public Long f176479n;

    /* renamed from: o, reason: collision with root package name */
    public Long f176480o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f176481p;

    /* renamed from: q, reason: collision with root package name */
    public Long f176482q;

    /* renamed from: r, reason: collision with root package name */
    public Long f176483r;

    /* renamed from: s, reason: collision with root package name */
    public Long f176484s;

    /* renamed from: t, reason: collision with root package name */
    public Long f176485t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f176486u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f176487v;

    /* renamed from: w, reason: collision with root package name */
    public Float f176488w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f176489x;

    /* renamed from: y, reason: collision with root package name */
    public Date f176490y;

    /* renamed from: z, reason: collision with root package name */
    public TimeZone f176491z;

    public enum DeviceOrientation extends Enum<DeviceOrientation> implements InterfaceC11696y0 {
        private static final /* synthetic */ DeviceOrientation[] $VALUES = null;
        public static final DeviceOrientation LANDSCAPE = null;
        public static final DeviceOrientation PORTRAIT = null;

        public static final class a implements InterfaceC11631o0 {
            public a() {
            }

            @Override // io.sentry.InterfaceC11631o0
            public /* bridge */ /* synthetic */ Object a(InterfaceC11587f1 r1, Q r2) {
                return b(r1, r2);
            }

            public DeviceOrientation b(InterfaceC11587f1 r1, Q r2) {
                return DeviceOrientation.valueOf(r1.nextString().toUpperCase(Locale.ROOT));
            }
        }

        private static /* synthetic */ DeviceOrientation[] $values() {
            return new DeviceOrientation[]{PORTRAIT, LANDSCAPE};
        }

        static {
            PORTRAIT = new DeviceOrientation("PORTRAIT", 0);
            LANDSCAPE = new DeviceOrientation("LANDSCAPE", 1);
            $VALUES = $values();
        }

        DeviceOrientation(String r1, int r2) {
        }

        public static DeviceOrientation valueOf(String r1) {
            return (DeviceOrientation) Enum.valueOf(DeviceOrientation.class, r1);
        }

        public static DeviceOrientation[] values() {
            return (DeviceOrientation[]) $VALUES.clone();
        }

        @Override // io.sentry.InterfaceC11696y0
        public void serialize(InterfaceC11592g1 r2, Q r3) throws IOException {
            r2.a(toString().toLowerCase(Locale.ROOT));
        }
    }

    public static final class a implements InterfaceC11631o0 {
        public a() {
        }

        @Override // io.sentry.InterfaceC11631o0
        public /* bridge */ /* synthetic */ Object a(InterfaceC11587f1 r1, Q r2) {
            return b(r1, r2);
        }

        public Device b(InterfaceC11587f1 r6, Q r7) {
            r6.beginObject();
            Device r02 = new Device();
            ConcurrentHashMap r1 = null;
        L4:
            if (r6.peek() != JsonToken.NAME) goto L186;
            String r2 = r6.nextName();
            r2.getClass();
            char r3 = 65535;
            switch(r2.hashCode()) {
                case -2076227591: goto L141;
                case -2012489734: goto L137;
                case -1981332476: goto L133;
                case -1969347631: goto L129;
                case -1608004830: goto L125;
                case -1439500848: goto L121;
                case -1410521534: goto L117;
                case -1281860764: goto L113;
                case -1097462182: goto L109;
                case -1012222381: goto L105;
                case -877252910: goto L101;
                case -619038223: goto L97;
                case -568274923: goto L93;
                case -417046774: goto L89;
                case -136523212: goto L85;
                case 3355: goto L81;
                case 3373707: goto L77;
                case 59142220: goto L73;
                case 93076189: goto L69;
                case 93997959: goto L65;
                case 104069929: goto L61;
                case 115746789: goto L57;
                case 244497903: goto L53;
                case 731866107: goto L49;
                case 746402966: goto L45;
                case 817830969: goto L41;
                case 823882553: goto L37;
                case 897428293: goto L33;
                case 1331465768: goto L29;
                case 1418777727: goto L25;
                case 1436115569: goto L21;
                case 1450613660: goto L17;
                case 1524159400: goto L13;
                case 1556284978: goto L9;
                default: goto L144;
            };
        L144:
            switch(r3) {
                case 0: goto L185;
                case 1: goto L183;
                case 2: goto L181;
                case 3: goto L180;
                case 4: goto L179;
                case 5: goto L178;
                case 6: goto L177;
                case 7: goto L176;
                case 8: goto L175;
                case 9: goto L174;
                case 10: goto L173;
                case 11: goto L172;
                case 12: goto L171;
                case 13: goto L170;
                case 14: goto L169;
                case 15: goto L168;
                case 16: goto L167;
                case 17: goto L166;
                case 18: goto L163;
                case 19: goto L162;
                case 20: goto L161;
                case 21: goto L160;
                case 22: goto L159;
                case 23: goto L158;
                case 24: goto L157;
                case 25: goto L156;
                case 26: goto L155;
                case 27: goto L154;
                case 28: goto L153;
                case 29: goto L152;
                case 30: goto L151;
                case 31: goto L150;
                case 32: goto L149;
                case 33: goto L148;
                default: goto L145;
            };
        L148:
            Device.o(r02, r6.h1());
            goto L4
        L149:
            Device.j(r02, r6.j1());
            goto L4
        L150:
            Device.l(r02, r6.j1());
            goto L4
        L151:
            Device.G(r02, r6.G());
            goto L4
        L152:
            Device.e(r02, r6.j1());
            goto L4
        L153:
            Device.g(r02, r6.j1());
            goto L4
        L154:
            Device.i(r02, r6.j1());
            goto L4
        L155:
            Device.k(r02, r6.j1());
            goto L4
        L156:
            Device.m(r02, r6.h1());
            goto L4
        L157:
            Device.B(r02, r6.b0());
            goto L4
        L158:
            Device.u(r02, r6.b0());
            goto L4
        L159:
            Device.z(r02, r6.R0());
            goto L4
        L160:
            Device.A(r02, r6.b0());
            goto L4
        L161:
            Device.C(r02, r6.b0());
            goto L4
        L162:
            Device.n(r02, r6.b0());
            goto L4
        L163:
            List r22 = (List) r6.B1();
            if (r22 == null) goto L4;
            String[] r32 = new String[r22.size()];
            r22.toArray(r32);
            Device.E(r02, r32);
            goto L4
        L166:
            Device.h(r02, r6.G());
            goto L4
        L167:
            Device.a(r02, r6.b0());
            goto L4
        L168:
            Device.t(r02, r6.b0());
            goto L4
        L169:
            Device.f(r02, r6.j1());
            goto L4
        L170:
            Device.q(r02, r6.h1());
            goto L4
        L171:
            Device.p(r02, r6.n0());
            goto L4
        L172:
            Device.D(r02, r6.b0());
            goto L4
        L173:
            Device.F(r02, r6.n0());
            goto L4
        L174:
            Device.H(r02, r6.G());
            goto L4
        L175:
            Device.w(r02, r6.b0());
            goto L4
        L176:
            Device.y(r02, r6.b0());
            goto L4
        L177:
            Device.v(r02, r6.n0());
            goto L4
        L178:
            Device.b(r02, (DeviceOrientation) r6.K(r7, new DeviceOrientation.a()));
            goto L4
        L179:
            Device.x(r02, r6.h1());
            goto L4
        L180:
            Device.c(r02, r6.b0());
            goto L4
        L181:
            Device.d(r02, r6.G());
            goto L4
        L183:
            if (r6.peek() != JsonToken.STRING) goto L4;
            Device.r(r02, r6.F(r7));
            goto L4
        L185:
            Device.s(r02, r6.I0(r7));
            goto L4
        L145:
            if (r1 != null) goto L147;
            r1 = new ConcurrentHashMap();
        L147:
            r6.o1(r7, r1, r2);
            goto L4
        L9:
            if (r2.equals("screen_height_pixels") == false) goto L144;
            r3 = '!';
            goto L144
        L13:
            if (r2.equals("free_storage") == false) goto L144;
            r3 = ' ';
            goto L144
        L17:
            if (r2.equals("external_free_storage") == false) goto L144;
            r3 = 31;
            goto L144
        L21:
            if (r2.equals("charging") == false) goto L144;
            r3 = 30;
            goto L144
        L25:
            if (r2.equals("memory_size") == false) goto L144;
            r3 = 29;
            goto L144
        L29:
            if (r2.equals("usable_memory") == false) goto L144;
            r3 = 28;
            goto L144
        L33:
            if (r2.equals("storage_size") == false) goto L144;
            r3 = 27;
            goto L144
        L37:
            if (r2.equals("external_storage_size") == false) goto L144;
            r3 = 26;
            goto L144
        L41:
            if (r2.equals("screen_width_pixels") == false) goto L144;
            r3 = 25;
            goto L144
        L45:
            if (r2.equals("chipset") == false) goto L144;
            r3 = 24;
            goto L144
        L49:
            if (r2.equals("connection_type") == false) goto L144;
            r3 = 23;
            goto L144
        L53:
            if (r2.equals("processor_frequency") == false) goto L144;
            r3 = 22;
            goto L144
        L57:
            if (r2.equals("cpu_description") == false) goto L144;
            r3 = 21;
            goto L144
        L61:
            if (r2.equals("model") == false) goto L144;
            r3 = 20;
            goto L144
        L65:
            if (r2.equals("brand") == false) goto L144;
            r3 = 19;
            goto L144
        L69:
            if (r2.equals("archs") == false) goto L144;
            r3 = 18;
            goto L144
        L73:
            if (r2.equals("low_memory") == false) goto L144;
            r3 = 17;
            goto L144
        L77:
            if (r2.equals(AppMeasurementSdk.ConditionalUserProperty.NAME) == false) goto L144;
            r3 = 16;
            goto L144
        L81:
            if (r2.equals(Constants.KEY_ID) == false) goto L144;
            r3 = 15;
            goto L144
        L85:
            if (r2.equals("free_memory") == false) goto L144;
            r3 = 14;
            goto L144
        L89:
            if (r2.equals("screen_dpi") == false) goto L144;
            r3 = '\r';
            goto L144
        L93:
            if (r2.equals("screen_density") == false) goto L144;
            r3 = '\f';
            goto L144
        L97:
            if (r2.equals("model_id") == false) goto L144;
            r3 = 11;
            goto L144
        L101:
            if (r2.equals("battery_level") == false) goto L144;
            r3 = '\n';
            goto L144
        L105:
            if (r2.equals("online") == false) goto L144;
            r3 = '\t';
            goto L144
        L109:
            if (r2.equals("locale") == false) goto L144;
            r3 = '\b';
            goto L144
        L113:
            if (r2.equals("family") == false) goto L144;
            r3 = 7;
            goto L144
        L117:
            if (r2.equals("battery_temperature") == false) goto L144;
            r3 = 6;
            goto L144
        L121:
            if (r2.equals(Constants.KEY_ORIENTATION) == false) goto L144;
            r3 = 5;
            goto L144
        L125:
            if (r2.equals("processor_count") == false) goto L144;
            r3 = 4;
            goto L144
        L129:
            if (r2.equals("manufacturer") == false) goto L144;
            r3 = 3;
            goto L144
        L133:
            if (r2.equals("simulator") == false) goto L144;
            r3 = 2;
            goto L144
        L137:
            if (r2.equals("boot_time") == false) goto L144;
            r3 = 1;
            goto L144
        L141:
            if (r2.equals("timezone") == false) goto L144;
            r3 = 0;
            goto L144
        L186:
            r02.q0(r1);
            r6.endObject();
            return r02;
        }
    }

    public Device() {
    }

    public static /* synthetic */ String A(Device r02, String r1) {
        r02.f176464G = r1;
        return r1;
    }

    public static /* synthetic */ String B(Device r02, String r1) {
        r02.f176465H = r1;
        return r1;
    }

    public static /* synthetic */ String C(Device r02, String r1) {
        r02.f176470e = r1;
        return r1;
    }

    public static /* synthetic */ String D(Device r02, String r1) {
        r02.f176471f = r1;
        return r1;
    }

    public static /* synthetic */ String[] E(Device r02, String[] r1) {
        r02.f176472g = r1;
        return r1;
    }

    public static /* synthetic */ Float F(Device r02, Float r1) {
        r02.f176473h = r1;
        return r1;
    }

    public static /* synthetic */ Boolean G(Device r02, Boolean r1) {
        r02.f176474i = r1;
        return r1;
    }

    public static /* synthetic */ Boolean H(Device r02, Boolean r1) {
        r02.f176475j = r1;
        return r1;
    }

    public static /* synthetic */ String a(Device r02, String r1) {
        r02.f176467a = r1;
        return r1;
    }

    public static /* synthetic */ DeviceOrientation b(Device r02, DeviceOrientation r1) {
        r02.f176476k = r1;
        return r1;
    }

    public static /* synthetic */ String c(Device r02, String r1) {
        r02.f176468b = r1;
        return r1;
    }

    public static /* synthetic */ Boolean d(Device r02, Boolean r1) {
        r02.f176477l = r1;
        return r1;
    }

    public static /* synthetic */ Long e(Device r02, Long r1) {
        r02.f176478m = r1;
        return r1;
    }

    public static /* synthetic */ Long f(Device r02, Long r1) {
        r02.f176479n = r1;
        return r1;
    }

    public static /* synthetic */ Long g(Device r02, Long r1) {
        r02.f176480o = r1;
        return r1;
    }

    public static /* synthetic */ Boolean h(Device r02, Boolean r1) {
        r02.f176481p = r1;
        return r1;
    }

    public static /* synthetic */ Long i(Device r02, Long r1) {
        r02.f176482q = r1;
        return r1;
    }

    public static /* synthetic */ Long j(Device r02, Long r1) {
        r02.f176483r = r1;
        return r1;
    }

    public static /* synthetic */ Long k(Device r02, Long r1) {
        r02.f176484s = r1;
        return r1;
    }

    public static /* synthetic */ Long l(Device r02, Long r1) {
        r02.f176485t = r1;
        return r1;
    }

    public static /* synthetic */ Integer m(Device r02, Integer r1) {
        r02.f176486u = r1;
        return r1;
    }

    public static /* synthetic */ String n(Device r02, String r1) {
        r02.f176469c = r1;
        return r1;
    }

    public static /* synthetic */ Integer o(Device r02, Integer r1) {
        r02.f176487v = r1;
        return r1;
    }

    public static /* synthetic */ Float p(Device r02, Float r1) {
        r02.f176488w = r1;
        return r1;
    }

    public static /* synthetic */ Integer q(Device r02, Integer r1) {
        r02.f176489x = r1;
        return r1;
    }

    public static /* synthetic */ Date r(Device r02, Date r1) {
        r02.f176490y = r1;
        return r1;
    }

    public static /* synthetic */ TimeZone s(Device r02, TimeZone r1) {
        r02.f176491z = r1;
        return r1;
    }

    public static /* synthetic */ String t(Device r02, String r1) {
        r02.f176458A = r1;
        return r1;
    }

    public static /* synthetic */ String u(Device r02, String r1) {
        r02.f176460C = r1;
        return r1;
    }

    public static /* synthetic */ Float v(Device r02, Float r1) {
        r02.f176461D = r1;
        return r1;
    }

    public static /* synthetic */ String w(Device r02, String r1) {
        r02.f176459B = r1;
        return r1;
    }

    public static /* synthetic */ Integer x(Device r02, Integer r1) {
        r02.f176462E = r1;
        return r1;
    }

    public static /* synthetic */ String y(Device r02, String r1) {
        r02.d = r1;
        return r1;
    }

    public static /* synthetic */ Double z(Device r02, Double r1) {
        r02.f176463F = r1;
        return r1;
    }

    public String I() {
        return this.f176460C;
    }

    public String J() {
        return this.f176458A;
    }

    public String K() {
        return this.f176459B;
    }

    public void L(String[] r1) {
        this.f176472g = r1;
    }

    public void M(Float r1) {
        this.f176473h = r1;
    }

    public void N(Float r1) {
        this.f176461D = r1;
    }

    public void O(Date r1) {
        this.f176490y = r1;
    }

    public void P(String r1) {
        this.f176469c = r1;
    }

    public void Q(Boolean r1) {
        this.f176474i = r1;
    }

    public void R(String r1) {
        this.f176465H = r1;
    }

    public void S(String r1) {
        this.f176460C = r1;
    }

    public void T(Long r1) {
        this.f176485t = r1;
    }

    public void U(Long r1) {
        this.f176484s = r1;
    }

    public void V(String r1) {
        this.d = r1;
    }

    public void W(Long r1) {
        this.f176479n = r1;
    }

    public void X(Long r1) {
        this.f176483r = r1;
    }

    public void Y(String r1) {
        this.f176458A = r1;
    }

    public void Z(String r1) {
        this.f176459B = r1;
    }

    public void a0(Boolean r1) {
        this.f176481p = r1;
    }

    public void b0(String r1) {
        this.f176468b = r1;
    }

    public void c0(Long r1) {
        this.f176478m = r1;
    }

    public void d0(String r1) {
        this.f176470e = r1;
    }

    public void e0(String r1) {
        this.f176471f = r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L77:
        return false;
    L8:
        if (Device.class != r5.getClass()) goto L77;
        Device r52 = (Device) r5;
        if (io.sentry.util.v.a(this.f176467a, r52.f176467a) == false) goto L77;
        if (io.sentry.util.v.a(this.f176468b, r52.f176468b) == false) goto L77;
        if (io.sentry.util.v.a(this.f176469c, r52.f176469c) == false) goto L77;
        if (io.sentry.util.v.a(this.d, r52.d) == false) goto L77;
        if (io.sentry.util.v.a(this.f176470e, r52.f176470e) == false) goto L77;
        if (io.sentry.util.v.a(this.f176471f, r52.f176471f) == false) goto L77;
        if (Arrays.equals(this.f176472g, r52.f176472g) == false) goto L77;
        if (io.sentry.util.v.a(this.f176473h, r52.f176473h) == false) goto L77;
        if (io.sentry.util.v.a(this.f176474i, r52.f176474i) == false) goto L77;
        if (io.sentry.util.v.a(this.f176475j, r52.f176475j) == false) goto L77;
        if (this.f176476k != r52.f176476k) goto L77;
        if (io.sentry.util.v.a(this.f176477l, r52.f176477l) == false) goto L77;
        if (io.sentry.util.v.a(this.f176478m, r52.f176478m) == false) goto L77;
        if (io.sentry.util.v.a(this.f176479n, r52.f176479n) == false) goto L77;
        if (io.sentry.util.v.a(this.f176480o, r52.f176480o) == false) goto L77;
        if (io.sentry.util.v.a(this.f176481p, r52.f176481p) == false) goto L77;
        if (io.sentry.util.v.a(this.f176482q, r52.f176482q) == false) goto L77;
        if (io.sentry.util.v.a(this.f176483r, r52.f176483r) == false) goto L77;
        if (io.sentry.util.v.a(this.f176484s, r52.f176484s) == false) goto L77;
        if (io.sentry.util.v.a(this.f176485t, r52.f176485t) == false) goto L77;
        if (io.sentry.util.v.a(this.f176486u, r52.f176486u) == false) goto L77;
        if (io.sentry.util.v.a(this.f176487v, r52.f176487v) == false) goto L77;
        if (io.sentry.util.v.a(this.f176488w, r52.f176488w) == false) goto L77;
        if (io.sentry.util.v.a(this.f176489x, r52.f176489x) == false) goto L77;
        if (io.sentry.util.v.a(this.f176490y, r52.f176490y) == false) goto L77;
        if (io.sentry.util.v.a(this.f176458A, r52.f176458A) == false) goto L77;
        if (io.sentry.util.v.a(this.f176459B, r52.f176459B) == false) goto L77;
        if (io.sentry.util.v.a(this.f176460C, r52.f176460C) == false) goto L77;
        if (io.sentry.util.v.a(this.f176461D, r52.f176461D) == false) goto L77;
        if (io.sentry.util.v.a(this.f176462E, r52.f176462E) == false) goto L77;
        if (io.sentry.util.v.a(this.f176463F, r52.f176463F) == false) goto L77;
        if (io.sentry.util.v.a(this.f176464G, r52.f176464G) == false) goto L77;
        if (io.sentry.util.v.a(this.f176465H, r52.f176465H) == false) goto L77;
        return true;
    }

    public void f0(Boolean r1) {
        this.f176475j = r1;
    }

    public void g0(DeviceOrientation r1) {
        this.f176476k = r1;
    }

    public void h0(Integer r1) {
        this.f176462E = r1;
    }

    public int hashCode() {
        return (io.sentry.util.v.b(new Object[]{this.f176467a, this.f176468b, this.f176469c, this.d, this.f176470e, this.f176471f, this.f176473h, this.f176474i, this.f176475j, this.f176476k, this.f176477l, this.f176478m, this.f176479n, this.f176480o, this.f176481p, this.f176482q, this.f176483r, this.f176484s, this.f176485t, this.f176486u, this.f176487v, this.f176488w, this.f176489x, this.f176490y, this.f176491z, this.f176458A, this.f176459B, this.f176460C, this.f176461D, this.f176462E, this.f176463F, this.f176464G, this.f176465H}) * 31) + Arrays.hashCode(this.f176472g);
    }

    public void i0(Double r1) {
        this.f176463F = r1;
    }

    public void j0(Float r1) {
        this.f176488w = r1;
    }

    public void k0(Integer r1) {
        this.f176489x = r1;
    }

    public void l0(Integer r1) {
        this.f176487v = r1;
    }

    public void m0(Integer r1) {
        this.f176486u = r1;
    }

    public void n0(Boolean r1) {
        this.f176477l = r1;
    }

    public void o0(Long r1) {
        this.f176482q = r1;
    }

    public void p0(TimeZone r1) {
        this.f176491z = r1;
    }

    public void q0(Map r1) {
        this.f176466I = r1;
    }

    @Override // io.sentry.InterfaceC11696y0
    public void serialize(InterfaceC11592g1 r4, Q r5) {
        r4.beginObject();
        if (this.f176467a == null) goto L6;
        r4.e(AppMeasurementSdk.ConditionalUserProperty.NAME).a(this.f176467a);
    L6:
        if (this.f176468b == null) goto L9;
        r4.e("manufacturer").a(this.f176468b);
    L9:
        if (this.f176469c == null) goto L12;
        r4.e("brand").a(this.f176469c);
    L12:
        if (this.d == null) goto L15;
        r4.e("family").a(this.d);
    L15:
        if (this.f176470e == null) goto L18;
        r4.e("model").a(this.f176470e);
    L18:
        if (this.f176471f == null) goto L21;
        r4.e("model_id").a(this.f176471f);
    L21:
        if (this.f176472g == null) goto L24;
        r4.e("archs").j(r5, this.f176472g);
    L24:
        if (this.f176473h == null) goto L27;
        r4.e("battery_level").i(this.f176473h);
    L27:
        if (this.f176474i == null) goto L30;
        r4.e("charging").k(this.f176474i);
    L30:
        if (this.f176475j == null) goto L33;
        r4.e("online").k(this.f176475j);
    L33:
        if (this.f176476k == null) goto L36;
        r4.e(Constants.KEY_ORIENTATION).j(r5, this.f176476k);
    L36:
        if (this.f176477l == null) goto L39;
        r4.e("simulator").k(this.f176477l);
    L39:
        if (this.f176478m == null) goto L42;
        r4.e("memory_size").i(this.f176478m);
    L42:
        if (this.f176479n == null) goto L45;
        r4.e("free_memory").i(this.f176479n);
    L45:
        if (this.f176480o == null) goto L48;
        r4.e("usable_memory").i(this.f176480o);
    L48:
        if (this.f176481p == null) goto L51;
        r4.e("low_memory").k(this.f176481p);
    L51:
        if (this.f176482q == null) goto L54;
        r4.e("storage_size").i(this.f176482q);
    L54:
        if (this.f176483r == null) goto L57;
        r4.e("free_storage").i(this.f176483r);
    L57:
        if (this.f176484s == null) goto L60;
        r4.e("external_storage_size").i(this.f176484s);
    L60:
        if (this.f176485t == null) goto L63;
        r4.e("external_free_storage").i(this.f176485t);
    L63:
        if (this.f176486u == null) goto L66;
        r4.e("screen_width_pixels").i(this.f176486u);
    L66:
        if (this.f176487v == null) goto L69;
        r4.e("screen_height_pixels").i(this.f176487v);
    L69:
        if (this.f176488w == null) goto L72;
        r4.e("screen_density").i(this.f176488w);
    L72:
        if (this.f176489x == null) goto L75;
        r4.e("screen_dpi").i(this.f176489x);
    L75:
        if (this.f176490y == null) goto L78;
        r4.e("boot_time").j(r5, this.f176490y);
    L78:
        if (this.f176491z == null) goto L81;
        r4.e("timezone").j(r5, this.f176491z);
    L81:
        if (this.f176458A == null) goto L84;
        r4.e(Constants.KEY_ID).a(this.f176458A);
    L84:
        if (this.f176460C == null) goto L87;
        r4.e("connection_type").a(this.f176460C);
    L87:
        if (this.f176461D == null) goto L90;
        r4.e("battery_temperature").i(this.f176461D);
    L90:
        if (this.f176459B == null) goto L93;
        r4.e("locale").a(this.f176459B);
    L93:
        if (this.f176462E == null) goto L96;
        r4.e("processor_count").i(this.f176462E);
    L96:
        if (this.f176463F == null) goto L99;
        r4.e("processor_frequency").i(this.f176463F);
    L99:
        if (this.f176464G == null) goto L102;
        r4.e("cpu_description").a(this.f176464G);
    L102:
        if (this.f176465H == null) goto L104;
        r4.e("chipset").a(this.f176465H);
    L104:
        Map r02 = this.f176466I;
        if (r02 == null) goto L110;
        Iterator r03 = r02.keySet().iterator();
    L108:
        if (r03.hasNext() == false) goto L110;
        String r1 = (String) r03.next();
        Object r2 = this.f176466I.get(r1);
        r4.e(r1).j(r5, r2);
    L110:
        r4.endObject();
    }

    public Device(Device r3) {
        this.f176467a = r3.f176467a;
        this.f176468b = r3.f176468b;
        this.f176469c = r3.f176469c;
        this.d = r3.d;
        this.f176470e = r3.f176470e;
        this.f176471f = r3.f176471f;
        this.f176474i = r3.f176474i;
        this.f176475j = r3.f176475j;
        this.f176476k = r3.f176476k;
        this.f176477l = r3.f176477l;
        this.f176478m = r3.f176478m;
        this.f176479n = r3.f176479n;
        this.f176480o = r3.f176480o;
        this.f176481p = r3.f176481p;
        this.f176482q = r3.f176482q;
        this.f176483r = r3.f176483r;
        this.f176484s = r3.f176484s;
        this.f176485t = r3.f176485t;
        this.f176486u = r3.f176486u;
        this.f176487v = r3.f176487v;
        this.f176488w = r3.f176488w;
        this.f176489x = r3.f176489x;
        this.f176490y = r3.f176490y;
        this.f176458A = r3.f176458A;
        this.f176460C = r3.f176460C;
        this.f176461D = r3.f176461D;
        this.f176473h = r3.f176473h;
        String[] r02 = r3.f176472g;
        TimeZone r1 = null;
        if (r02 == null) goto L5;
        String[] r03 = (String[]) r02.clone();
    L6:
        this.f176472g = r03;
        this.f176459B = r3.f176459B;
        TimeZone r04 = r3.f176491z;
        if (r04 == null) goto L9;
        r1 = (TimeZone) r04.clone();
    L9:
        this.f176491z = r1;
        this.f176462E = r3.f176462E;
        this.f176463F = r3.f176463F;
        this.f176464G = r3.f176464G;
        this.f176465H = r3.f176465H;
        this.f176466I = AbstractC11673b.c(r3.f176466I);
        return;
    L5:
        r03 = null;
        goto L6
    }
}
