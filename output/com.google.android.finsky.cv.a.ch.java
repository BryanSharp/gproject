package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.ch extends com.google.protobuf.nano.b
{

    public static volatile ch[] a;
    public int b;
    public String c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;

    ch() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.aO = 0;
        this.aP = -1;
    }

    public static ch[] aP_() {
        if (com.google.android.finsky.cv.a.ch.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.android.finsky.cv.a.ch.a == 0)
                    com.google.android.finsky.cv.a.ch.a = new ch[0];
                exit com.google.protobuf.nano.h.b;
            }
            catch (Throwable ex) {
                try {
                    exit com.google.protobuf.nano.h.b;
                }
                catch (Throwable ex) {
                    exit com.google.protobuf.nano.h.b;
                    throw ex;
                }
                throw ex;
            }
        }
        return com.google.android.finsky.cv.a.ch.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 16:
  4:            goto 27;
            case 24:
  4:            goto 40;
            case 32:
  4:            goto 53;
            case 40:
  4:            goto 66;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 24:    this.b = this.b | 1;
 26:    goto 0;
 31:    this.d = p0.i();
 37:    this.b = this.b | 2;
 39:    goto 0;
 44:    this.e = p0.i();
 50:    this.b = this.b | 4;
 52:    goto 0;
 57:    this.f = p0.e();
 63:    this.b = this.b | 8;
 65:    goto 0;
 70:    this.g = p0.e();
 76:    this.b = this.b | 16;
 78:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.b & 2)
            p0.a(2, this.d);
        if (this.b & 4)
            p0.a(3, this.e);
        if (this.b & 8)
            p0.a(4, this.f);
        if (this.b & 16)
            p0.a(5, this.g);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.b & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(4) + 1;
        if (this.b & 16)
            v0 = v0 + CodedOutputByteBufferNano.d(5) + 1;
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ch))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ch)p0;
                if ((this.b & 1) != (p0.b & 1))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.b & 2) != (p0.b & 2))
                    v0 = 0;
                else if (this.d != p0.d)
                    v0 = 0;
                else if ((this.b & 4) != (p0.b & 4))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.b & 8) != (p0.b & 8))
                    v0 = 0;
                else if (this.f != p0.f)
                    v0 = 0;
                else if ((this.b & 16) != (p0.b & 16))
                    v0 = 0;
                else if (this.g != p0.g)
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (p0.aO != 0 && !p0.aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(p0.aO);
            }
        }
        return v0;
    }

    public final int hashCode() {
        v1 = 1231;
        if (this.f != 0)
            v0 = 1231;
        else
            v0 = 1237;
        if (this.g == 0)
            v1 = 1237;
        v1 = ((v0 + ((((this.getClass().getName().hashCode() + 527) * 31 + this.c.hashCode()) * 31 + this.d) * 31 + this.e) * 31) * 31 + v1) * 31;
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + v1;
    }

}