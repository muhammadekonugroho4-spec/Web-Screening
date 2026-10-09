package id.zelory.compressor;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f174452a;

    /* renamed from: b, reason: collision with root package name */
    public int f174453b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.CompressFormat f174454c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f174455e;

    public a(Context r2) {
        this.f174452a = 612;
        this.f174453b = 816;
        this.f174454c = Bitmap.CompressFormat.JPEG;
        this.d = 80;
        this.f174455e = r2.getCacheDir().getPath() + File.separator + "images";
    }

    public File c(File r2) {
        return d(r2, r2.getName());
    }

    public File d(File r7, String r8) {
        return b.b(r7, this.f174452a, this.f174453b, this.f174454c, this.d, this.f174455e + File.separator + r8);
    }

    public a e(Bitmap.CompressFormat r1) {
        this.f174454c = r1;
        return this;
    }

    public a f(int r1) {
        this.f174453b = r1;
        return this;
    }

    public a g(int r1) {
        this.f174452a = r1;
        return this;
    }

    public a h(int r1) {
        this.d = r1;
        return this;
    }
}
