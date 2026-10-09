package org.ocpsoft.prettytime.i18n;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.ocpsoft.prettytime.d;
import org.ocpsoft.prettytime.e;
import org.ocpsoft.prettytime.format.a;
import org.ocpsoft.prettytime.impl.c;
import org.ocpsoft.prettytime.units.Day;

/* loaded from: classes3.dex */
public class Resources_fi extends ListResourceBundle implements c {

    /* renamed from: b, reason: collision with root package name */
    public static Object[][] f182939b;

    /* renamed from: a, reason: collision with root package name */
    public volatile ConcurrentMap f182940a;

    public static class FiTimeFormat extends a {

        /* renamed from: m, reason: collision with root package name */
        public final ResourceBundle f182941m;

        /* renamed from: n, reason: collision with root package name */
        public String f182942n;

        /* renamed from: o, reason: collision with root package name */
        public String f182943o;

        /* renamed from: p, reason: collision with root package name */
        public String f182944p;

        /* renamed from: q, reason: collision with root package name */
        public String f182945q;

        /* renamed from: r, reason: collision with root package name */
        public String f182946r;

        public FiTimeFormat(ResourceBundle r7, e r8) {
            this.f182942n = "";
            this.f182943o = "";
            this.f182944p = "";
            this.f182945q = "";
            this.f182946r = "";
            this.f182941m = r7;
            if (r7.containsKey(C(r8) + "PastSingularName") == false) goto L15;
            F(r7.getString(C(r8) + "PastSingularName")).D(r7.getString(C(r8) + "FutureSingularName")).G(r7.getString(C(r8) + "PastSingularName")).E(r7.getString(C(r8) + "FutureSingularName")).H(r7.getString(C(r8) + "Pattern"));
            if (r7.containsKey(C(r8) + "PastPluralName") == false) goto L8;
            G(r7.getString(C(r8) + "PastPluralName"));
        L8:
            if (r7.containsKey(C(r8) + "FuturePluralName") == false) goto L11;
            E(r7.getString(C(r8) + "FuturePluralName"));
        L11:
            if (r7.containsKey(C(r8) + "PluralPattern") == false) goto L13;
            H(r7.getString(C(r8) + "PluralPattern"));
        L13:
            u(r7.getString(C(r8) + "Pattern")).t(r7.getString(C(r8) + "PastSuffix")).p(r7.getString(C(r8) + "FutureSuffix")).n("").r("").w("").v("");
            return;
        }

        public String A() {
            return this.f182944p;
        }

        public String B() {
            return this.f182946r;
        }

        public final String C(e r1) {
            return r1.getClass().getSimpleName();
        }

        public FiTimeFormat D(String r1) {
            this.f182943o = r1;
            return this;
        }

        public FiTimeFormat E(String r1) {
            this.f182945q = r1;
            return this;
        }

        public FiTimeFormat F(String r1) {
            this.f182942n = r1;
            return this;
        }

        public FiTimeFormat G(String r1) {
            this.f182944p = r1;
            return this;
        }

        public FiTimeFormat H(String r1) {
            this.f182946r = r1;
            return this;
        }

        @Override // org.ocpsoft.prettytime.format.a, org.ocpsoft.prettytime.d
        public String a(org.ocpsoft.prettytime.a r5, String r6) {
            if ((r5.a() instanceof Day) == false) goto L8;
            if (Math.abs(r5.c(50)) != 1) goto L8;
            return r6;
        L8:
            return super.a(r5, r6);
        }

        @Override // org.ocpsoft.prettytime.format.a
        public String f(org.ocpsoft.prettytime.a r6, boolean r7) {
            if (r6.d() == false) goto L5;
            String r02 = z();
        L7:
            if (Math.abs(j(r6, r7)) == 0) goto L13;
            if (Math.abs(j(r6, r7)) > 1) goto L13;
            return r02;
        L13:
            if (r6.d() == false) goto L17;
            return A();
        L17:
            return y();
        L5:
            r02 = x();
            goto L7
        }

        @Override // org.ocpsoft.prettytime.format.a
        public String h(long r3) {
            if (Math.abs(r3) != 1) goto L7;
            return g();
        L7:
            return B();
        }

        public String x() {
            return this.f182943o;
        }

        public String y() {
            return this.f182945q;
        }

        public String z() {
            return this.f182942n;
        }
    }

    static {
        f182939b = new Object[][]{new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowPastSingularName", "hetki"}, new Object[]{"JustNowFutureSingularName", "hetken"}, new Object[]{"JustNowPastSuffix", "sitten"}, new Object[]{"JustNowFutureSuffix", "päästä"}, new Object[]{"MillisecondPattern", "%u"}, new Object[]{"MillisecondPluralPattern", "%n %u"}, new Object[]{"MillisecondPastSingularName", "millisekunti"}, new Object[]{"MillisecondPastPluralName", "millisekuntia"}, new Object[]{"MillisecondFutureSingularName", "millisekunnin"}, new Object[]{"MillisecondPastSuffix", "sitten"}, new Object[]{"MillisecondFutureSuffix", "päästä"}, new Object[]{"SecondPattern", "%u"}, new Object[]{"SecondPluralPattern", "%n %u"}, new Object[]{"SecondPastSingularName", "sekunti"}, new Object[]{"SecondPastPluralName", "sekuntia"}, new Object[]{"SecondFutureSingularName", "sekunnin"}, new Object[]{"SecondPastSuffix", "sitten"}, new Object[]{"SecondFutureSuffix", "päästä"}, new Object[]{"MinutePattern", "%u"}, new Object[]{"MinutePluralPattern", "%n %u"}, new Object[]{"MinutePastSingularName", "minuutti"}, new Object[]{"MinutePastPluralName", "minuuttia"}, new Object[]{"MinuteFutureSingularName", "minuutin"}, new Object[]{"MinutePastSuffix", "sitten"}, new Object[]{"MinuteFutureSuffix", "päästä"}, new Object[]{"HourPattern", "%u"}, new Object[]{"HourPluralPattern", "%n %u"}, new Object[]{"HourPastSingularName", "tunti"}, new Object[]{"HourPastPluralName", "tuntia"}, new Object[]{"HourFutureSingularName", "tunnin"}, new Object[]{"HourPastSuffix", "sitten"}, new Object[]{"HourFutureSuffix", "päästä"}, new Object[]{"DayPattern", "%u"}, new Object[]{"DayPluralPattern", "%n %u"}, new Object[]{"DayPastSingularName", "eilen"}, new Object[]{"DayPastPluralName", "päivää"}, new Object[]{"DayFutureSingularName", "huomenna"}, new Object[]{"DayFuturePluralName", "päivän"}, new Object[]{"DayPastSuffix", "sitten"}, new Object[]{"DayFutureSuffix", "päästä"}, new Object[]{"WeekPattern", "%u"}, new Object[]{"WeekPluralPattern", "%n %u"}, new Object[]{"WeekPastSingularName", "viikko"}, new Object[]{"WeekPastPluralName", "viikkoa"}, new Object[]{"WeekFutureSingularName", "viikon"}, new Object[]{"WeekFuturePluralName", "viikon"}, new Object[]{"WeekPastSuffix", "sitten"}, new Object[]{"WeekFutureSuffix", "päästä"}, new Object[]{"MonthPattern", "%u"}, new Object[]{"MonthPluralPattern", "%n %u"}, new Object[]{"MonthPastSingularName", "kuukausi"}, new Object[]{"MonthPastPluralName", "kuukautta"}, new Object[]{"MonthFutureSingularName", "kuukauden"}, new Object[]{"MonthPastSuffix", "sitten"}, new Object[]{"MonthFutureSuffix", "päästä"}, new Object[]{"YearPattern", "%u"}, new Object[]{"YearPluralPattern", "%n %u"}, new Object[]{"YearPastSingularName", "vuosi"}, new Object[]{"YearPastPluralName", "vuotta"}, new Object[]{"YearFutureSingularName", "vuoden"}, new Object[]{"YearPastSuffix", "sitten"}, new Object[]{"YearFutureSuffix", "päästä"}, new Object[]{"DecadePattern", "%u"}, new Object[]{"DecadePluralPattern", "%n %u"}, new Object[]{"DecadePastSingularName", "vuosikymmen"}, new Object[]{"DecadePastPluralName", "vuosikymmentä"}, new Object[]{"DecadeFutureSingularName", "vuosikymmenen"}, new Object[]{"DecadePastSuffix", "sitten"}, new Object[]{"DecadeFutureSuffix", "päästä"}, new Object[]{"CenturyPattern", "%u"}, new Object[]{"CenturyPluralPattern", "%n %u"}, new Object[]{"CenturyPastSingularName", "vuosisata"}, new Object[]{"CenturyPastPluralName", "vuosisataa"}, new Object[]{"CenturyFutureSingularName", "vuosisadan"}, new Object[]{"CenturyPastSuffix", "sitten"}, new Object[]{"CenturyFutureSuffix", "päästä"}, new Object[]{"MillenniumPattern", "%u"}, new Object[]{"MillenniumPluralPattern", "%n %u"}, new Object[]{"MillenniumPastSingularName", "vuosituhat"}, new Object[]{"MillenniumPastPluralName", "vuosituhatta"}, new Object[]{"MillenniumFutureSingularName", "vuosituhannen"}, new Object[]{"MillenniumPastSuffix", "sitten"}, new Object[]{"MillenniumFutureSuffix", "päästä"}};
    }

    public Resources_fi() {
        this.f182940a = new ConcurrentHashMap();
    }

    @Override // org.ocpsoft.prettytime.impl.c
    public d a(e r3) {
        if (this.f182940a.containsKey(r3) == true) goto L6;
        this.f182940a.putIfAbsent(r3, new FiTimeFormat(this, r3));
    L6:
        return (d) this.f182940a.get(r3);
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f182939b;
    }
}
