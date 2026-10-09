package a2d20250321;

import a2d20250321.lil1;
import aai.liveness.Detector$DetectionType;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class l1il1 extends FrameLayout implements lil1.m {

    /* renamed from: a, reason: collision with root package name */
    public final lil1 f1555a;

    /* renamed from: b, reason: collision with root package name */
    public n f1556b;

    public l1il1(Context r2) {
        this(r2, null);
    }

    @Override // a2d20250321.lil1.m
    public void a(boolean r2) {
        this.f1556b.a(r2);
    }

    public void b(aai.liveness.impl.b r2) {
        this.f1555a.V(r2);
    }

    public boolean c() {
        return this.f1555a.h0();
    }

    public void d() {
        this.f1555a.i0();
    }

    public void e() {
        this.f1555a.j0();
    }

    public void f() {
        this.f1555a.k0();
    }

    public Detector$DetectionType getCurrentDetectionType() {
        return this.f1555a.d0();
    }

    public void setFrameCallback(lil1.j r2) {
        this.f1555a.Q(r2);
    }

    public void setLivenssCallback(aai.liveness.impl.a r2) {
        this.f1555a.T(r2);
    }

    public void setModelResultCallback(lil1.i r1) {
    }

    public void setOvalColor(int r2) {
        this.f1556b.b(r2);
    }

    public void setPrepareMillSeconds(long r2) {
        this.f1555a.P(r2);
    }

    public void setSoundPlayEnable(boolean r2) {
        this.f1555a.setSoundPlayEnable(r2);
    }

    public l1il1(Context r2, AttributeSet r3) {
        super(r2, r3);
        setBackgroundColor(-1);
        lil1 r32 = new lil1(r2);
        this.f1555a = r32;
        addView(r32);
        n r02 = new n(r2);
        this.f1556b = r02;
        addView(r02);
        r32.R(this);
    }
}
