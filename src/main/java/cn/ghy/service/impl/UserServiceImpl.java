package cn.ghy.service.impl;

import cn.ghy.entity.User;
import cn.ghy.mapper.UserMapper;
import cn.ghy.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author Ziyang
 * @since 2018-09-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
