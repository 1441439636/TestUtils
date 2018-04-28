package cn.testutils.service.impl;

import cn.testutils.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by ZLS on 2018/4/27.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {
    @Override
    public String getDemo() {
        return "Demo1";
    }
}
