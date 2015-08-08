// Decompiled by DJ v3.7.7.81 Copyright 2004 Atanas Neshkov  Date: 20/06/2004 11:11:45 p.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) nonlb 
// Source File Name:   CheckSimpleLogon.java

package com.slort.tag;

import com.bdb.tag.CheckSimpleLogonTag;

public class CheckSimpleLogon extends CheckSimpleLogonTag {

    public CheckSimpleLogon() {
        super.setPageLogon("/logon.jsp");
    }

    public void release() {
        super.release();
        super.setPageLogon("/logon.jsp");
    }
}