package com.midtrans.sdk.uikit.models;

import android.text.TextUtils;
import com.midtrans.sdk.corekit.models.snap.Installment;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public Installment f42769a;

    /* renamed from: b, reason: collision with root package name */
    public String f42770b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f42771c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42772e;

    public c() {
        this.f42771c = new ArrayList();
    }

    public String a() {
        return this.f42770b;
    }

    public int b(int r2) {
        return ((Integer) this.f42771c.get(r2)).intValue();
    }

    public int c() {
        return this.d;
    }

    public ArrayList d(String r4) {
        if (f() == false) goto L11;
        Iterator<String> r02 = this.f42769a.getTerms().keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L16;
        String r1 = r02.next();
        if (r1.equals(r4) == false) goto L6;
        this.f42770b = r4;
        this.f42771c.clear();
        this.f42771c.add(0, 0);
        this.f42771c.addAll(this.f42769a.getTerms().get(r1));
        return this.f42771c;
    L16:
        return null;
    L11:
        return null;
    }

    public final void e() {
        Installment r02 = this.f42769a;
        if (r02 != null) goto L5;
    L9:
        boolean r03 = false;
    L10:
        this.f42772e = r03;
        return;
    L5:
        if (r02.getTerms() == null) goto L9;
        if (this.f42769a.getTerms().isEmpty() == true) goto L9;
        r03 = true;
        goto L10
    }

    public boolean f() {
        return this.f42772e;
    }

    public boolean g() {
        Installment r02 = this.f42769a;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.isRequired() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean h() {
        if (f() == true) goto L5;
        return true;
    L5:
        if (this.f42769a.isRequired() == true) goto L7;
        return true;
    L7:
        if (this.d != 0) goto L9;
        return false;
    L9:
        if (TextUtils.isEmpty(this.f42770b) == false) goto L16;
        return false;
    L16:
        return true;
    }

    public boolean i() {
        if (d("offline") != null) goto L5;
        return false;
    L5:
        if (d("offline").isEmpty() == true) goto L10;
        return true;
    L10:
        return false;
    }

    public void j(Installment r1) {
        this.f42769a = r1;
        e();
    }

    public void k(int r2) {
        if (this.f42771c.size() != 0) goto L5;
        int r22 = 0;
    L6:
        this.d = r22;
        return;
    L5:
        r22 = ((Integer) this.f42771c.get(r2)).intValue();
        goto L6
    }
}
