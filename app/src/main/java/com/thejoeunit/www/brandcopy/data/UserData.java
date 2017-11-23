package com.thejoeunit.www.brandcopy.data;

import java.io.Serializable;

/**
 * Created by the on 2017-11-23.
 */

public class UserData implements Serializable {

    private String email;
    private String nickName;
    private int userId;
    private String password;
    private boolean isManager; // 매니저모드인지 아닌지,

}
