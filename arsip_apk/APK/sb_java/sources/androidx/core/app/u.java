package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f22687a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f22688b;

    /* renamed from: c, reason: collision with root package name */
    public String f22689c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22690e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22691f;

    public static class a {
        public static u a(Person r2) {
            b r02 = new b().f(r2.getName());
            if (r2.getIcon() == null) goto L5;
            IconCompat r1 = IconCompat.c(r2.getIcon());
        L7:
            return r02.c(r1).g(r2.getUri()).e(r2.getKey()).b(r2.isBot()).d(r2.isImportant()).a();
        L5:
            r1 = null;
            goto L7
        }

        public static Person b(u r2) {
            Person.Builder r02 = new Person.Builder().setName(r2.e());
            if (r2.c() == null) goto L5;
            Icon r1 = r2.c().x();
        L7:
            return r02.setIcon(r1).setUri(r2.f()).setKey(r2.d()).setBot(r2.g()).setImportant(r2.h()).build();
        L5:
            r1 = null;
            goto L7
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f22692a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f22693b;

        /* renamed from: c, reason: collision with root package name */
        public String f22694c;
        public String d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22695e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22696f;

        public b() {
        }

        public u a() {
            return new u(this);
        }

        public b b(boolean r1) {
            this.f22695e = r1;
            return this;
        }

        public b c(IconCompat r1) {
            this.f22693b = r1;
            return this;
        }

        public b d(boolean r1) {
            this.f22696f = r1;
            return this;
        }

        public b e(String r1) {
            this.d = r1;
            return this;
        }

        public b f(CharSequence r1) {
            this.f22692a = r1;
            return this;
        }

        public b g(String r1) {
            this.f22694c = r1;
            return this;
        }
    }

    public u(b r2) {
        this.f22687a = r2.f22692a;
        this.f22688b = r2.f22693b;
        this.f22689c = r2.f22694c;
        this.d = r2.d;
        this.f22690e = r2.f22695e;
        this.f22691f = r2.f22696f;
    }

    public static u a(Person r02) {
        return a.a(r02);
    }

    public static u b(Bundle r3) {
        Bundle r02 = r3.getBundle(Constants.KEY_ICON);
        b r1 = new b().f(r3.getCharSequence(AppMeasurementSdk.ConditionalUserProperty.NAME));
        if (r02 == null) goto L5;
        IconCompat r03 = IconCompat.b(r02);
    L7:
        return r1.c(r03).g(r3.getString("uri")).e(r3.getString(Constants.KEY_KEY)).b(r3.getBoolean("isBot")).d(r3.getBoolean("isImportant")).a();
    L5:
        r03 = null;
        goto L7
    }

    public IconCompat c() {
        return this.f22688b;
    }

    public String d() {
        return this.d;
    }

    public CharSequence e() {
        return this.f22687a;
    }

    public boolean equals(Object r4) {
        if (r4 != null) goto L6;
        return false;
    L6:
        if ((r4 instanceof u) == true) goto L8;
        return false;
    L8:
        u r42 = (u) r4;
        String r1 = d();
        String r2 = r42.d();
        if (r1 != null) goto L24;
        if (r2 != null) goto L24;
        if (Objects.equals(Objects.toString(e()), Objects.toString(r42.e())) == true) goto L15;
    L22:
        return false;
    L15:
        if (Objects.equals(f(), r42.f()) == false) goto L22;
        if (Boolean.valueOf(g()).equals(Boolean.valueOf(r42.g())) == false) goto L22;
        if (Boolean.valueOf(h()).equals(Boolean.valueOf(r42.h())) == false) goto L22;
        return true;
    L24:
        return Objects.equals(r1, r2);
    }

    public String f() {
        return this.f22689c;
    }

    public boolean g() {
        return this.f22690e;
    }

    public boolean h() {
        return this.f22691f;
    }

    public int hashCode() {
        String r02 = d();
        if (r02 == null) goto L7;
        return r02.hashCode();
    L7:
        return Objects.hash(new Object[]{e(), f(), Boolean.valueOf(g()), Boolean.valueOf(h())});
    }

    public String i() {
        String r02 = this.f22689c;
        if (r02 == null) goto L6;
        return r02;
    L6:
        if (this.f22687a != null) goto L8;
        return "";
    L8:
        return "name:" + this.f22687a;
    }

    public Person j() {
        return a.b(this);
    }

    public Bundle k() {
        Bundle r02 = new Bundle();
        r02.putCharSequence(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f22687a);
        IconCompat r1 = this.f22688b;
        if (r1 == null) goto L5;
        Bundle r12 = r1.w();
    L6:
        r02.putBundle(Constants.KEY_ICON, r12);
        r02.putString("uri", this.f22689c);
        r02.putString(Constants.KEY_KEY, this.d);
        r02.putBoolean("isBot", this.f22690e);
        r02.putBoolean("isImportant", this.f22691f);
        return r02;
    L5:
        r12 = null;
        goto L6
    }
}
