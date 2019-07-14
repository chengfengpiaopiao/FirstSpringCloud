package com.chengfeng.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chengfeng.model.entity.Student;

import java.util.List;

/**
 * <pre>
 *     Created by 2019/7/14 @author Gracie
 *     e-mail : 13574845807@163.com
 *     des :
 *     version:
 * </pre>
 */
public interface StudentDao extends BaseMapper<Student>{
    List<Student> queryAll();
}
