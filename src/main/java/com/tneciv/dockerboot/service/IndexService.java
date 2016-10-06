package com.tneciv.dockerboot.service;

import com.tneciv.dockerboot.entity.Boot;

import java.util.List;

/**
 * Created by Tneciv on 2016/10/5.
 */
public interface IndexService {
    List<Boot> doSth();

    void insertSth(Boot boot);
}
