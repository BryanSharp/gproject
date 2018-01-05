package com.google.android.finsky.ac;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C0980g implements C0978f {
    public static final C0978f f5963a = new C0980g();

    private C0980g() {
    }

    public final void mo1172a(C4809e c4809e) {
        try {
            if (((Long) c4809e.get()).longValue() <= 0) {
                FinskyLog.m21669e("Could not content sync service task: %s", c4809e.get());
            }
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            FinskyLog.m21660a(e, "InterruptedException failed to run content sync", new Object[0]);
        } catch (Throwable e2) {
            FinskyLog.m21660a(e2, "ExecutionException failed to run content sync", new Object[0]);
        }
    }
}