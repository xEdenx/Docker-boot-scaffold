package com.tneciv.module;

/**
 * Created by Tneciv on 2016/10/4.
 */
public interface HelloService {
    HelloEntity getEntity(String key, String val);
    
    HelloEntity testMybatis();
}
