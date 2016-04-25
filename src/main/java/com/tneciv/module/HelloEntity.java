package com.tneciv.module;

import java.io.Serializable;

/**
 * Created by Tneciv on 2016/10/4.
 */
public class HelloEntity implements Serializable {
    private static final long serialVersionUID = -6333231828908844221L;
    private String hello;
    private String world;

    public HelloEntity(String hello, String world) {
        this.hello = hello;
        this.world = world;
    }

    public String getHello() {
        return hello;
    }

    public HelloEntity setHello(String hello) {
        this.hello = hello;
        return this;
    }

    public String getWorld() {
        return world;
    }

    public HelloEntity setWorld(String world) {
        this.world = world;
        return this;
    }
}
