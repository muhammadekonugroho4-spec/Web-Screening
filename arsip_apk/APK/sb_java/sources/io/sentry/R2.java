package io.sentry;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes3.dex */
public final class R2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f174897a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f174898b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f174899c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f174900e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f174901f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f174902g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f174903h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f174904i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f174905j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f174906k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f174907l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f174908m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f174909n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f174910o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f174911p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f174912q;

    /* renamed from: r, reason: collision with root package name */
    public Runnable f174913r;

    /* renamed from: s, reason: collision with root package name */
    public Runnable f174914s;

    /* renamed from: t, reason: collision with root package name */
    public a f174915t;

    public interface a {
    }

    public interface b {
    }

    public interface c {
    }

    public R2(a r3) {
        this.f174897a = false;
        this.f174898b = true;
        this.f174899c = false;
        this.d = true;
        this.f174900e = true;
        this.f174901f = true;
        this.f174902g = "Report a Bug";
        this.f174903h = "Send Bug Report";
        this.f174904i = "Cancel";
        this.f174905j = Constants.KEY_ENCRYPTION_NAME;
        this.f174906k = "Your Name";
        this.f174907l = "Email";
        this.f174908m = "your.email@example.org";
        this.f174909n = " (Required)";
        this.f174910o = "Description";
        this.f174911p = "What's the bug? What did you expect?";
        this.f174912q = "Thank you for your report!";
        this.f174915t = r3;
    }

    public void A(boolean r1) {
        this.f174898b = r1;
    }

    public void B(boolean r1) {
        this.f174900e = r1;
    }

    public CharSequence a() {
        return this.f174904i;
    }

    public CharSequence b() {
        return this.f174907l;
    }

    public CharSequence c() {
        return this.f174908m;
    }

    public CharSequence d() {
        return this.f174902g;
    }

    public CharSequence e() {
        return this.f174909n;
    }

    public CharSequence f() {
        return this.f174910o;
    }

    public CharSequence g() {
        return this.f174911p;
    }

    public CharSequence h() {
        return this.f174905j;
    }

    public CharSequence i() {
        return this.f174906k;
    }

    public Runnable j() {
        return this.f174914s;
    }

    public Runnable k() {
        return this.f174913r;
    }

    public c l() {
        return null;
    }

    public c m() {
        return null;
    }

    public CharSequence n() {
        return this.f174903h;
    }

    public CharSequence o() {
        return this.f174912q;
    }

    public boolean p() {
        return this.f174899c;
    }

    public boolean q() {
        return this.f174897a;
    }

    public boolean r() {
        return this.f174901f;
    }

    public boolean s() {
        return this.d;
    }

    public boolean t() {
        return this.f174898b;
    }

    public String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.f174897a + ", showName=" + this.f174898b + ", isEmailRequired=" + this.f174899c + ", showEmail=" + this.d + ", useSentryUser=" + this.f174900e + ", showBranding=" + this.f174901f + ", formTitle='" + this.f174902g + "', submitButtonLabel='" + this.f174903h + "', cancelButtonLabel='" + this.f174904i + "', nameLabel='" + this.f174905j + "', namePlaceholder='" + this.f174906k + "', emailLabel='" + this.f174907l + "', emailPlaceholder='" + this.f174908m + "', isRequiredLabel='" + this.f174909n + "', messageLabel='" + this.f174910o + "', messagePlaceholder='" + this.f174911p + "'}";
    }

    public boolean u() {
        return this.f174900e;
    }

    public void v(a r1) {
        this.f174915t = r1;
    }

    public void w(boolean r1) {
        this.f174899c = r1;
    }

    public void x(boolean r1) {
        this.f174897a = r1;
    }

    public void y(boolean r1) {
        this.f174901f = r1;
    }

    public void z(boolean r1) {
        this.d = r1;
    }

    public R2(R2 r3) {
        this.f174897a = false;
        this.f174898b = true;
        this.f174899c = false;
        this.d = true;
        this.f174900e = true;
        this.f174901f = true;
        this.f174902g = "Report a Bug";
        this.f174903h = "Send Bug Report";
        this.f174904i = "Cancel";
        this.f174905j = Constants.KEY_ENCRYPTION_NAME;
        this.f174906k = "Your Name";
        this.f174907l = "Email";
        this.f174908m = "your.email@example.org";
        this.f174909n = " (Required)";
        this.f174910o = "Description";
        this.f174911p = "What's the bug? What did you expect?";
        this.f174912q = "Thank you for your report!";
        this.f174897a = r3.f174897a;
        this.f174898b = r3.f174898b;
        this.f174899c = r3.f174899c;
        this.d = r3.d;
        this.f174900e = r3.f174900e;
        this.f174901f = r3.f174901f;
        this.f174902g = r3.f174902g;
        this.f174903h = r3.f174903h;
        this.f174904i = r3.f174904i;
        this.f174905j = r3.f174905j;
        this.f174906k = r3.f174906k;
        this.f174907l = r3.f174907l;
        this.f174908m = r3.f174908m;
        this.f174909n = r3.f174909n;
        this.f174910o = r3.f174910o;
        this.f174911p = r3.f174911p;
        this.f174912q = r3.f174912q;
        this.f174913r = r3.f174913r;
        this.f174914s = r3.f174914s;
        this.f174915t = r3.f174915t;
    }
}
