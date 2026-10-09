package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f22970a;

    public k(Object r1) {
        this.f22970a = (LocaleList) r1;
    }

    @Override // androidx.core.os.j
    public String a() {
        return this.f22970a.toLanguageTags();
    }

    @Override // androidx.core.os.j
    public Object b() {
        return this.f22970a;
    }

    public boolean equals(Object r2) {
        return this.f22970a.equals(((j) r2).b());
    }

    @Override // androidx.core.os.j
    public Locale get(int r2) {
        return this.f22970a.get(r2);
    }

    public int hashCode() {
        return this.f22970a.hashCode();
    }

    @Override // androidx.core.os.j
    public boolean isEmpty() {
        return this.f22970a.isEmpty();
    }

    @Override // androidx.core.os.j
    public int size() {
        return this.f22970a.size();
    }

    public String toString() {
        return this.f22970a.toString();
    }
}
