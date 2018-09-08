package com.moxi.mougblog.base.serviceImpl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.moxi.mougblog.base.service.BaseService;


/**
 * BaseService 实现类（ 泛型：M 是  mapper(dao) 对象，T 是实体 ）
 * @author xuzhixiang
 * @date 2018年9月4日10:38:18
 * @param <T>
 */

public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T>  implements BaseService<T> {

}
